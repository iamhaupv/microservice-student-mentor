package com.example.StudentService.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.StudentService.models.Mentor;
import com.example.StudentService.models.Student;
import com.example.StudentService.repositories.MentorRepositoty;
import com.example.StudentService.repositories.StudentRepository;
import com.example.StudentService.service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
	@Autowired
	private StudentService service;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private StudentRepository studentRepository;
	@GetMapping("/student/{id}")
	@Cacheable(key = "#id",value = "student")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return service.getAllStudent();
	}
	@GetMapping("/studentbymentor/{id}/{mentorId}")
	public ResponseEntity<MentorRepositoty> studentByMentor(@PathVariable Integer id,
			@PathVariable Integer mentorId) {
		MentorRepositoty mentorReponsitory = new MentorRepositoty();
		String url = "http://localhost:8082/api/v2/mentor/" + id;
		ResponseEntity<Mentor> reponse = restTemplate.getForEntity(url, Mentor.class);
		Optional<Student> optional = studentRepository.findById(mentorId);
		Student student = null;
		if (optional.isPresent()) {
			student = optional.get();
		} else {
			new RuntimeException("Khong co user theo id này");
		}
		Mentor mentor = reponse.getBody();
		mentorReponsitory.setMentor(mentor);
		mentorReponsitory.setStudent(student);
		return new ResponseEntity<MentorRepositoty>(mentorReponsitory, HttpStatus.OK);
	}
}

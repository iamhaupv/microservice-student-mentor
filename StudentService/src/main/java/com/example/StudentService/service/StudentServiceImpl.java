package com.example.StudentService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentService.models.Student;
import com.example.StudentService.repositories.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository repository;
	@Override
	public List<Student> getAllStudent() {
		return repository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return repository.findById(id).get();
	}

}

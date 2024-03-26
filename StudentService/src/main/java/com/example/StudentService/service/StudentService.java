package com.example.StudentService.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.StudentService.models.Student;
@Service
public interface StudentService {
	@Cacheable("students")
	public List<Student> getAllStudent();
	public Student getStudentById(int id);
}

package com.example.StudentService.repositories;

import com.example.StudentService.models.Mentor;
import com.example.StudentService.models.Student;

public class MentorRepositoty {
	private Student student;
	private Mentor mentor;
	public MentorRepositoty() {
		// TODO Auto-generated constructor stub
	}
	public MentorRepositoty(Student student, Mentor mentor) {
		super();
		this.student = student;
		this.mentor = mentor;
	}
	@Override
	public String toString() {
		return "MentorRepositoty [student=" + student + ", mentor=" + mentor + "]";
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Mentor getMentor() {
		return mentor;
	}
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
}

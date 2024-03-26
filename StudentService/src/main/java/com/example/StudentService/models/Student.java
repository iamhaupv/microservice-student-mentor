package com.example.StudentService.models;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String name;
	private int age;
	@ManyToOne
	@JoinColumn(name = "mentorId")
	private Mentor mentor;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + "]";
	}
	public Student(int studentId, String name, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}
	
	
}

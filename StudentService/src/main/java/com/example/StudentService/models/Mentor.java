package com.example.StudentService.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mentor")
public class Mentor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int mentorId;
	private String name;
	private String address;
	@OneToMany(mappedBy = "mentor")
	private List<Student> students;
	public Mentor() {
		// TODO Auto-generated constructor stub
	}
	public int getMentorId() {
		return mentorId;
	}
	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", name=" + name + ", address=" + address + ", students=" + students
				+ "]";
	}
	public Mentor(int mentorId, String name, String address, List<Student> students) {
		super();
		this.mentorId = mentorId;
		this.name = name;
		this.address = address;
		this.students = students;
	}
	
}

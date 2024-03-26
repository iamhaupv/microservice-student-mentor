package com.example.MentorService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="mentor")
public class Mentor {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	public int mentorId;
	private String name;
	private String address;
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
	public Mentor(int mentorId, String name, String address) {
		super();
		this.mentorId = mentorId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", name=" + name + ", address=" + address + "]";
	}
}

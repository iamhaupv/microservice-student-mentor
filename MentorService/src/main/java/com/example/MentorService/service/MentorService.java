package com.example.MentorService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MentorService.models.Mentor;
@Service
public interface MentorService {
	public List<Mentor> getAllMentor();
	public Mentor getMentorById(int id);
}

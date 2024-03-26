package com.example.MentorService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MentorService.models.Mentor;
import com.example.MentorService.repositories.MentorRepositoy;
@Service
public class MentorServiceImpl implements MentorService{
	@Autowired
	private MentorRepositoy repositoy;
	@Override
	public List<Mentor> getAllMentor() {
		return repositoy.findAll();
	}

	@Override
	public Mentor getMentorById(int id) {
		return repositoy.findById(id).get();
	}

}

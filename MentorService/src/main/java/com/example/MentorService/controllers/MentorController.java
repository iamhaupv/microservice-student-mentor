package com.example.MentorService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MentorService.models.Mentor;
import com.example.MentorService.service.MentorService;

@RestController
@RequestMapping("/api/v2")
public class MentorController {
	@Autowired
	private MentorService service;
	@GetMapping("/mentor")
	public List<Mentor> getMentor() {
		return service.getAllMentor();
	}
	@GetMapping("/mentor/{id}")
	public Mentor getMentorById(@PathVariable int id) {
		return service.getMentorById(id);
	}
}

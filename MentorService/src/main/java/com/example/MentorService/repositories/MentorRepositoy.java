package com.example.MentorService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.MentorService.models.Mentor;
@Repository
@Transactional
public interface MentorRepositoy extends JpaRepository<Mentor, Integer>{

}

package com.example.StudentService.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.StudentService.models.Student;
@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

package com.group.SpringJDBCEx.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.group.SpringJDBCEx.model.Student;
import com.group.SpringJDBCEx.repository.StudentRepo;

@Service
public class StudentService {
	
		 @Autowired
		 private StudentRepo repo;
	


	public StudentRepo getRepo() {
		return repo;
	}

	
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}
	

	public void addStudent(Student s){
		repo.save(s);
		
	}

	public List<Student> getStudents() {
		
		return repo.findAll();
	}
	

}

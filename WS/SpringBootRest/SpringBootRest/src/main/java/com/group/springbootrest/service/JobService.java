package com.group.springbootrest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.group.springbootrest.model.JobPost;
import com.group.springbootrest.repo.JobRepo;



@Service
public class JobService {
	
	@Autowired
	private JobRepo repo;
		
	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);
	}
	
	public List<JobPost>getAllJobs(){
		System.out.println("jobs");
		return repo.getAllJobs();
	}
}

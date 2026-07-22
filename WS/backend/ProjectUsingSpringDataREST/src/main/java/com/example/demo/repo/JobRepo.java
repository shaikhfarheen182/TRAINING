package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.JobPost;



@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer>{





}
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Student;



@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExampleApplication.class, args);
		
		
		StudentRepo repo = context.getBean(StudentRepo.class);
//		
//		Student s1 = new Student();
//		Student s2 = new Student();
		Student s3 = new Student();
//		
//		
//		s1.setRollNo(1);
//		s1.setName("FARHEEN");
//		s1.setMarks(80);
//		
//		
//		s2.setRollNo(2);
//		s2.setName("ARYA");
//		s2.setMarks(80);
//		
//		
		s3.setRollNo(3);
		s3.setName("ZAKIR");
		s3.setMarks(85);
//		
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
		repo.delete(s3);//delete data
		
//		System.out.println(repo.findAll());
//		System.out.println(repo.findById(2));
		
//		System.out.println(repo.findById(5));//optional.empty since data is not present
		
//		System.out.println(repo.findByName("FARHEEN"));
//		System.out.println(repo.findByMarks(80));
//		System.out.println(repo.findByMarksGreaterThan(70));
		
		
		
		
	}

}

package com.group.SpringJDBCEx;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.group.SpringJDBCEx.model.Student;
import com.group.SpringJDBCEx.service.StudentService;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class);
        
        Student s = context.getBean(Student.class);
        s.setRollNo(5);
        s.setName("FARHEEN");
        s.setMarks(78);
        
        StudentService service = context.getBean(StudentService.class);
        
        service.addStudent(s);
        
        List<Student> students = service.getStudents();
        System.out.println(students);
       
    }
}
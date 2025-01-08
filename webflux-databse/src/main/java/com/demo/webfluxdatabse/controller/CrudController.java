package com.demo.webfluxdatabse.controller;

import com.demo.webfluxdatabse.entity.Student;
import com.demo.webfluxdatabse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class CrudController {


    @Autowired
    private StudentService studentService;


    @GetMapping("/count")
    public Flux<Student> getAllStudents(){
        return studentService.findAll();
    }


    @GetMapping("/redis")
    public Flux<Student> getAllStudentsRedis(){
        return studentService.findAll();
    }

}

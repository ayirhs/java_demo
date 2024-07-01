package com.shriya.demo.controller;


import dto.Student;
import dto.StudentInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/my") // goes to class from /my in localhost
public class MyController {

    @GetMapping("/hello")  //tells that it support get method
    public ResponseEntity<String> printHello(){
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getById(@PathVariable("id")Integer id){
        return ResponseEntity.ok("Hello"+id);
    }
    @GetMapping("/myget")
    public ResponseEntity<String> myget(@RequestParam Integer id){
        return ResponseEntity.ok("Hello"+id);
    }

    @PostMapping("/mypost")
    public ResponseEntity<String> post(@RequestBody Student student){
        return ResponseEntity.ok("Hello"+student.getName());

    }

    @PostMapping("/mypostwithfile")
    public ResponseEntity<String> postWithFile(@ModelAttribute StudentInfo student){
        return ResponseEntity.ok(String.valueOf(student.getFile()));
    }


}





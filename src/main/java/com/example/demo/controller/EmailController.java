package com.example.demo.controller;

import com.example.demo.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor

public class EmailController {
    private final EmailService emailservice;



    @GetMapping("/simple")
    public ResponseEntity<String> simple()
    {
        emailservice.sendSimpleMail();
        return ResponseEntity.ok("Sent");
    }
}

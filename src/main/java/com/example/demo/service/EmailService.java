package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class EmailService {

    private final JavaMailSender mailSender;

    public void sendSimpleMail(){

        SimpleMailMessage message=new SimpleMailMessage();
        message.setTo("sntosimagar36@gmail.com");
        message.setSubject("test");
        message.setText("hello world");
        mailSender.send(message);

    }



}

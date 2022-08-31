package com.example.demo.services.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Service;
import com.example.demo.services.HelloService;

@Service
public class HelloServiceImpl implements HelloService{

    @Override
    public String hora() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_TIME).substring(0, 5);
    }
}

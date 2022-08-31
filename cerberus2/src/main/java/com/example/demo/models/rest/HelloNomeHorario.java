package com.example.demo.models.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.HelloService;

import io.swagger.v3.oas.annotations.Operation;


@RestController
public class HelloNomeHorario {
    
    @Autowired
    HelloService helloService;
    
    Logger logger = LoggerFactory.getLogger(HelloNomeHorario.class);

    
    @Operation(description = "Dizer 'Hello' e horário atual ao usuário.")
    @RequestMapping(path="/hello/{nome}/horario", method = RequestMethod.GET)
    public ResponseEntity<String> hello(@PathVariable String nome) {
        // LoggingController log = new LoggingController();
        // log.index();
        logger.warn("TESTE LOG WARNING");
        return ResponseEntity.status(HttpStatus.OK).body("Hello, " + nome + "!" 
        + " Agora são " + helloService.hora() + ", não esqueça!");
    }
}
package com.example.crudmicroservicedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/greetings")
public class GreetingsController {

    final GreetingRepository greetingRepository;

    public GreetingsController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @GetMapping
    public List<Greeting> getAllGreetings(){
        return greetingRepository.findAll();
    }

    @GetMapping("/populate")
    public void populate(){
        var allGreetings = new ArrayList<Greeting>();
        allGreetings.add(new Greeting("hello"));
        allGreetings.add(new Greeting("hola"));
        greetingRepository.saveAll(allGreetings);
    }
}

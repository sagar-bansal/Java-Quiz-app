package com.sagar.quizzapp.controller;

import com.sagar.quizzapp.service.QuizService;
import com.sagar.quizzapp.service.QuizzService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizzService service;
    @PostMapping("create")
    public ResponseEntity<String> create(@RequestParam String category, @RequestParam String numberOfQuestions, @RequestParam String name )
    {
        return service.create(category,numberOfQuestions,name);
    }
}

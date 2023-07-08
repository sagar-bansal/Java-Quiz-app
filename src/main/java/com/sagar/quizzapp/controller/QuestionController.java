package com.sagar.quizzapp.controller;

import com.sagar.quizzapp.model.Question;
import com.sagar.quizzapp.service.QuizService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuizService service;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return new ResponseEntity<List<Question>>(service.getAllQuestions(),
            HttpStatus.OK);
    }
    @GetMapping("category/{cat}")
    public List<String> getCategoryList(@PathVariable("cat") String categoryName){
        return new ArrayList<>();
    }
    @PostMapping("add")
    public ResponseEntity<String> addNewQuestion(@RequestBody Question question){
        return service.addQuestion(question);
    }
}

package com.sagar.quizzapp.service;

import com.sagar.quizzapp.dao.QuizDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuizzService {
    @Autowired
    QuizDao dao;
    public ResponseEntity<String> create(String name, String topic,String numberOfQuestions){
       try {
           return new ResponseEntity<>(null, HttpStatus.OK);
       }catch(Exception e){
           e.printStackTrace();
       }
       return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    }
}

package com.sagar.quizzapp.service;

import com.sagar.quizzapp.dao.QuestionDao;
import com.sagar.quizzapp.model.Question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
    @Autowired
    QuestionDao dao;
    public List<Question> getAllQuestions(){

        return dao.findAll();
    }

    public ResponseEntity<String> addQuestion(Question question) {
        try {

            return new ResponseEntity<>("success", HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Error",HttpStatus.BAD_REQUEST);
    }
}

package com.sagar.quizzapp.dao;

import com.sagar.quizzapp.model.Question;
import com.sagar.quizzapp.model.Quiz;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer> {

    @Query(value="SELECT * From questions q where q.category=:category ORDER BY RANDOM() LIMIT :numOfQuestions",nativeQuery = true)
    public List<Question> findQuestion();
}

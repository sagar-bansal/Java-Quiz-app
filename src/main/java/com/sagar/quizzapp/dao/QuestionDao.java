package com.sagar.quizzapp.dao;

import com.sagar.quizzapp.model.Question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
    public List<Question> findByCategory();
}

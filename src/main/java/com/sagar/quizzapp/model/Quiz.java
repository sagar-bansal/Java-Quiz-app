package com.sagar.quizzapp.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Quiz {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String title;
    String name;
    String numOfQuestions;
    @ManyToMany
     List<Question> questions;
}

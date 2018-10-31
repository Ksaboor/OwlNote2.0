package com.khalilpersonal.owlnote.OwlNote20.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String question;

    public Question(){}

    public Question(String question){
        this.question = question;
    }
}

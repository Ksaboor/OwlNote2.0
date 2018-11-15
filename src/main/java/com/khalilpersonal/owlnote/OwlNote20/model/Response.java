package com.khalilpersonal.owlnote.OwlNote20.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Responses")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String response;

    public Response(){}

    public Response(String response){
        this.response = response;
    }
}

package com.khalilpersonal.owlnote.OwlNote20.repository;

import com.khalilpersonal.owlnote.OwlNote20.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}

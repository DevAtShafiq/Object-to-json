package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonTypeId;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity(name = "Book")
@Table(name="book")


public class Book  {

    @Id
    @GeneratedValue
    private Long id;
    @NaturalId
    private String isbn;






}

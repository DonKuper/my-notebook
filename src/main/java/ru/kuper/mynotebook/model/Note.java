package ru.kuper.mynotebook.model;

import javax.persistence.*;

@Entity
public class Note {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String content;


}

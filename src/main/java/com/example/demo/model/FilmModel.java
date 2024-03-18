package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table (name = "films")
public class FilmModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;

    @ManyToOne
    @JoinColumn
    private GenreModel genreModel;
}

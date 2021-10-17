package ru.netology.domain;


import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@DataAmount
@NoArgsConstructor
@AllArgsConstructor
public class MoviePoster {
    private int id;
    private int movieId;
    private String movieName;
}

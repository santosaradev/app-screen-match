package br.com.alura.screenmatch.model;

public class Movie extends Title {
    private String director;

    public Movie(String name, int year, int duration, boolean included) {
        super(name, year, duration, included);
    }

}

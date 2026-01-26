package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.interfaces.Classifiable;

public class Movie extends Title implements Classifiable {
    private String director;

    public Movie(String name, int year, int duration, boolean included) {
        super(name, year, duration, included);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) calculateMean(getRatings()) / 2;
    }
}

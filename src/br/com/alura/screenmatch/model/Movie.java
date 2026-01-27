package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.interfaces.Classifiable;

public class Movie extends Title implements Classifiable {
    private String director;

    public Movie(String name, int year) {
        super(name, year);
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

    @Override
    public void showTechnicSlip() {
        super.showTechnicSlip();
        System.out.println("Diretor: " + director);
    }
}

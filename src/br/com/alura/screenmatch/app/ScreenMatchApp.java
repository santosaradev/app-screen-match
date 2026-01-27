package br.com.alura.screenmatch.app;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;

public class ScreenMatchApp {
    public static void main(String[] args) {
        Movie movie = new Movie("O Poderoso Chefão", 1972);

        movie.setDirector("Francis Ford Coppola");
        movie.setDurationMinutes(177);
        movie.setIncluded(true);

        System.out.println("Ficha técnica do filme");

        movie.showTechnicSlip();

        Serie serie = new Serie("Lost", 2004);

        System.out.println("\nFicha técnica da série");

        serie.setSeason(6);
        serie.setEpisode(121);
        serie.setMinutesEpisode(40);
        serie.setDurationMinutes(40);

        serie.showTechnicSlip();

    }
}

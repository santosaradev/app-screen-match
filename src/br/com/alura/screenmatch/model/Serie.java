package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.interfaces.Classifiable;

public class Serie extends Title implements Classifiable {
    private int season;
    private int episode;
    private boolean active;
    private int minutesEpisode;

    public Serie(String name, int year, int duration, boolean included) {
        super(name, year, duration, included);
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }

    @Override
    public int getDurationMinutes() {
        return season * episode * minutesEpisode;
    }

    @Override
    public void showTechnicSlip() {
        super.showTechnicSlip();
        System.out.println("Temporadas: " + season);
        System.out.println("Episódios: " + episode);
        System.out.println("Minutos por episódio: " + minutesEpisode);
    }

    @Override
    public int getRating() {
        return 0;
    }
}

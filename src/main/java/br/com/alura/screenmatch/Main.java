package br.com.alura.screenmatch;

import br.com.alura.screenmatch.view.ScreenMatchView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ScreenMatchView().start();
    }
}

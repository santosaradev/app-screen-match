package br.com.alura.screenmatch.view;

import br.com.alura.screenmatch.controller.ScreenMatchController;
import br.com.alura.screenmatch.model.TitleOmdb;

import java.io.IOException;
import java.util.Scanner;

public class ScreenMatchView {
    private final ScreenMatchController controller = new ScreenMatchController();
    private final Scanner scanner = new Scanner(System.in);

    public void start() throws IOException, InterruptedException {
        System.out.println("Digite o filme: ");
        String title = scanner.nextLine();

        TitleOmdb titleOmdb = controller.getTitle(title);

        System.out.println(titleOmdb.title());
        System.out.println(titleOmdb.year());
    }
}

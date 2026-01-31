package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.model.TitleOmdb;
import br.com.alura.screenmatch.model.repository.ScreenMatchRepository;
import br.com.alura.screenmatch.service.ScreenMatchService;

import java.io.IOException;

public class ScreenMatchController {
    private final ScreenMatchService service;
    private final ScreenMatchRepository repository;

    public ScreenMatchController() {
        this.service =  new ScreenMatchService();
        this.repository = new ScreenMatchRepository();
    }

    public void saveData(String title){
        try{
            TitleOmdb titleOmdb = service.titleSearch(title);
            repository.save(titleOmdb);

            System.out.println("Operação realizada com sucesso!");
        }catch (Exception e){
            System.out.println("Erro no processo: " + e.getMessage());
        }
    }
}

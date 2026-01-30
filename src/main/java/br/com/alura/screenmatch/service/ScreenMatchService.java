package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ScreenMatchService {
    public TitleOmdb titleSearch (String title) throws IOException, InterruptedException {
        try{
            String encodeSearch = URLEncoder.encode(title, StandardCharsets.UTF_8);
            String url = "https://www.omdbapi.com/?t="+encodeSearch+"&apikey=12a45813";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            if (response.statusCode() == 404){
                System.out.println("Informação não encontrada.");
            }

            TitleOmdb titleOmdb = gson.fromJson(json, TitleOmdb.class);
            return  titleOmdb;

        }catch (IllegalArgumentException e){
            throw new RuntimeException("Título não encontrado");
        }catch (Exception e){
            throw new RuntimeException("Erro ao acessar a API");
        }
    }
}

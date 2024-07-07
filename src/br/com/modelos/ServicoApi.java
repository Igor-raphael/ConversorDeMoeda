package br.com.modelos;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ServicoApi {

	
	
	public Double conversor (String moedaOrigem, String moedaDestino) {
	
	     Gson gson = new GsonBuilder()
		        	.create();
	
	
	try {
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create( "https://v6.exchangerate-api.com/v6/ed0339842259937ac84ba0c7/pair/" + moedaOrigem + "/" + moedaDestino))
				.build();
		
		HttpResponse<String> response = client
				.send(request, HttpResponse.BodyHandlers.ofString());
		
		
		
		if (response.statusCode() == 200) {
			
			String json = response.body();
			
			Filtro filtro = gson.fromJson(json, Filtro.class);
			
			return filtro.conversion_rate();
		
		} else {
			System.err.println("Não foi possivel realizar a conversao. " + response.statusCode());
			System.err.println("Verifique se a sigla da moeda esta correta!.");
			return null;
		}
		
	} catch (Exception e) {
	 	e.printStackTrace();
		return null;
	     
	}
	
	

	
	
 
	}
}

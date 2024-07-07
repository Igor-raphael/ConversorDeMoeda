package br.com.Main;


import java.io.IOException;
import java.util.Scanner;

import br.com.modelos.Calculos;
import br.com.modelos.Info;
import br.com.modelos.ServicoApi;

public class Main {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		
		Info info = new Info();
		ServicoApi api = new ServicoApi();
 		Calculos calc = new Calculos();
		
		String x = "";
		String y = "";
		
		System.out.println("***** Conversor de moedas *****\n"
				+ "Primeiro de tudo veremos todas as moedas suportadas e suas respectivas SIGLAS.");
        				System.out.println(info.leitor());	
		
		
		
		while(!x.equalsIgnoreCase("sair") || !y.equalsIgnoreCase("sair") ) {				
			
			System.out.println("Digite o nome da moeda a ser convertida: (EX : USD) ");
			 x = scanner.next();
			 
			 if (x.equalsIgnoreCase("sair")) {
					break;
				}
				
			 
			System.out.println("Digite o nome da moeda para qual sera feita a conversão: (EX: BRL) ");
			 y = scanner.next();
			
			 if (y.equalsIgnoreCase("sair")) {
					break;
				}
				
			 
			
			System.out.println("Digite o valor da conversão: ");
			double q = scanner.nextDouble();
			
			Double cambio = api.conversor(x, y);
			
			System.out.println(calc.calculo(cambio, q) + "\n");
			
		}
		
		System.out.println("Até mais!");
		  scanner.close();
		   
		  
		
	}
}

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
		
		System.out.println("***** CONVERSOR DE MOEDAS *****");
        				System.out.println(info.leitor());	
		
		System.out.println("Caso necessite, digite SAIR para fechar o programa!.\n");
		
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
				
			 			
			System.out.println("Digite o valor da conversão: (EX: 5 ou 5,0) ");
			double q = scanner.nextDouble();
			
			
			Double cambio = api.conversor(x, y);
			
			
			System.out.println(calc.calculo(cambio, q) + "\n");
					
		}
		
		System.out.println("Até mais!");
		  scanner.close();
		   
		  
		
	}
}

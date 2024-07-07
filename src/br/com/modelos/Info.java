package br.com.modelos;

import java.io.File;
import java.io.FileReader;


public class Info {
	
	
	public char leitor () {
		
		File file = new File("Todas as moedas suportadas.txt");
		
		try (FileReader leitor = new FileReader(file))   {
			
			int i;
			while ((i = leitor.read()) != -1) {
				System.out.print((char) i);	
				
			}
			
			System.out.println();
			
				return 0;
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	
		
		
	}
	
}

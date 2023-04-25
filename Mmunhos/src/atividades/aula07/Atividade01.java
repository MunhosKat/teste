package atividades.aula07;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String Perg = "sim";
		
		while (Perg.equals("sim")) {
			System.out.println("Ola Mundo");
			
			System.out.println("Deseja ver novamente?");
            
			Perg = entrada.next();
		}
		
		System.out.println("FIM");
		

	}

}

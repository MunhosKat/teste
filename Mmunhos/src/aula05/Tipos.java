package aula05;

import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		
		float preco = 10.99f; // f no final ou type cast
		float preco2 = (float) 12.90;
		
		System.out.println("float 1: " + preco);
		System.out.println("float 2: " + preco2);
		
		 int precoInteiro = (int) 2.50; //type cast
		 System.out.println("Valor Inteiro: " + precoInteiro);
		 
		 int numeroX = 6;
		 double numeroXDouble = numeroX;
		 System.out.println(numeroX);
		 System.out.println(numeroXDouble);
		 
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Digite um numero:");
		 int numeroIn = (int) entrada.nextDouble();
		 
		 System.out.println(numeroIn);
		 
		 
		 
		 

	}

}

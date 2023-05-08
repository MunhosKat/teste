package atividades.aula07;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Insira um numero: ");
			int num = entrada.nextInt();
			
			for (int i =1; i < num; i++) {
			if (num % i ==0) {
				System.out.println(i + " e divisivel");
				
			}
			
				
			}
			System.out.println(num + " e divisivel");
			
			
	}

}

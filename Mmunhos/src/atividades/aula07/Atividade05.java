package atividades.aula07;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double maior = 0;
	
		for (int i = 1; i <= 12; i++) {
			System.out.println("Digite 12 numeros");
			double num = sc.nextDouble();
			
			if (num > maior) {
				maior = num;
			}
			
			
		}
		
		System.out.println(maior);
		sc.close();


	}

}

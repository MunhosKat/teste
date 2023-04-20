package exercicioaula06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu primeiro numero: ");
		
		int num1 = entrada.nextInt();
		
		System.out.println("Insira seu segundo numero: ");
		
		int num2 = entrada.nextInt();
		
		if (num1 == num2) {
			System.out.println("Seus numeros sao iguais!");
			
		} else {
			if (num1 > num2) {
				System.out.println("O seu maior numero e: " + num1);
			} else {
				System.out.println("O seu maior numero e: " + num2);
			}
		}
		
		entrada.close();

	}

}

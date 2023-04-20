package exercicioaula06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu primeiro numero: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Insira seu segundo numero: ");
		int num2 = entrada.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}
		
		entrada.close();
	}

}

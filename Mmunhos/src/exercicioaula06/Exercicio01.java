package exercicioaula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira seu numero:");
		
		int num = entrada.nextInt();
		
		if (num % 2 ==0) {
			System.out.println("O numero " + num + " e par");
		} else {
			System.out.println("O numero " + num + " e impar");
		}
		
		entrada.close();

	}

}

package atividades.aula07;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um valor inteiro positivo: ");
		int valor = scanner.nextInt();

		System.out.print("Valores pares entre 2 e " + valor + ": ");
		for (int i = 2; i <= valor; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}

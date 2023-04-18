package aula04Exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite sua idade: ");

		int idade = entrada.nextInt();

		System.out.println("Olá, " + nome + " você tem " + idade + " anos ");
	}

}

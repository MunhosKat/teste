package exercicioaula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu ano de nascimento: ");
		int anoNasc = entrada.nextInt();
		
		System.out.println("Insira o ano atual: ");
		int anoAtual = entrada.nextInt();
		
		int idade = anoAtual - anoNasc;
		
		if (idade == 18) {
			System.out.println("Voce e obrigado a votar!");
		} else {
			if (idade == 16 || idade ==17 || idade >= 70) {
				System.out.println("Voce nao e obrigado a votar!");
			} else {
				System.out.println("Voce nao pode votar");
			}
		}
		
			
		
		entrada.close();
	}

}

package logica.aulas.aula10;

import java.util.Scanner;
// METODOS SEM ARGUMENTOS E SEM RETORNO
public class Metodos {
	
	static void saudacao() {
		System.out.println("Bem vindo ao programa");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite a sua idade");
		int idade = sc.nextInt();
		
		System.out.printf("Ola, %s! Voce tem %d anos", nome, idade);
		
		if (idade >= 18) {
			System.out.println(" Maior de idade");
		} else {
			System.out.println(" Menor de idade");
		}
	}

	public static void main(String[] args) {
		
		saudacao();
		saudacao();
		

	}

}

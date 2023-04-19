package logicaaula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		System.out.println("Insira seu nome: ");
		Scanner entrada = new Scanner(System.in);
		
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu genero: (F) Feminino, (M) Masculino, (O) Outro, (N) Não responder");
		
		char gen = entrada.nextLine().charAt(0);
		
		System.out.println("Ola, " + nome + "! " + ", Voce escolheu genero: " + gen);
		
		
		
		
		
		
		
		

	}

}

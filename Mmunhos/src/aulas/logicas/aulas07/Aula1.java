package aulas.logicas.aulas07;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, soma = 0;
		
		System.out.print("Digite um numero: ");
		num = entrada.nextInt();
		soma += num;
		
		System.out.print("Digite um numero: ");
		num = entrada.nextInt();
		soma += num;
		
		System.out.print("Digite um numero: ");
		num = entrada.nextInt();
		soma += num;
		
		
		
		System.out.println("A soma e: " + soma);

	}

}

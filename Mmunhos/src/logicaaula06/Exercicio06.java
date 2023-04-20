package logicaaula06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a peça que voce deseja: ");
		
		String peca1 = entrada.next();
		
		
		System.out.print("Insira a quantidade do produto: ");
		
		int quantidade = entrada.nextInt();
		
		System.out.print("insira o valor do produto: ");
		double valor = entrada.nextDouble();
		
		double valorFinal = (quantidade * valor);
		
		String nome = peca1;
		
		System.out.println("Nome da peça:" + peca1);
		System.out.println("numero de pecas:" + quantidade);
		
		
		
		
       System.out.print("Insira a peça que voce deseja: ");
		
		String peca2 = entrada.next();
		
		
		System.out.print("Insira a quantidade do produto: ");
		
		int quantidade2 = entrada.nextInt();
		
		System.out.print("insira o valor do produto: ");
		double valor2 = entrada.nextDouble();
		
		double valorFinal2 = (quantidade * valor);
		
		String nome2 = peca2;
		
		System.out.println("Nome do produto: " + peca2);
		System.out.println("Numero de produto: " + quantidade2);
		

		
		double valortotal2 = valorFinal + valorFinal2;
		
		System.out.println("O valor dos seus produtos e: "+ valortotal2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
		
	}

}

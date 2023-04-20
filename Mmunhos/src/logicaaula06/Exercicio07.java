package logicaaula06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor do produto: ");
		
		double valor1 = entrada.nextDouble();
		
		System.out.println("Insira o valor pago: ");
		
		double valorPago = entrada.nextDouble();
		
		double valorFinal = valorPago - valor1;
		
		System.out.println("O troco e: "+ valorFinal);
		
		entrada.close();

	}

}

package logicaaula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor em real: ");
		float valorReal = entrada.nextFloat();
		
		float valorDolar = 4.97f;
		float valorEuro = 5.53f;
		float valorArge = 43.25f;
		float valorLibra = 0.16f;
		float valorIene = 26.63f;
		
		
		System.out.println("Real em dolar: " + valorReal / valorDolar);
		System.out.println("Real em euro: " + valorReal / valorEuro);
		System.out.println("Real em peso argentino: " + valorReal * valorArge);
		System.out.println("Real em libra esterlina: " + valorReal * valorLibra);
		System.out.println("Real em iene: " + valorReal * valorIene);
		
		entrada.close();
		
		
		

	}

}

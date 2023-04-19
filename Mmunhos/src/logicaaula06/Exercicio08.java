package logicaaula06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor em real: ");
		float valorReal = entrada.nextFloat();
		
		float valorDolar = 5.09f;
		
		
		System.out.println("Real em dolar: " + valorReal / valorDolar);
		
		
		

	}

}

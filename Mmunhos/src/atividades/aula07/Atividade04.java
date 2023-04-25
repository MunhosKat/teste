package atividades.aula07;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int num =0;
		int num2 =0;
		int num3 =0;
		
//		while (num <=0) {
//			System.out.println("Insira seu numero: ");
//			num++;
//			
//		} 
		
		
		
		do {
			System.out.println("Insira seu numero: ");
			num = entrada.nextInt();
			num2++;
			num3 = num3 + num;
		} while (num2 <=9);
		
		System.out.println("a soma do seus numeros e: " + num3);
		
		

	}

}

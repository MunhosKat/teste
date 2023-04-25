package aulas.logicas.aulas07;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira seu numero");
		int n = entrada.nextInt();
		
		int num = 1;
		
		while (num <= n) {
			System.out.println(num);
			num++;
			System.out.println(num);
		
		}
	}

}

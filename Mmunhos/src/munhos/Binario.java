package munhos;

import java.util.Scanner;

public class Binario {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o numero decimal");
		int num = entrada.nextInt();
		
		num &= 2;
		
		if (num >= 1) {
			System.out.println("boa");
		}
		else {
			System.out.println("uhum");
		}
		
		
		
		
		

	}

}

package logicaaula06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota do aluno: ");
		double nota1 = entrada.nextInt();
		
		System.out.println("Insira a segunda nota do aluno: ");
		double nota2 = entrada.nextInt();
		
		int p1 = 4;
	    int p2 = 6;
		
		double Media = (nota1 * p1) + (nota2 * p2) / 2;
		
		System.out.println(Media);
	}

}

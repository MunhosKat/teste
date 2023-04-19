package logicaaula06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota do aluno: ");
		
		double nota1 = entrada.nextInt();
		
		System.out.println("Insira a segunda nota do aluno: ");
		
		double nota2 = entrada.nextInt();
		
		double nota3 = nota1 + nota2;
		
		double nota4 = nota3 / 2;
		
		System.out.println("A nota do aluno é:" + nota4);
		
		
	}

}

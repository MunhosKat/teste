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
		
		double notaA = nota1 * 0.4;
		double notaB = nota2 * 0.6;
		double notaF = notaA / 10;
		double notaF1 = notaB / 10;
		double notaF2 = notaF1;
	
		
		System.out.println(notaF2);
		
		// medPond= (notaA*0,4) 4+6 ( notaB*0,6)
		
		entrada.close();
	}

}

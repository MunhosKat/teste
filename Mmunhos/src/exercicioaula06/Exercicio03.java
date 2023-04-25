package exercicioaula06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota do aluno: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Insira a segunda nota do aluno: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Insira a terceira nota do aluno: ");
		double nota3 = entrada.nextDouble();
		
		System.out.println("insira a quarta nota do aluno: ");
		double nota4 = entrada.nextDouble();
		
		
		double notaMedia = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Nota media:" + notaMedia);
		
		
		
		if (notaMedia >=7) {
			System.out.println("Aprovado");
		} else {
			if (notaMedia >= 5 || notaMedia ==7 ) {
				System.out.println("Recuperacao");
			} else {
				System.out.println("Reprovado");
			}
		}
		
		
		
		
		
		
		
		
	
		entrada.close();
		
		
		}

	}



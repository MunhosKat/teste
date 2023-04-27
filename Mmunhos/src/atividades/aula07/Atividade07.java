package atividades.aula07;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		double mediaTurma = 0;
		int mediaAlunos = 0;
		int alunosForaMedia =0;
		
		System.out.println("Insira a media da turma: ");
		mediaTurma = entrada.nextDouble();
		
		for (int i = 1; i <=20; i++) {
			 System.out.println("Insira a nota de cada aluno");
			 double nota = entrada.nextDouble();
			 
			 if (nota >= mediaTurma) {
				 mediaAlunos ++;
				 System.out.println("o total de alunos na media e: " + mediaAlunos);
			 } else {
				 alunosForaMedia++;
				 System.out.println("o total de alunos fora da media: " + alunosForaMedia);
			 }
	
			
			
			
			
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

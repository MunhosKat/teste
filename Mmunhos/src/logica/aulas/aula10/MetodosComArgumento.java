package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArgumento {

	// METODOS SEM RETORNO COM ARGUMENTOS/PARAMETROS
	
	static void saudacaocomArgs (String nome, int idade) {
		if (idade >= 18) {
			System.out.printf("Ola, %s! voce tem %d anos e eh maior de idade", nome, idade);
		} else {
			System.out.printf("Ola, %s! voce tem %d anos e eh menor de idade\n", nome, idade);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nomeDig = sc.next();
		
		System.out.print("Digite a sua idade");
		int idadeDig = sc.nextInt();
		
		
		
		saudacaocomArgs(nomeDig, idadeDig);
		sc.close();

	}

}

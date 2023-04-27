package logicaaula06;

import java.util.Scanner;

public class ExercicioDesafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idadeEmDias = entrada.nextInt();
		
		int anos = (int) idadeEmDias / 365;
	    System.out.println("Idade em anos: "+anos);
	    
	    int restoDias = idadeEmDias % 365;
	    
	    int meses = (int) restoDias / 30;
	    System.out.println("Idade em meses: " + meses);
	    
	    int dias = restoDias % 30;
	    System.out.println("Idade em dias: " + dias);
	    
	}

}

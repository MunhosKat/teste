package atividades.aula07;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.println("Insira seu numero: ");
         
        int num = entrada.nextInt();
        int num2 = 0;
        
        while (num2 <= 25) {
        	System.out.println(num + " x " + num2 + "= " + (num*num2));
        	num2++;
        }
	}

}

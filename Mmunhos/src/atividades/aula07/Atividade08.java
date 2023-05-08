package atividades.aula07;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int num =0;
		int num1 =20;
		int soma =0;
		
		System.out.println("Insira um numero inteiro: ");
		num = entrada.nextInt();
		
		
        do {
        	num++;
        	if (num > 0) {
        		System.out.println(num);
        	} else {
        //		System.out.println("errou");
        	}
        } while (num < num1); 
        
        
        for (int i=0; i < num; i++) {
        	num = num +1;
        	
        	
        	
        	soma = soma + num;
        }
        
        
        
        
        System.out.println(soma);
       
	}

}

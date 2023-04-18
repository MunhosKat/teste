package Munhos;
import java.util.Scanner;

public class projeto2 {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		System.out.println("Insira a distancia do inimigo: ");
		int distanciaInimigo = entrada.nextInt();
		
		if (distanciaInimigo >= 70) {
			System.out.println("DESATIVADO!");
		}
		else {
			System.out.println("ATIVADO!");
		}
		
		

	}

}

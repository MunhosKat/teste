package munhos;
import java.util.Scanner;

public class Projeto1 {

	public static void main(String[] args) {
	
       Scanner entrada =new Scanner(System.in);
       System.out.println("Digite seu número");
       int n1 = entrada.nextInt();
       int n2 = n1;
       
       System.out.println("Seu número é:"+ (n1));
       System.out.println("O Sucessor do seu número é: "+ (1 +n1));
       System.out.println("O Antecessor do seu número é: "+(-1 + n2));
       int n3 = n1 * 2;
       System.out.println("O Dobro do seu número é: " + n3);
       int n4 = n1 / 2;
       System.out.println("A metade do seu número é: "+ (n4));
       
       entrada.close();
		
	}

}

package logica.aulas.aulas09;

public class Atividade02 {

	public static void main(String[] args) {
		
		int[][] matriz = new int [4][5];
	
		int qtdLinhas = matriz.length;
		int qtdColunas = matriz[3].length;
		
		System.out.println("linhas: " + qtdLinhas);
		System.out.println("quantidade colunas: " + qtdColunas);
		
		for (int i = 0; i < qtdLinhas; i++) {
			System.out.println(matriz[i]);
			
			for (int j = 0; j < qtdColunas; j++) {
				System.out.println(j);
			}
		}

	}

}

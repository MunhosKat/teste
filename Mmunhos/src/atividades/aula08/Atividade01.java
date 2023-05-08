package atividades.aula08;

import java.util.Calendar;

public class Atividade01 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		int hora = c.get(Calendar.HOUR_OF_DAY);
		
		if (hora >= 6 && hora < 12) {
			System.out.println("Bom dia, Matheus");
		} else if (hora >=12 && hora < 18) {
			System.out.println("Boa tarde, Matheus");
		} else if (hora >= 18) {
			System.out.println("Boa noite, Matheus");
		}

	}

}
// c.get(Calendar.HOUR_OF_DAY);
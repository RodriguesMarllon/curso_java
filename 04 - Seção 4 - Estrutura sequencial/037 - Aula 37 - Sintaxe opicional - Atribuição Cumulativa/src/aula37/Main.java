package aula37;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int minutos = 0;
		double valor = 50.0;
		
		System.out.println("Quanto voce consumiu este mes? ");
		minutos = sc.nextInt();
		
		if (minutos < 100) {
			System.out.printf("Sua conta este mês é igual a R$ %.2f", valor);
		} else {
			valor += (minutos - 100) * 2;
			System.out.printf("Voce consumiu acima de 100 minutos este mês, portanto sua conta ficou R$ %.2f", valor);
		}
		
		sc.close();
	}

}

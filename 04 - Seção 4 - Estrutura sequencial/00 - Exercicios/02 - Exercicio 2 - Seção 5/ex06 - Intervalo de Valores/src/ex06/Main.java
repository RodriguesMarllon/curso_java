package ex06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		double entrada;
	
		System.out.print("Digite um valor entre 0 e 100: ");
		entrada = sc.nextDouble();
		
		if (entrada <= 25.00 ) {
			System.out.println("Intervalo [0,25]");
		} else if (entrada <= 50.00) {
			System.out.println("Intervalo [25,50]");
		} else if (entrada <= 75.00) {
			System.out.println("Intervalo [50,75]");
		} else if (entrada <= 100.00) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();

	}

}

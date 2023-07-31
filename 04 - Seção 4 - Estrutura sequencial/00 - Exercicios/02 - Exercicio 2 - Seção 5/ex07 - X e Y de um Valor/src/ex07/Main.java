package ex07;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		Double x;
		Double y;
		
		System.out.print("Digite o valor de X com uma casa decimal: ");
		x = sc.nextDouble();
		System.out.print("Digite o valor de Y com uma casa decimal: ");
		y = sc.nextDouble();
		
		if (x > 0 && y >0) {
			System.out.println("Q1");
		} else if (y == 0.0 && x != 0.0) {
			System.out.println("Eixo X");
		} else if (x == 0.0 && y != 0.0) {
			System.out.println("Eixo Y");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else {
			System.out.println("Origem");
		}
		
		sc.close();

	}

}

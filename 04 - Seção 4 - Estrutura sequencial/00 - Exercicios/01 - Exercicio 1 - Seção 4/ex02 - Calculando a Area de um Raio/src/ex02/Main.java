package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner us = new Scanner (System.in).useLocale(Locale.US);
		
		double entrada;
		double saida;
		double pi;
		
		pi = 3.14159;
		
		System.out.print("Digite o valor do Raio do Circulo: ");
		entrada = us.nextDouble();
		
		saida = pi * Math.pow(entrada,2);
		
		System.out.printf(Locale.US,"O resultado é igual a: %.4f", saida);
		
		us.close();
		
	}

}

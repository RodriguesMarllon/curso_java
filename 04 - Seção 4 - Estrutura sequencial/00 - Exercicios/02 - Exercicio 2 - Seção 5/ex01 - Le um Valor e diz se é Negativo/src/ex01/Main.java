package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int entrada;
		
		System.out.print("Digite um valor: ");
		entrada = sc.nextInt();
		
		if (entrada < 0 ) {
			System.out.println("O valor que voce digitou é negativo.");
		} else {
			System.out.println("O valor que voce digitou é positivo.");
		}		
		
		sc.close();
	}

}

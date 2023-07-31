package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int entrada1;
		int entrada2;
		int resultado;
		
		
		System.out.print("Digite um número: ");
		
		entrada1 = sc.nextInt();
		
		System.out.print("Digite outro: ");
		entrada2 = sc.nextInt();
		
		resultado = entrada1 + entrada2;
		
		System.out.printf("A soma ente %d e %d é igual a %d", entrada1, entrada2, resultado);
		
		sc.close();
		
	}
}
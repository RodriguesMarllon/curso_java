package ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a;
		int b;
		int c;
		int d;
		int diferenca;
		
		System.out.print("Digite um número: ");
		
		a = sc.nextInt();
		
		System.out.print("Digite outro: ");
		b = sc.nextInt();
		
		System.out.print("Digite outro: ");
		c = sc.nextInt();
		
		System.out.print("Digite outro: ");
		d = sc.nextInt();
		
		diferenca = (a*b-c*d);
		
		System.out.printf("A diferença dos produtos %d e %d comparado aos  produtos %d e %d é igual a %d", a, b, c, d, diferenca);
		
		sc.close();
		
	}

}

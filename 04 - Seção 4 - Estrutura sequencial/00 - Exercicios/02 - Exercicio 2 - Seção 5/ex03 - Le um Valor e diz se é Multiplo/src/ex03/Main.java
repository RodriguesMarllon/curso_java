package ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A;
		int B;
		
		System.out.print("Digite um valor: ");
		A = sc.nextInt();
		System.out.print("Digite outro valor: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Os valores digitados são múltiplos");
		} else {
			System.out.println("Os valores digitados não são múltiplos");
		}
		
		sc.close();
	}

}

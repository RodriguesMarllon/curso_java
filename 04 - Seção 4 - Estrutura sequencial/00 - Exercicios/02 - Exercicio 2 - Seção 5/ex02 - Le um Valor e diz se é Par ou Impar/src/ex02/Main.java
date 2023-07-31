package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int entrada;
		
		System.out.print("Digite um valor: ");
		entrada = sc.nextInt();
		
		if (entrada % 2 == 0 ) {
			System.out.println("O valor é par.");
		} else {
			System.out.println("O valor é impar.");
		}
			
		sc.close();
	}

}

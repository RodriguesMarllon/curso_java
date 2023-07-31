package ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int codigo1;
		int quantidade1;
		double valor1;
		int codigo2;
		int quantidade2;
		double valor2;
		double resultado;
		
		codigo1 = sc.nextInt();
		System.out.printf("São quantas peças do produto %d? ", codigo1);
		quantidade1 = sc.nextInt();
		System.out.print("Quanto custou cada produto? ");
		valor1 = sc.nextDouble();
		
		System.out.print("Certo, diigite o código do produto 2: ");
		codigo2 = sc.nextInt();
		System.out.printf("Agora digite a quantidade de peças do produto %d: ", codigo2);
		quantidade2 = sc.nextInt();
		System.out.print("Quanto custou cada produto? ");
		valor2 = sc.nextDouble();
		
		resultado = (quantidade1 * valor1) + (quantidade2 * valor2);
		System.out.printf(Locale.US,"Voce está devendo um total de R$ %.2f", resultado);
		
		sc.close();
		

	}

}

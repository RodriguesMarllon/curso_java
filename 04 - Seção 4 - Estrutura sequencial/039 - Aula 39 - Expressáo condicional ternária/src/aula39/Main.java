package aula39;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double preco = 34.5;
		
		System.out.println("Digite o valor do produto: ");
		preco = sc.nextDouble();
		
		double desconto = (preco < 20.00) ? preco *0.1 : preco * 0.05;		
				
		System.out.printf("o desconto do seu produto é igual a R$ %.2f", desconto);
		
		sc.close();
		
	}
}

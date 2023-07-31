package ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		String lista;
		String descricao = "";
		double end = 0;
		int quantidade;
		int item = 0;
		
		int[] codigo = new int[5];
		codigo[0] = 1;
		codigo[1] = 2;
		codigo[2] = 3;
		codigo[3] = 4;
		codigo[4] = 5;
		
		String [] especificacao = new String[5];
		especificacao[0] = "Cachorro Quente";
		especificacao[1] = "X-Salada";
		especificacao[2] = "X-Bacon";
		especificacao[3] = "Torrada Simples";
		especificacao[4] = "Refrigerante";
		
		double[] preco = new double[5];
		preco[0] = 4.00;
		preco[1] = 4.50;
		preco[2] = 5.00;
		preco[3] = 2.00;
		preco[4] = 1.50;
		
		System.out.print("Voce deseja ver a lista de itens? (sim ou não) ");
		lista = sc.next();
		
		if (lista.equals("sim")) {
			System.out.printf("%n%d  %s  R$ %.2f %n", codigo[0], especificacao[0], preco[0]);
			System.out.printf("%d  %s         R$ %.2f %n", codigo[1], especificacao[1], preco[1]);
			System.out.printf("%d  %s          R$ %.2f %n", codigo[2], especificacao[2], preco[2]);
			System.out.printf("%d  %s  R$ %.2f %n", codigo[3], especificacao[3], preco[3]);
			System.out.printf("%d  %s     R$ %.2f %n %n", codigo[4], especificacao[4], preco[4]);
		} 
		
		System.out.println("Qual item você irá comprar? (digite o número do item)");
		item = sc.nextInt();
		
		switch (item) {
			
			case 1:
				end = preco[0];
				descricao = especificacao [0];
				break;
			case 2:
				end = preco[1];
				descricao = especificacao [1];
				break;
			case 3:
				end = preco[2];
				descricao = especificacao [2];
				break;
			case 4:
				end = preco[3];
				descricao = especificacao [3];
				break;
			case 5:
				end = preco[4];
				descricao = especificacao [4];
				break;
		}
		
		System.out.print("Quantos você irá comprar? ");
		quantidade =sc.nextInt();
		
		end = quantidade * end;
		
		System.out.printf(Locale.US,"Você comprou %d %s. Sua conta ficou R$ %.2f.",quantidade, descricao, end );
		
		sc.close();
		
	}

}

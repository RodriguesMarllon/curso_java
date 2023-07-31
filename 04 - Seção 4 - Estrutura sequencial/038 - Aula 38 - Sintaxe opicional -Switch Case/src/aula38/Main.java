package aula38;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int entrada = 0;
		String dia;
		
		System.out.println("Digite um numero de 1 a 7, sendo 1 = domingo, 2 = segunda e assim por diante: ");
		entrada = sc.nextInt();
		
		switch (entrada) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		
		System.out.println(dia);
		
		sc.close();
		
	}

}

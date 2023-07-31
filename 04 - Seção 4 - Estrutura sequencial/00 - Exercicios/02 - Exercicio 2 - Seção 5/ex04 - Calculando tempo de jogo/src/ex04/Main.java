package ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int initial;
		int end;
		int duration;
		
		System.out.print("Que horas o jogo iniciou? ");
		initial = sc.nextInt();
		System.out.print("E que horas ele acabou? ");
		end = sc.nextInt();
		
		duration = end - initial;
		
		if (duration < 0) {
			duration = 24 + (end - initial);
		}
		
		if (duration == 0 || duration > 24) {
			System.out.println("Horários invalidos para o cálculo de duração do jogo.");
		} else {
			System.out.printf("A duração do jogo é de %d hora(s).%n", duration);
		}
		
		sc.close();
	}

}

package ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		 
		 int number;
		 double hours;
		 double value;
		 double salary;
		 
		 System.out.print("Digite o seu número de Identificação: ");
		 number = sc.nextInt();
		 System.out.print("Digite a quantidade de horas que voce trabalhou este mes :");
		 hours = sc.nextDouble();
		 System.out.print("Por fim, digite o valor que voce recebe por hora trabalhada: ");
		 value = sc.nextDouble();
		 
		 salary = hours * value;
		 
		 System.out.printf(Locale.US,"O seu número de identificação é %d, Voce irá receber U$ %.2f dólares.",number, salary);

		 sc.close();

	}

}

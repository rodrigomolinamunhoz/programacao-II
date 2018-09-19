package lista02;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
  		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o salário: (double):");
		double salario = scanner.nextDouble();
		
		if (salario > 2000) {
			System.out.println("Aumento 10%: " + (salario * 0.10));
		} else if (salario > 1000 && salario <= 2000) {
			System.out.println("Aumento 15%: " + (salario * 0.15));
		} else {
			System.out.println("Aumento 20%: " + (salario * 0.20));
		}
	}
}

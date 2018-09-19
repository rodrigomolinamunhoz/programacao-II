package lista02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
 		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do raio (double):");
		double raio = scanner.nextDouble();
		
		double a = (double)4/3;
		double b = Math.pow(raio, 3);
		System.out.println(a * 3.14159 * b);
	}

}

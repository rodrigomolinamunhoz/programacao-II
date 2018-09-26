package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero:");

		try {
			int numero = scanner.nextInt();
			System.out.println("n�mero: " + numero);
		} catch (InputMismatchException e) {
			System.err.println("Erro");
		}

		System.out.println("Programa continua - 1");

		System.out.println("Digite um �ndice:");
		int n = scanner.nextInt();
		int[] numeros = { 100, 200 };

		try {
			System.out.println(numeros[n]);
		} catch (Exception e) {
			System.err.println("Erro");
		}
		
		System.out.println("Programa continua - 2");
		
		scanner.close();
	}
}

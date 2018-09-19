package lista01;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fat = 1;
		
		System.out.println("Digite um número:");
		int valor = scanner.nextInt();
		
		for (int i = 2; i <= valor; i++) {
			fat *= i;
		}
		
		System.out.println("O fatorial de " + valor + " é: " + fat);
	}
}

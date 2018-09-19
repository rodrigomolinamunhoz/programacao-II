package lista03;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int primeiroValor = scanner.nextInt();
		int maiorValor = primeiroValor;
		int menorValor = primeiroValor;
		
		for (int i = 0; i < primeiroValor - 1; i++) {
			System.out.println("Digite um valor:");
			int valor = scanner.nextInt();		
			
			if (maiorValor < valor) {
				maiorValor = valor;
			}			
			if (valor < menorValor) {
				menorValor = valor;
			}
		}
		
		System.out.println("Maior Valor: " + maiorValor);
		System.out.println("Menor Valor: " + menorValor);
	}
}

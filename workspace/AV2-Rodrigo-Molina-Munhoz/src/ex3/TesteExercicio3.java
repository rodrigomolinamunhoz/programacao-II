package ex3;

import java.util.Scanner;

public class TesteExercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lado = 0;
		try {
			System.out.println("Teste Quadrado");
			System.out.println("Digite um lado:");
			lado = Integer.parseInt(scanner.nextLine());
			Quadrado quadrado = new Quadrado(lado);
			System.out.println("Área Quadrado: " + quadrado.calculaArea());
			
			System.out.println("Teste Cubo");
			System.out.println("Digite um lado:");
			lado = Integer.parseInt(scanner.nextLine());
			Cubo cubo = new Cubo(lado);
			System.out.println("Área Cubo: " + cubo.calculaArea());			
		} catch (NumberFormatException e) {
			System.err.println("Formato inválido! Programa encerrado.");
		}
	}
}
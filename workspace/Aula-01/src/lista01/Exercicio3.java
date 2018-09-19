package lista01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número 01(int)");
		int numeroUm = scanner.nextInt();

		System.out.println("Digite o número 02(int)");
		int numeroDois = scanner.nextInt();

		if (numeroUm != numeroDois) {
			System.out.println("Números diferentes");

			if (numeroUm > numeroDois) {
				System.out.println(numeroUm);
			} else {
				System.out.println(numeroDois);
			}
		} else {
			System.out.println("Números iguais");
		}

	}

}

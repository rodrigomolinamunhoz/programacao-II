package lista01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número 01(int)");
		int numeroUm = scanner.nextInt();
		
		System.out.println("Digite o número 02(int)");
	    int numeroDois = scanner.nextInt();
	    
	    System.out.println("Soma: " + (numeroUm + numeroDois));
	    System.out.println("Subtração: " + (numeroUm - numeroDois));
	    System.out.println("Multiplicação: " + (numeroUm * numeroDois));
	    System.out.println("Divisão: " + (numeroUm / numeroDois));
	    System.out.println("Resto Divisão: " + (numeroUm % numeroDois));
	}
}

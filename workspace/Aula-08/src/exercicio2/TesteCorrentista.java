package exercicio2;

import java.util.Scanner;

public class TesteCorrentista {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;

		System.out.println("O digite o nome do correntista:");
		String nome = scanner.next();
		System.out.println("O digite o saldo do correntista:");
		double saldo = scanner.nextDouble();

		Correntista c = new Correntista(nome, saldo);
		
		do {
			System.out.println("O digite:");
			System.out.println("1 - D�bito");
			System.out.println("2 - Cr�dito");
			System.out.println("3 - Sair");
			opcao = scanner.nextInt();

			if (opcao == 1) {
				System.out.println("Informe valor do d�bito:");
				 c.debito(scanner.nextDouble());
			} else if (opcao == 2) {
				System.out.println("Informe valor do cr�dito:");
				 c.credito(scanner.nextDouble());
			} else if (opcao != 3) {
				System.out.println("Op��o inv�lida");
			}
		} while (opcao != 3);
		
		System.out.println(c.imprimir());
	}

}

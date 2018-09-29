package exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;

		do {
			try {
				System.out.println("Digite o número de pessoas que deseja");
				n = scanner.nextInt();
				
				if (n == 0) {
					System.out.println("Valor deve ser maior que zero!");
				}
			} catch (InputMismatchException e) {
				System.err.println("Informação incorreta!");
			}
		} while (n == 0);

/*		Pessoa[] p = new Pessoa[n];

		int opcao;
		do {
			System.out.println("Digite opção do menu:");
			System.out.println("1 - Cadastrar pessoa");
			System.out.println("2 - Exibir dados da pessoa");
			System.out.println("3 - Sair");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				break;
			}
		} while (opcao != 0);*/
		
		
		
	}
}

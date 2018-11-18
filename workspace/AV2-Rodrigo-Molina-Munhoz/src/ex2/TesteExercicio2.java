package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteExercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<MovimentoBancario> movimentosBancarios = new ArrayList<MovimentoBancario>();

		int opcao = 0;
		do {
			try {
				System.out.println("Digite uma op��o:");
				System.out.println("1 - Inserir novos movimentos");
				System.out.println("2 - Mostrar todos os movimentos");
				System.out.println("3 - Mostrar saldo em conta");
				System.out.println("4 - Sair");
				opcao = Integer.parseInt(scanner.nextLine());

				switch (opcao) {
				case 1:
					System.out.println("Digite o valor:");
					double valor = Double.parseDouble(scanner.nextLine());
					System.out.println("Digite a descri��o:");
					String descricao = scanner.nextLine();
					movimentosBancarios.add(new MovimentoBancario(valor, descricao));
					break;
				case 2:
					System.out.println("Lista de movimentos:");
					System.out.println("------------------------------------");
					for (MovimentoBancario movimento : movimentosBancarios) {
						System.out.println("Valor: " + movimento.getValor());
						System.out.println("Descri��o: " + movimento.getDescricao());
						System.out.println("------------------------------------");
					}
					break;
				case 3:
					double soma = 0;
					for (MovimentoBancario movimentoBancario : movimentosBancarios) {
						soma += movimentoBancario.getValor();
					}
					System.out.println("------------------------------------");
					System.out.println("Saldo: " + soma);
					System.out.println("------------------------------------");
					break;
				case 4:
					System.out.println("Sistema encerrado!");
					break;
				default:
					System.out.println("Op��o errada!");
					break;
				}
			} catch (NumberFormatException e) {
				opcao = 0;
				System.err.println("Formato inv�lido!");
			}
		} while (opcao != 4);
		
		//TODO: SALVAR EM UM ARQUIVO TXT.
	}
}

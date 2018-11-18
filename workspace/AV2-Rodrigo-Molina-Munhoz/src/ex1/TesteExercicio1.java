package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteExercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		int opcao = 0;
		do {
			try {
				System.out.println("Digite uma opção:");
				System.out.println("1 - Cadastrar um novo produto");
				System.out.println("2 - Exibir produtos cadastrados");
				System.out.println("3 - Ordenar Produtos");
				System.out.println("4 - Sair");
				opcao = Integer.parseInt(scanner.nextLine());

				switch (opcao) {
				case 1:
					System.out.println("Digite o código:");
					int codigo = Integer.parseInt(scanner.nextLine());
					System.out.println("Digite o preço:");
					double preco = Double.parseDouble(scanner.nextLine());
					System.out.println("Digite a descrição:");
					String descricao = scanner.nextLine();
					produtos.add(new Produto(codigo, preco, descricao));
					break;
				case 2:
					System.out.println("Lista de produtos:");
					System.out.println("------------------------------------");
					for (Produto produto : produtos) {
						System.out.println("Código " + produto.getCodigo());
						System.out.println("Preço " + produto.getPreco());
						System.out.println("Descrição " + produto.getDescricao());
						System.out.println("------------------------------------");
					}
					break;
				case 3:
					//TODO: ORDENAR
					break;
				case 4:
					System.out.println("Sistema encerrado!");
					break;
				default:
					System.out.println("Opção errada!");
					break;
				}
			} catch (NumberFormatException e) {
				opcao = 0;
				System.err.println("Formato inválido!");
			}
		} while (opcao != 4);
	}
}

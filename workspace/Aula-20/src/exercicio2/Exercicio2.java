package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		int opcao = 0;
		do {
			System.out.println("Digite a opção que deseja");
			System.out.println("1 - Adicionar pessoa");
			System.out.println("2 - Remover pessoa pelo cpf");
			System.out.println("3 - Remover todas pessoas");
			System.out.println("4 - Listar todas pessoas");
			System.out.println("5 - Listar pessoa pelo cpf");
			System.out.println("0 - Sair");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				adicionarPessoa(pessoas);
				break;
			case 2:
				removerPessoa(pessoas);
				break;
			case 3:
				removerTodasPessoas(pessoas);
				break;
			case 4:
				listarPessoas(pessoas);
				break;
			case 5:
				encontrarPessoa(pessoas);
				break;
			case 0:
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcao != 0);
	}

	public static void adicionarPessoa(ArrayList<Pessoa> pessoas) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um cpf:");
		String cpf = scanner.nextLine();
		
		System.out.println("Digite um nome:");
		String nome = scanner.nextLine();
		
		System.out.println("Digite um nome:");
		int idade = scanner.nextInt();		
		
		pessoas.add(new Pessoa(cpf, nome, idade));
	}

	public static void removerPessoa(ArrayList<Pessoa> pessoas) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um cpf:");
		String cpf = scanner.nextLine();
		Pessoa pessoaEncontrada = null;
		
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoaEncontrada = pessoa;
			}
		}
		if (pessoaEncontrada != null) {
			pessoas.remove(pessoaEncontrada);
		} else {
			System.out.println("Pessoa não encontrada!");
		}
	}

	public static void removerTodasPessoas(ArrayList<Pessoa> pessoas) {
		pessoas.clear();
	}

	public static void listarPessoas(ArrayList<Pessoa> pessoas) {
		if (pessoas.isEmpty()) {
			System.out.println("\n Lista vazia! \n");
			return;
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.imprimir());
		}
	}

	public static void encontrarPessoa(ArrayList<Pessoa> pessoas) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um cpf:");
		String cpf = scanner.nextLine();	
		Pessoa pessoaEncontrada = null;
		
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCpf().equals(cpf)) {
				pessoaEncontrada = pessoa;
			}
		}
		if (pessoaEncontrada != null) {
			System.out.println(pessoaEncontrada.imprimir());
		} else {
			System.out.println("Pessoa não encontrada! \n" );
		}
	}
}
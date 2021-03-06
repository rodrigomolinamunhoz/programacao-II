package exercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import exemplo.Carro;

public class Cadastro {

	public static void main(String[] args) {
		ArrayList<Imovel> bairro = new ArrayList<Imovel>();
		//Leitor do arquivo

		
		//Programa
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		do {
			listarMenu();

			try {
				opcao = Integer.parseInt(leitor.nextLine());
			} catch (NumberFormatException e) {
				opcao = 0;
				System.out.println("Entrada inv�lida!");
			}

			switch (opcao) {
			case 1:
				try {
					System.out.println("Digite o c�digo do im�vel:");
					int codigo = Integer.parseInt(leitor.nextLine());
					System.out.println("Digite o tipo do im�vel:");
					String tipoImovel = leitor.nextLine();
					System.out.println("Digite o valor do im�vel:");
					double valorImovel = Double.parseDouble(leitor.nextLine());
					bairro.add(new Imovel(codigo, tipoImovel, valorImovel));
				} catch (NumberFormatException e) {
					System.out.println("Campo digitado inv�lido!");
				}
				break;
			case 2:
				for (Imovel imovel : bairro) {
					System.out.println("C�digo: " + imovel.getCodigo());
					System.out.println("Tipo:" + imovel.getTipoImovel());
					System.out.println("Valor: " + imovel.getValorImovel());
				}
				break;
			case 3:
				System.out.println("Digite o c�digo do im�vel que deseja excluir:");
				int codigoRemover = Integer.parseInt(leitor.nextLine());

				Imovel imovelEncontrado = null;
				for (Imovel imovel : bairro) {
					if (imovel.getCodigo() == codigoRemover) {
						imovelEncontrado = imovel;
					}
				}

				if (imovelEncontrado != null) {
					bairro.remove(imovelEncontrado);
				}
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (opcao != 4);
		leitor.close();
	}

	public static void listarMenu() {
		System.out.println("1 - Cadastrar im�vel");
		System.out.println("2 - Listar im�vel");
		System.out.println("3 - Remover im�vel");
		System.out.println("4 - Sair");
		System.out.print("> ");
	}
}

package exemplo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		ArrayList<Carro> garagem = new ArrayList<Carro>();
		// Leitura do txt
		try {
			FileReader fr = new FileReader("dados/carros.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = null;
			while ((linha = br.readLine()) != null) {
				garagem.add(new Carro(linha));
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Programa
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("1 - novo carro");
			System.out.println("2 - listar carro");
			System.out.println("3 - sair");
			System.out.print("> ");

			try {
				opcao = Integer.parseInt(leitor.nextLine());
			} catch (NumberFormatException e) {
				opcao = 0;
				System.out.println("Entrada inv�lida!");
			}

			switch (opcao) {
			case 1:
				System.out.println("Modelo;");
				System.out.print("> ");
				String m = leitor.nextLine();
				garagem.add(new Carro(m));
				break;
			case 2:
				System.out.println("Lista de carros:");
				for (Carro carro : garagem) {
					System.out.println(carro.getModelo());
				}
				System.out.println();
				break;
			case 3:
				break;
			default:
				break;
			}

		} while (opcao != 3);
		leitor.close();

		// Salvar no txt
		File f = new File("dados/carros.txt");
		try {
			FileWriter fw = new FileWriter(f, false);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (Carro carro : garagem) {
				bw.write(carro.getModelo() + "\n");
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

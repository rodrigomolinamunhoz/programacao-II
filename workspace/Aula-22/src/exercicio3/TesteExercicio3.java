package exercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class TesteExercicio3 {

	public static void main(String[] args) {
		File arquivo = new File("Exercicio3/pessoas.txt");

		FileReader leitor;
		try {
			leitor = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(leitor);
			ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

			String linha = null;
			while ((linha = br.readLine()) != null) {
				String[] partes = linha.split(" ");
				String nome = partes[0];
				String sobrenome = partes[1];
				pessoas.add(new Pessoa(nome, sobrenome));
			}

			Collections.sort(pessoas);

			for (Pessoa p : pessoas) {
				System.out.println(p.getNome() + " " + p.getSobrenome());
			}

			br.close();
			leitor.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package exemplo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TesteLeitor {

	public static void main(String[] args) {
		File arquivo = new File("Clientes/nomes.txt");

		FileReader leitor;
		try {
			leitor = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(leitor);

			String linha = null;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}

			br.close();
			leitor.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

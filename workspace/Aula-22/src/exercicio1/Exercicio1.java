package exercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio1 {

	public static void main(String[] args) {
		
		File arquivo = new File("Exercicio1/numeros1.txt");

		FileReader leitor;
		int somaNumeros = 0;
		try {
			leitor = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(leitor);

			String linha = null;
			somaNumeros = 0;
			while ((linha = br.readLine()) != null) {
				somaNumeros += Integer.parseInt(linha);
			}
			System.out.println(somaNumeros);
			
			br.close();
			leitor.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		File arquivoNovo = new File("Exercicio1/soma.txt");
		
		try {
			arquivoNovo.createNewFile();
			
			FileWriter escritor = new FileWriter(arquivoNovo, true);
			BufferedWriter bw = new BufferedWriter(escritor);
			
			bw.write(String.valueOf(somaNumeros));
			
			bw.close();
			escritor.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

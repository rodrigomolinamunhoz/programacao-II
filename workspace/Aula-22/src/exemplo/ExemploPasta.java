package exemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploPasta {

	public static void main(String[] args) {
		File pasta = new File("Clientes");
		pasta.mkdir();
		//pasta.delete();
		File arquivo = new File("Clientes/nomes.txt");
		
		try {
			arquivo.createNewFile();
			
			FileWriter escritor = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(escritor);
			
			bw.write("Maria\n");
			bw.write("Maria\n");
			bw.write("Maria\n");
			bw.write("Maria\n");
			
			bw.close();
			escritor.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

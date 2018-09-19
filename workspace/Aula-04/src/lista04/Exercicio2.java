package lista04;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		double somaTamanhoPalavras = 0;

		for (int i = 0; i < 10; i++) {
			String palavra = JOptionPane.showInputDialog("Informe uma palavra número " + (i + 1) + ":");
			somaTamanhoPalavras = somaTamanhoPalavras + palavra.length();
		}

		JOptionPane.showMessageDialog(null, somaTamanhoPalavras / 10, null, JOptionPane.INFORMATION_MESSAGE);
	}
}

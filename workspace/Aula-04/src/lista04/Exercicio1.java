package lista04;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Informe uma palavra: ");
		String palavraContrario = "";
		
        for (int i = (palavra.length() -1); i >= 0; i--) {
        	palavraContrario = palavraContrario + palavra.charAt(i);
        }
        
        
        if (palavraContrario.toLowerCase().equals(palavra.toLowerCase())) {
            System.out.println("Essa palavra � pal�ndromo");
        } else {
            System.out.println("Essa palavra n�o � pal�ndromo");
        }
	}
}

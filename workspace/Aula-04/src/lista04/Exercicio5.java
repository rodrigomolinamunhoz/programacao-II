package lista04;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		int[] arrayInt = new int[5];
		int contadorNegativos = 0;
		
		for (int i = 0; i < arrayInt.length; i++) {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do número " + (i + 1) + ":"));
			arrayInt[i] = valor;
		}		
		
		for (int i = 0; i < arrayInt.length; i++) {
			
			if (arrayInt[i] >= 0) {
				System.out.print(arrayInt[i] + " ");	
			}
			else
			{
				contadorNegativos++;
			}
		}
		
		System.out.println("\n"
				+ "Quantidade de números negativos: " + contadorNegativos);
	}
}

package lista04;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		int tamanhoArray = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do array:"));
		int[] arrayInt = new int[tamanhoArray];
		int somaValoresArray = 0;
		
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do número " + (i + 1) + ":"));
		}
		
		for (int i = 0; i < arrayInt.length; i++) {		
			System.out.print(arrayInt[i] + " ");
			
			somaValoresArray = somaValoresArray + arrayInt[i];
		}
		
		System.out.println("\n" + "Soma dos valores do array: " + somaValoresArray);
		System.out.println("Média dos valores do array: " + somaValoresArray / arrayInt.length);
	}

}

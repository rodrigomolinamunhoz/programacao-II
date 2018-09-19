package lista04;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {	
		String precoGasolina = JOptionPane.showInputDialog("Informe o preço da gasolina (R$ por litro):");
		String distanciaPercorrida = JOptionPane.showInputDialog("Informe a distância a ser percorrida em uma viagem (em quilômetros):");
		String consumoMedio = JOptionPane.showInputDialog("Informe o consumo médio do carro na estrada (em quilômetros por litro):");
		String gastoPedagio = JOptionPane.showInputDialog("Informe o gasto com pedágios (em R$):");
		
		double litros = Double.parseDouble(distanciaPercorrida) / Double.parseDouble(consumoMedio);
		
		JOptionPane.showMessageDialog(null, (litros * Double.parseDouble(precoGasolina)) +
											Double.parseDouble(gastoPedagio), null, JOptionPane.INFORMATION_MESSAGE);
	}
}

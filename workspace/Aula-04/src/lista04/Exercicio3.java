package lista04;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {	
		String precoGasolina = JOptionPane.showInputDialog("Informe o pre�o da gasolina (R$ por litro):");
		String distanciaPercorrida = JOptionPane.showInputDialog("Informe a dist�ncia a ser percorrida em uma viagem (em quil�metros):");
		String consumoMedio = JOptionPane.showInputDialog("Informe o consumo m�dio do carro na estrada (em quil�metros por litro):");
		String gastoPedagio = JOptionPane.showInputDialog("Informe o gasto com ped�gios (em R$):");
		
		double litros = Double.parseDouble(distanciaPercorrida) / Double.parseDouble(consumoMedio);
		
		JOptionPane.showMessageDialog(null, (litros * Double.parseDouble(precoGasolina)) +
											Double.parseDouble(gastoPedagio), null, JOptionPane.INFORMATION_MESSAGE);
	}
}

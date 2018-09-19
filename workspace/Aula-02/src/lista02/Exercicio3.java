package lista02;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
  		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quilometragem inicial do carro: (double):");
		double kmInicial = scanner.nextDouble();
		
		System.out.println("Digite a quilometragem final do carro: (double):");
	    double kmFinal = scanner.nextInt();
	    
		System.out.println("Digite litros utilizados: (double):");
	    double litros = scanner.nextInt();
	    
	    double kmRodados = kmFinal - kmInicial;
	    System.out.println("Média do carro:" + (kmRodados / litros));
	}
}

package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double somaSalario = 0;
		
		System.out.println("Digite o número de colaboradores:");
		int m = leitor.nextInt();

		System.out.println("Digite o número de salários:");
		int n = leitor.nextInt();

		double[][] array = new double[m][n];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Colaborador: " + (i + 1));
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Digite o salário: ");
				array[i][j] = leitor.nextDouble();
			}
		}
		
		System.out.println("\n");

		//LISTAGEM GERAL
		for (int i = 0; i < array.length; i++) {
			System.out.println("Colaborador: " + (i + 1));
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("R$: " + array[i][j]);
			}
		}
		
		System.out.println("\n");
		
		//SALÁRIO MÉDIO GERAL
		somaSalario = 0;
		System.out.println("SALÁRIO MÉDIO GERAL");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				somaSalario += array[i][j]; 
			}
		}
		System.out.println(somaSalario / m);
		
		System.out.println("\n");
		
		//SALÁRIO MÉDIO DE CADA COLABORADOR
		somaSalario = 0;
		System.out.println("SALÁRIO MÉDIO DE CADA COLABORADOR");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Colaborador: " + (i + 1));
			for (int j = 0; j < array[i].length; j++) {
				somaSalario += array[i][j]; 
			}
			System.out.println(somaSalario / n);
			somaSalario = 0;
		}
	}
}

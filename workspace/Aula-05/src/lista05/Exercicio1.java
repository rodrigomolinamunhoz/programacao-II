package lista05;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
		
 		System.out.println("Digite o número de alunos:");
		int n = scanner.nextInt();
		String[] nomes = new String [n];
		
		
		System.out.println("Digite o número de avaliações:");
		int m = scanner.nextInt();
		double[][] notas = new double[n][m];
		double media = 0;
		
		for (int i = 0; i < nomes.length; i++) {
	 		System.out.println("Digite o nome do aluno " + (i + 1));
			nomes[i] = scanner.next();
		}
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Digite a nota do aluno " + nomes[i]);
				notas[i][j] = scanner.nextDouble();
			}
		}
		
		System.out.println("------- NOTAS ----------");
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Aluno: " + nomes[i] + " -");
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(" Nota: " + notas[i][j]);
			}
			System.out.println("\n");
		}	
		
		System.out.println("------- MÉDIAS ----------");
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Aluno: " + nomes[i]);
			for (int j = 0; j < notas[i].length; j++) {
				media = media + notas[i][j];
			}
			System.out.print(" - Média : " + media / m);
			media = 0;
			System.out.println("\n");
		}
		
		System.out.println("------- MÉDIAS POR AVALIAÇÃO ----------");
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Aluno: " + nomes[i]);
			for (int j = 0; j < notas[i].length; j++) {
				media = media + notas[j][i];
			}
			System.out.print(" - Média : " + media / m);
			media = 0;
			System.out.println("\n");
		}
	}
}

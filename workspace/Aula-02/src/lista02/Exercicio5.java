package lista02;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
  		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o n�mero de turmas: (int):");
		int numeroTurma = scanner.nextInt();
		int somaAlunos = 0;
				
		for (int i = 0; i < numeroTurma; i++) {
			System.out.println("Digite o n�mero de alunos: (int):");
			int numeroAlunos = scanner.nextInt();
			
			while (numeroAlunos > 32) {				
				System.out.println("N�mero m�ximo de alunos � 32");
				System.out.println("Digite o n�mero de alunos: (int):");
				numeroAlunos = scanner.nextInt();
			}
			
			somaAlunos = somaAlunos + numeroAlunos;
		}		
		
		System.out.println("M�dia das turmas: " + somaAlunos / numeroTurma);
	}
}

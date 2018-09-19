package ex1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		Candidato[] segundoTurno = new Candidato[2];
		
		for (int i = 0; i < segundoTurno.length; i++) {
			System.out.println("---- PARTIDO ----");
			System.out.println("Digite a SIGLA do partido:");
			String sigla = leitor.next();
			System.out.println("Digite o NÚMERO do partido:");
			int numero = leitor.nextInt();
			Partido p = new Partido(sigla, numero);
			System.out.println("Digite o NOME do candidato:");
			String nome = leitor.next();
			segundoTurno[i] = new Candidato(nome, p);			
		}
		
		for (int i = 0; i < segundoTurno.length; i++) {
			System.out.println("Candidato NOME: " + segundoTurno[i].getNome());
			System.out.println("Partido SIGLA: " + segundoTurno[i].getPartido().getSigla());
			System.out.println("Partido NÚMERO: " + segundoTurno[i].getPartido().getNumero());
		}
	}
}

package lista02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do sal�rio (double):");
		double salario = scanner.nextDouble();
		
		System.out.println("Digite a porcentagem de aumento: (double):");
	    double porcentagem = scanner.nextInt();
	    
	    double valorAumento = salario * (porcentagem / 100);
	    System.out.println("Sal�rio atual: " + salario);
	    System.out.println("Porcentagem de aumento: " + valorAumento);
	    System.out.println("Sal�rio com aumento: " + (salario + valorAumento));
	}
}

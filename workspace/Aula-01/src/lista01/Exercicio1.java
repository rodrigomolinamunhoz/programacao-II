package lista01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o n�mero 01(int)");
		int numeroUm = scanner.nextInt();
		
		System.out.println("Digite o n�mero 02(int)");
	    int numeroDois = scanner.nextInt();
	    
	    System.out.println("Soma: " + (numeroUm + numeroDois));
	    System.out.println("Subtra��o: " + (numeroUm - numeroDois));
	    System.out.println("Multiplica��o: " + (numeroUm * numeroDois));
	    System.out.println("Divis�o: " + (numeroUm / numeroDois));
	    System.out.println("Resto Divis�o: " + (numeroUm % numeroDois));
	}
}

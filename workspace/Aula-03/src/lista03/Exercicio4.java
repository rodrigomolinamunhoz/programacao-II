package lista03;

public class Exercicio4 {

	public static void main(String[] args) {
		int numeroUm = 1;
		int numeroTres = 3;
		int numeroCinco = 5;
		int numeroSete = 7;
		int numeroNove = 9;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				
				if (i == 1 && j <= 4) {
					numeroUm = numeroUm * 10;
					System.out.print(numeroUm + " ");
					continue;
				}
				
				if (i == 2 && j <= 4) {
					numeroTres = numeroTres * 10;
					System.out.print(numeroTres + " ");
					continue;
				}
				
				if (i == 3 && j <= 4) {
					numeroCinco = numeroCinco * 10;
					System.out.print(numeroCinco + " ");
					continue;
				}
				
				if (i == 4 && j <= 4) {
					numeroSete = numeroSete * 10;
					System.out.print(numeroSete + " ");
					continue;
				}

				if (i == 5 && j <= 4) {
					numeroNove = numeroNove * 10;
					System.out.print(numeroNove + " ");
					continue;
				}
			}
			System.out.println();
		}
	}
}

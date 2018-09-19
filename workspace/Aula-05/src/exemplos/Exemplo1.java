package exemplos;

import java.util.Random;

public class Exemplo1 {

	public static void main(String[] args) {
		int[][] matriz = new int [2][3];
		 Random rand = new Random();		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(60) + 1;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(" " + i  + j + " = " +  matriz[i][j] + " ");
			}
		}
	}
}

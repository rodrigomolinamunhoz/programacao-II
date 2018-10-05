package exemplos;

import java.util.ArrayList;

public class TesteArray2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> numeros2 = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);

		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		
		numeros.addAll(numeros2);
		
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
	}
}
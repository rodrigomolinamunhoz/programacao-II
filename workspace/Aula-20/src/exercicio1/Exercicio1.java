package exercicio1;

import java.util.ArrayList;

public class Exercicio1 {
	public static void main(String[] args) { 
		ArrayList<Apartamento> ap = new ArrayList<Apartamento>();
		
		ap.add(new Apartamento(1, 101));
		ap.add(new Apartamento(2, 201));
		ap.add(new Apartamento(3, 301));
		
		for (Apartamento apartamento : ap) {
			System.out.println(apartamento.imprimir());
		}
	}
}

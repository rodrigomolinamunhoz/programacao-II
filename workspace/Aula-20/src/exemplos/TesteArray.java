package exemplos;

import java.util.ArrayList;

public class TesteArray {
	public static void main(String[] args) {
		ArrayList<String> itens = new ArrayList<String>();

		itens.add("RS");
		itens.add("SC");
		itens.remove(1);
		itens.add(0, "SP");

		for (int i = 0; i < itens.size(); i++)
			System.out.println(itens.get(i));
	}
}

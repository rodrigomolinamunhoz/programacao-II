package exercicio3;

public class TesteCrescimentoPopulacional {

	public static void main(String[] args) {
		CrescimentoPopulacional c = new CrescimentoPopulacional(100, 200, 1.2, 1.1);	
		System.out.println(c.calculaAnos() + " anos.");
	}
}

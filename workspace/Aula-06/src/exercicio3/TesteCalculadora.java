package exercicio3;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		int[] array = {10,6,10,6};
		
		System.out.println("Soma: " + c.soma(2, 2));
		System.out.println("Subtra��o: " + c.subtracao(2, 2));
		System.out.println("Multiplica��o: " + c.multiplicacao(2, 2));
		System.out.println("Divis�o: " + c.divisao(2, 2));
		System.out.println("M�dia: " + c.media(array));
	}

}

package exemplos;

public class Exemplo2 {
	public static void main(String[] args) {
		System.out.println("Início Main");
		calculo1();
		System.out.println("Fim Main");
	}

	private static void calculo1() {
		System.out.println("Início calculo 1");
		calculo2();
		System.out.println("Fim calculo 1");
	}

	private static void calculo2() {
		System.out.println("Início calculo 2");
		String palavra = "teste ";
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(palavra.toUpperCase());
			} catch (Exception e) {
				System.err.println("Erro..");
			}
			if (i == 2) {
				palavra = null;
			}
		}
		System.out.println("Fim calculo 2");
	}
}
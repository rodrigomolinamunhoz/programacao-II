package exercicio2;

public class Potencia {
	public double elevadoA(double base, int expoente) {
		if (expoente == 0) {
			return 1;
		}
		while (expoente > 1) {
			base *= base;
			expoente--;
		}
		return base;
	}
}

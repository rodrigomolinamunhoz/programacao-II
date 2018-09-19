package heranca;

public class Guitarra extends Instrumento {
	private int numeroCordas;

	public int getNumeroCordas() {
		return numeroCordas;
	}

	public void setNumeroCordas(int numeroCordas) {
		this.numeroCordas = numeroCordas;
	}

	public void imprimir() {
		System.out.println("Número de cordas: " + this.getNumeroCordas());
		System.out.println("Preço: " + this.getPreco());
	}
}
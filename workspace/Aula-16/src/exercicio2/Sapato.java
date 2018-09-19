package exercicio2;

public class Sapato extends Produto {
	private int numeracao;

	public Sapato(String nome, double valor, int numeracao) {
		super(nome, valor);
		this.numeracao = numeracao;
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Numeração: " + this.numeracao);
	}
}

package exercicio2;

public class Camiseta extends Produto {
	private char tamanho;

	public Camiseta(String nome, double valor, char tamanho) {
		super(nome, valor);
		this.tamanho = tamanho;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Tamanho: " + this.tamanho);
	}
}

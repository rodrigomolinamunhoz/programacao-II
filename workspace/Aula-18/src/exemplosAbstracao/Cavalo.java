package exemplosAbstracao;

public class Cavalo extends Animal {
	private String cor;
	
	public Cavalo(String nome, String cor) {
		super(nome);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void alimentar() {
		System.out.println("Alfafa!");		
	}
}

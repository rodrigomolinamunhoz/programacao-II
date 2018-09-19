package ex3.pessoas;

public class Pessoa {
	private String nome;
	private String partido;

	public Pessoa(String nome, String partido) {
		super();
		this.nome = nome;
		this.partido = partido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String imprimir() {
		return "\n" + "Nome: " + this.nome + "\n" + "Partido: " + this.partido;
	}
}

package ex3;

import ex3.pessoas.Presidente;

public class Pais {
	private Presidente presidente;
	private String nome;

	public Pais(Presidente presidente, String nome) {
		this.presidente = presidente;
		this.nome = nome;
	}

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String imprimir() {
		return "\n" + "Nome País: " + this.nome + "\n" + "Presidente: " + presidente.imprimir();
	}
}
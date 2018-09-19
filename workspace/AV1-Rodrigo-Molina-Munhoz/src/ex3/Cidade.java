package ex3;

import ex3.pessoas.Prefeito;

public class Cidade {
	private Prefeito prefeito;
	private Estado estado;
	private String nome;

	public Cidade(Prefeito prefeito, Estado estado, String nome) {
		this.prefeito = prefeito;
		this.estado = estado;
		this.nome = nome;
	}

	public Prefeito getPrefeito() {
		return prefeito;
	}

	public void setPrefeito(Prefeito prefeito) {
		this.prefeito = prefeito;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String imprimir() {
		return "Prefeito: " + this.prefeito.imprimir() + "\n" + "Estado: " + this.estado.imprimir() + "\n"
				+ "Nome Cidade: " + this.nome;
	}
}

package ex3;

import ex3.pessoas.Governador;

public class Estado {
	private Governador governador;
	private Pais pais;
	private String nome;
	private String sigla;

	public Estado(Governador governador, Pais pais, String nome, String sigla) {
		this.governador = governador;
		this.pais = pais;
		this.nome = nome;
		this.sigla = sigla;
	}

	public Governador getGovernador() {
		return governador;
	}

	public void setGovernador(Governador governador) {
		this.governador = governador;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String imprimir() {
		return "\n" + "Governador: " + this.governador.imprimir() + "\n" + "País: " + this.pais.imprimir() + "\n"
				+ "Nome Estado: " + this.nome + "\n" + "Sigla Estado: " + this.sigla;
	}
}

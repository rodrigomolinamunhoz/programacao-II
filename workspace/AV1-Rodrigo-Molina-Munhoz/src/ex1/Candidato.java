package ex1;

public class Candidato extends Pessoa {

	private Partido partido;

	public Candidato(String nome, Partido partido) {
		super(nome);
		this.partido = partido;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}
}

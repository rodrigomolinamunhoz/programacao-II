package exercicio1;

public class Cidade {
	private String nome;
	private Prefeito prefeito;
	private Estado estado;
	private Hospital[] hospitais;
	

	public Cidade(String nome, Prefeito prefeito, Estado estado) {
		super();
		this.nome = nome;
		this.prefeito = prefeito;
		this.estado = estado;
	}
 	
	public Cidade(String nome, Prefeito prefeito, Estado estado, Hospital[] hospitais) {
		super();
		this.nome = nome;
		this.prefeito = prefeito;
		this.estado = estado;
		this.setHospitais(hospitais);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
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

	public Hospital[] getHospitais() {
		return hospitais;
	}

	public void setHospitais(Hospital[] hospitais) {
		this.hospitais = hospitais;
	}
}

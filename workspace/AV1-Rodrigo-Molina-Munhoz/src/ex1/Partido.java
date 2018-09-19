package ex1;

public class Partido {
	private String sigla;
	private int numero;
	
	public Partido(String sigla, int numero) {
		this.sigla = sigla;
		this.numero = numero;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}

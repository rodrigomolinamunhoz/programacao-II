package exercicio1;

public class Componente {
	private String fabricante;
	private String modelo;
		
	public Componente(String fabricante, String modelo) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}

package exercicio1;

public class Imovel {
	private int codigo;
	private String tipoImovel;
	private double valorImovel;
	
	public Imovel(int codigo, String tipoImovel, double valorImovel) {
		this.codigo = codigo;
		this.tipoImovel = tipoImovel;
		this.valorImovel = valorImovel;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public double getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}	
}

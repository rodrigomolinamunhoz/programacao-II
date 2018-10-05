package exercicio1;

public class Casa {
	private double tamanho;
	private double areaConstruida;
	
	public Casa(double tamanho, double areaConstruida) {
		this.tamanho = tamanho;
		this.areaConstruida = areaConstruida;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getAreaConstruida() {
		return areaConstruida;
	}

	public void setAreaConstruida(double areaConstruida) {
		this.areaConstruida = areaConstruida;
	}
}

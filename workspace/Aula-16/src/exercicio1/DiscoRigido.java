package exercicio1;

public class DiscoRigido extends Componente {
	private int capacidade;

	public DiscoRigido(String fabricante, String modelo, int capacidade) {
		super(fabricante, modelo);
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}	
}

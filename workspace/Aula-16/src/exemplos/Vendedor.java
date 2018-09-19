package exemplos;

public class Vendedor extends Funcionario {
	private int numeroVendas;
	private double comissao;
	
	public Vendedor(String nome, double salario, int numeroVendas, double comissao) {
		super(nome, salario);
		this.numeroVendas = numeroVendas;
		this.comissao = comissao;
	}

	public int getNumeroVendas() {
		return numeroVendas;
	}

	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double salarioComComissao() {
		return this.getSalario() + (this.numeroVendas * this.comissao);
	}
}

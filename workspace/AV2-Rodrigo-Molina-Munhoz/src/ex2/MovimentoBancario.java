package ex2;

public class MovimentoBancario {
	private double valor;
	private String descricao;
	
	public MovimentoBancario(double valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
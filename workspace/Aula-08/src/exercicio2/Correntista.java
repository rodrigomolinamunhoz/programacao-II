package exercicio2;

public class Correntista {

	private String nome;
	private double saldo;

	public Correntista(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void debito(double saldo) {
		this.saldo =- saldo;
	}
	
	public void credito(double saldo) {
		this.saldo += saldo;
	}
	
	public String imprimir()
	{
		return "Nome: " + this.nome + "\n" +
				"Saldo final: " + this.saldo;
	}
}

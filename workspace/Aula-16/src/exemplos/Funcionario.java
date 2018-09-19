package exemplos;

public class Funcionario extends Pessoa {
	private double salario;

	public Funcionario(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Sal�rio" + this.salario);
	}
}

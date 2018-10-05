package exercicio2;

public class Pessoa {
	private String cpf;
	private String nome;
	private int idade;
	
	public Pessoa(String cpf, String nome, int idade) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String imprimir() {
		return "\n" + "CPF: " + this.cpf + " Nome: " + this.nome + " Idade: " + this.idade + "\n"; 
	}
}

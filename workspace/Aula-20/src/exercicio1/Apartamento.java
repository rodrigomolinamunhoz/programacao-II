package exercicio1;

public class Apartamento {
	private int andar;
	private int numero;
	
	public Apartamento(int andar, int numero) {
		super();
		this.andar = andar;
		this.numero = numero;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String imprimir() {
		return "Andar: " + this.andar + " Número: " + this.numero + "\n"; 
	}
}

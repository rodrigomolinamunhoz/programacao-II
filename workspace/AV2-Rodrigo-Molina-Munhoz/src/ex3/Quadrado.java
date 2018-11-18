package ex3;

public class Quadrado {
	private int lado;

	public Quadrado(int lado) {
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int calculaArea() {
		return this.lado * this.lado;
	}
}
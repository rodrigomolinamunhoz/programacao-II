package ex3;

public class Cubo extends Quadrado {
	public Cubo(int lado) {
		super(lado);
	}
	
	public int calculaArea() {
		return 6 * super.calculaArea();
	}
}

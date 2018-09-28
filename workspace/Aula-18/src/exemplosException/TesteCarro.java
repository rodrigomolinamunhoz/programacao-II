package exemplosException;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c = new Carro(null);
		
		try {
			System.out.println(c.getModeloUpperException());
		} catch (Exception e) {
			System.err.println("Erro Exception");
		}
			
		try {
			System.out.println(c.getModeloUpperRuntimeException());
		} catch (RuntimeException e) {
			System.err.println("Erro Runtime");
		}
	}
}
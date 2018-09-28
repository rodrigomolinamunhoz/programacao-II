package exemplosException;

public class Carro {
	private String modelo;

	public Carro(String modelo) {
		this.modelo = modelo;
	}

	public String getModeloUpperException() throws Exception {
		return this.modelo.toUpperCase();
	}
	
	public String getModeloUpperRuntimeException() throws RuntimeException {
		return this.modelo.toUpperCase();
	}
}

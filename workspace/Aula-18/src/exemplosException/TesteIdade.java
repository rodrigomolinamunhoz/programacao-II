package exemplosException;

public class TesteIdade {

	public static void main(String[] args) {
		Pessoa p = new Pessoa(0);
		
		try {
			p.setIdadeException(-1);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			p.setIdadeRuntimeException(-1);
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			p.setIdadeIdadeException(-1);
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}
}

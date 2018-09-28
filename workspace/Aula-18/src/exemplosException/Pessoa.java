package exemplosException;

public class Pessoa {
	private int idade;

	public Pessoa(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdadeException(int idade) throws Exception {
		if (idade < 0) {
			throw new Exception("N�o � permitido idade negativa! - Exception");
		}
		this.idade = idade;
	}
	
	public void setIdadeRuntimeException(int idade) {
		if (idade < 0) {
			throw new RuntimeException("N�o � permitido idade negativa! - RuntimeException");
		}
		this.idade = idade;
	}
	
	public void setIdadeIdadeException(int idade) {
		if (idade < 0) {
			throw new IdadeException("N�o � permitido idade negativa! - IdadeException");
		}
		this.idade = idade;
	}	
}

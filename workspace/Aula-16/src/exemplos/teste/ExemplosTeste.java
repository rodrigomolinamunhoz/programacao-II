package exemplos.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exemplos.Vendedor;

class ExemplosTeste {

	@Test
	void testeMetodoSalarioComComissao() {
		Vendedor v = new Vendedor("Rodrigo", 1000, 5, 10);
		double esperado = v.salarioComComissao();
		assertEquals(1050.0, esperado);
	}
}

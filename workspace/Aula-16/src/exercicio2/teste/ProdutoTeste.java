package exercicio2.teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exercicio2.Sapato;

class ProdutoTeste {

	@Test
	void testeSapatoNome() {
		Sapato sapatoTeste = new Sapato("democrata", 200, 42);
		assertEquals("democrata", sapatoTeste.getNome());
	}
}

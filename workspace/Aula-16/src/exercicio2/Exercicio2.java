package exercicio2;

public class Exercicio2 {

	public static void main(String[] args) {
		Camiseta camiseta = new Camiseta("mcd", 50, 'p');
		Sapato sapato = new Sapato("democrata", 200, 42);
		
		Comprador c = new Comprador();
		c.consulta(camiseta);
		c.consulta(sapato);
	}
}

package exemplosAbstracao;

public class TesteExemplo {

	public static void main(String[] args) {
		Animal[] zoo = new Animal[2];
		
		zoo[0] = new Cavalo("Horse", "branco");
		zoo[1] = new Cachorro("Cachorro");
		
		for (int i = 0; i < zoo.length; i++) {
			zoo[i].alimentar();
		}
		
		((Cachorro) zoo[1]).latir();
	}
}
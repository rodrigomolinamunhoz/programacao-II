package exemplosAbstracao;

public class Cachorro extends Animal { 
	public Cachorro(String nome) {
		super(nome);
	}

	public void alimentar() {
		System.out.println("Ração!");
	}
	
	public void latir() {
		System.out.println("au au");
	}
}

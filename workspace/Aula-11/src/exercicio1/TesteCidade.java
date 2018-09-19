package exercicio1;

public class TesteCidade {

	public static void main(String[] args) {
		Teclado t = new Teclado();
		
		Cidade[] cidades = new Cidade[t.leInt("Digite quantas cidades voce quer cadastrar:")];
		
		for (int i = 0; i < cidades.length; i++) {
			Estado e = new Estado(t.leString("Nome Estado:"), 
								  t.leString("Sigla:"));
			Prefeito p = new Prefeito(t.leString("Nome Prefeito:"), t.leString("Partido:"));
			
			
			Hospital[] hospitais = new Hospital[t.leInt("Digite quantos hospitais voce quer:")];
			
			for (int j = 0; j < hospitais.length; j++) {
				hospitais[i] = new Hospital(t.leString("Digite nome do hospital:"),
										   t.leString("Digite o endereço:"));
			}
						
			cidades[i] = new Cidade(t.leString("Nome cidade:"), p, e, hospitais);
		}
	}
}

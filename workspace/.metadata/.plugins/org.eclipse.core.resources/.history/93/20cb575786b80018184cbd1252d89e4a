package ex3;

import java.util.Scanner;

import ex3.pessoas.Governador;
import ex3.pessoas.Prefeito;
import ex3.pessoas.Presidente;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String partido;
		
		//PRESIDENTE
		System.out.println("Digite NOME do PRESIDENTE:");
		String nomePresidente = leitor.next();
		System.out.println("Digite NOME do PARTIDO:");
		partido = leitor.next();
		Presidente pre = new Presidente(nomePresidente, partido);
		
		//GOVERNADOR
		System.out.println("Digite NOME do GOVERNADOR:");
		String nomeGovenador = leitor.next();
		System.out.println("Digite NOME do PARTIDO:");
		partido = leitor.next();
		Governador gov = new Governador(nomeGovenador, partido);
		
		//PREFEITO
		System.out.println("Digite NOME do PREFEITO:");
		String nomePartido = leitor.next();
		System.out.println("Digite NOME do PARTIDO:");
		partido = leitor.next();
		Prefeito pref = new Prefeito(nomePartido, partido);
		
		//PAIS
		System.out.println("Digite NOME do PAÍS:");
		String nomePais = leitor.next();
		Pais pais = new Pais(pre, nomePais);
		
		//ESTADO
		System.out.println("Digite NOME do ESTADO:");
		String nomeEstado = leitor.next();
		System.out.println("Digite SIGLA do ESTADO:");
		String sigla = leitor.next();
		Estado est = new Estado(gov, pais, nomeEstado, sigla);
		
		System.out.println("Digite NOME da CIDADE:");
		String nomeCidade = leitor.next();
		Cidade cid = new Cidade(pref, est, nomeCidade);
		
		System.out.println(cid.imprimir());
	}
}

package jogo;

import jogo.pessoas.Jogador;
import jogo.pessoas.Treinador;

public class Equipe {
	private Jogador goleiro;
	private Jogador zagueiro;
	private Jogador alaDireito;
	private Jogador alaEsquerdo;
	private Jogador atacante;
	private Treinador treinador;	
	public Equipe(Jogador goleiro, Jogador zagueiro, Jogador alaDireito, Jogador alaEsquerdo, Jogador atacante,
			Treinador treinador) {
		this.goleiro = goleiro;
		this.zagueiro = zagueiro;
		this.alaDireito = alaDireito;
		this.alaEsquerdo = alaEsquerdo;
		this.atacante = atacante;
		this.treinador = treinador;
	}
	public Jogador getGoleiro() {
		return goleiro;
	}
	public void setGoleiro(Jogador goleiro) {
		this.goleiro = goleiro;
	}
	public Jogador getZagueiro() {
		return zagueiro;
	}
	public void setZagueiro(Jogador zagueiro) {
		this.zagueiro = zagueiro;
	}
	public Jogador getAlaDireito() {
		return alaDireito;
	}
	public void setAlaDireito(Jogador alaDireito) {
		this.alaDireito = alaDireito;
	}
	public Jogador getAlaEsquerdo() {
		return alaEsquerdo;
	}
	public void setAlaEsquerdo(Jogador alaEsquerdo) {
		this.alaEsquerdo = alaEsquerdo;
	}
	public Jogador getAtacante() {
		return atacante;
	}
	public void setAtacante(Jogador atacante) {
		this.atacante = atacante;
	}
	public Treinador getTreinador() {
		return treinador;
	}
	public void setTreinador(Treinador treinador) {
		this.treinador = treinador;
	}	
}

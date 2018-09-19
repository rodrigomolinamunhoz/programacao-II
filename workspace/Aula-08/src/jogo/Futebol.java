package jogo;

import jogo.equipamentos.Bola;
import jogo.equipamentos.Campo;
import jogo.pessoas.Juiz;

public class Futebol {	
	private Equipe equipeUm;
	private Equipe equipeDois;
	private Juiz juiz;
	private Campo campo;
	private Bola bola;
	public Futebol(Equipe equipeUm, Equipe equipeDois, Juiz juiz, Campo campo, Bola bola) {
		this.equipeUm = equipeUm;
		this.equipeDois = equipeDois;
		this.juiz = juiz;
		this.campo = campo;
		this.bola = bola;
	}
	public Equipe getEquipeUm() {
		return equipeUm;
	}
	public void setEquipeUm(Equipe equipeUm) {
		this.equipeUm = equipeUm;
	}
	public Equipe getEquipeDois() {
		return equipeDois;
	}
	public void setEquipeDois(Equipe equipeDois) {
		this.equipeDois = equipeDois;
	}
	public Juiz getJuiz() {
		return juiz;
	}
	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}
	public Campo getCampo() {
		return campo;
	}
	public void setCampo(Campo campo) {
		this.campo = campo;
	}
	public Bola getBola() {
		return bola;
	}
	public void setBola(Bola bola) {
		this.bola = bola;
	}
}

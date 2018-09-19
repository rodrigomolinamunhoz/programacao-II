package exercicio3;

public class CrescimentoPopulacional {
	private double populacaoA;
	private double populacaoB;
	private double taxaA;
	private double taxaB;
	
	public CrescimentoPopulacional(double populacaoA, double populacaoB, double taxaA, double taxaB) {
		this.populacaoA = populacaoA;
		this.populacaoB = populacaoB;
		this.taxaA = taxaA;
		this.taxaB = taxaB;
	}
	
	public int calculaAnos()
	{
		int anos = 0;	
		if (this.populacaoA >= this.populacaoB) {
			return 0;
		}
		if (this.taxaA <= this.taxaB) {
			return 0;
		}		
		while (populacaoA < populacaoB) {
			populacaoA = populacaoA * taxaA;
			populacaoB = populacaoB * taxaB;
			anos++;
		}		
		return anos;
	}
}

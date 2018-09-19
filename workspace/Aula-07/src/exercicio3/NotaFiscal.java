package exercicio3;

public class NotaFiscal {
	public int codigo;
	public String descricao;
	public int quantidade;
	public double precoUnitario;
	
	public String imprimir()
	{
		if (codigo <= 0) {
			return "C�digo deve ser informado!";
		} else if (descricao.isEmpty() || descricao == null) {
			return "Descri��o deve ser informada!";
		} else if (quantidade <= 0) {
			return "Quantidade deve ser informada!";
		} else if (precoUnitario <= 0) {
			return "Pre�o Unit�rio deve ser informado!";
		}
		
		return "C�digo: " + (codigo) +
				" Descri��o: " + descricao +
				" Quantidade: " + quantidade +
				" Pre�o Unit�rio: " + precoUnitario;
	}
}

package exercicio3;

public class NotaFiscal {
	public int codigo;
	public String descricao;
	public int quantidade;
	public double precoUnitario;
	
	public String imprimir()
	{
		if (codigo <= 0) {
			return "Código deve ser informado!";
		} else if (descricao.isEmpty() || descricao == null) {
			return "Descrição deve ser informada!";
		} else if (quantidade <= 0) {
			return "Quantidade deve ser informada!";
		} else if (precoUnitario <= 0) {
			return "Preço Unitário deve ser informado!";
		}
		
		return "Código: " + (codigo) +
				" Descrição: " + descricao +
				" Quantidade: " + quantidade +
				" Preço Unitário: " + precoUnitario;
	}
}

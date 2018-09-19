package exercicio3;

public class TesteNotaFiscal {
	public static void main(String[] args) {
		NotaFiscal n = new NotaFiscal();
		
		n.codigo = 675675;
		n.descricao = "Iphone X";
		n.quantidade = 1;
		n.precoUnitario = 4.000;
		
		System.out.println(n.imprimir());
	}
}

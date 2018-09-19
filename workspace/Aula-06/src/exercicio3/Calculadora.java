package exercicio3;

public class Calculadora {
	
	public int soma(int valorUm, int valorDois) 
	{
		return valorUm + valorDois;
	}
	
	public int subtracao(int valorUm, int valorDois)
	{
		return valorUm - valorDois;
	}
	
	public int multiplicacao(int valorUm, int valorDois)
	{
		return valorDois * valorUm;
	}
	
	public int divisao(int valorUm, int valorDois)
	{
		return valorUm / valorDois;
	}
	
	public int media(int[] array)
	{
		int soma = 0;
		
		for (int i = 0; i < array.length; i++) {
			soma = soma + array[i];
		}
		
		return soma / array.length;
	}
}

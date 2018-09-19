package lista02;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
        final int ANO_EM_DIAS = 365;  
        final int DIAS_DO_MES = 30;    
        
  		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número de dias: (int):");
		int diasInformado = scanner.nextInt();
        
        
        Integer anos = diasInformado / ANO_EM_DIAS;  
        Integer meses = (diasInformado % ANO_EM_DIAS) / DIAS_DO_MES;  
        Integer dias = (diasInformado % DIAS_DO_MES); 
        
        System.out.println("Anos: " + anos + " Mês: " + meses + " Dias: " + dias);
	}
}

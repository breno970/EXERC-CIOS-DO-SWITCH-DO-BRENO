package Exerc�cios_Switch;

import java.util.Scanner;

public class Exerc�cios_Switch_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int cod,qtd;
		double valor_total= 0;
		
		System.out.println ("Especifica��o                   C�digo        Pre�o\r\n" + 
				            "Cachorro quente                  100          3,20\r\n" + 
				            "Bauru simples                    101          4,30\r\n" +  
				            "Bauru com ovo                    102          5,50\r\n" + 
				            "Hamb�rger                        103          3,20\r\n" + 
				            "Cheeseburguer                    104          4,30\r\n" + 
				            "Refrigerante                     105          4,00");
	Scanner leitor= new Scanner(System.in);
		
		
	System.out.println("DIgite o c�digo do produto que voc� deseja:");
	cod = leitor.nextInt();
	
	System.out.println("Digite a quantidade");
	qtd = leitor.nextInt();
	
	switch(cod) {
	
	case 100:
	System.out.println ("Cachoro Quente");
	valor_total = qtd * 3.20;
	break;
	
	
	case 101:
	System.out.println ("Bauru simples");
	valor_total = qtd * 4.30;
	break;
	

	case 102:
	System.out.println ("Bauru com ovo");
	valor_total = qtd * 5.50;
	break;
	
	
	case 103:
	System.out.println ("Hamb�rger");
	valor_total = qtd * 3.20;
	break;
	

	case 104:
	System.out.println ("Cheeseburguer");
	valor_total = qtd * 4.30;
	break;
	
	
	case 105:
	System.out.println ("Refrigerante");
	valor_total = qtd * 4.00;
	break;
	
	}
	
	System.out.println("Valor Total= " + valor_total);
}
}
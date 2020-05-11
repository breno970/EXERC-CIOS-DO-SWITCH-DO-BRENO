package Exercícios_Switch;

import java.util.Scanner;

public class Exercícios_Switch_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner leitor = new Scanner (System.in);
		
		int cod,pag = 0;
		double price = 0;
		
		System.out.println("Boa tarde, Qual é o valor da etiqueta:");
		price=leitor.nextInt();
		
		System.out.println("Selecione uma forma de pagamento\r\n"+
				"1=À vista ou em Cheque com 10% de desconto\r\n"+
				"2=À vista com cartão de crédito, com 5% de desconto\r\n"+
				"3=Em 2 vezes, preço normal de etiqueta sem juros\r\n"+ 
				"4=Em 3 vezes, preço de etiqueta com acréscimo de 10%");
		cod= (int) leitor.nextFloat();
		
		switch(cod) {
		
		case 1:
		    System.out.println("Custará "+(price-(price/100*10)));
		    price=pag;
		    break;
		    
			case 2:
			System.out.println("Custará "+(price-(price/100*5)));
			 price=pag;
			break;
			
			case 3:
			System.out.println("Custará duas parcelas de "+price/2);
			 price=pag;
			break;
			
			case 4:
			System.out.println("Custará 3 parcelas de "+(price+(price/100*10))/3);
			 price=pag;
			break;
			
			default:
			System.out.println("Essa opção não está disponível.");
			
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

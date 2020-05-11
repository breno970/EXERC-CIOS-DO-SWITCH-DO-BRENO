package Exercícios_Switch;

import java.util.Scanner;

public class Exercícios_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cod_produto;
		
		System.out.println("001 = Parafuso\r\n" + 
		          "002 = Porca\r\n" + 
		          "003 = Prego\r\n" + 
		          "004 = Ferramenta\r\n" +
		          "Outra Combinação = Diversos");
		Scanner leitor=new Scanner(System.in);
		
			System.out.printf("Digite um código:");
			cod_produto = leitor.next();
			
			switch(cod_produto){
			
			case "001":
			System.out.println("Parafuso");
			break;
			
			case "002":
			System.out.println("Porca");
			break;
				
			case "003":
			System.out.println("Prego");
			break;
				
			case "004":
			System.out.println("Ferramenta");
			break;
				default:
					System.out.println("Diversos");
			
			
			
			
			}
			
		}

	}

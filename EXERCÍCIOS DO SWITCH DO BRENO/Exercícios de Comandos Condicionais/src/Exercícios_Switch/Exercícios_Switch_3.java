package Exerc�cios_Switch;

import java.util.Scanner;

public class Exerc�cios_Switch_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int cod;
		
		System.out.println("Escolha uma op��o\r\n" + 
				          "1 para Executar a rotina de Inclus�o de Alunos\r\n" + 
				          "2 para Executar a rotina de Altera��o de Alunos\r\n" + 
			              "3 para Executar a rotina de Exclus�o de Alunos\r\n" + 
				          "4 para Executar a rotina de Consulta de Alunos");
		
		Scanner leitor= new Scanner(System.in);
		
		System.out.println("Escolha uma op��o:");
		cod = leitor.nextInt();
		
		switch(cod) {
		
		case 1:
			System.out.println ("Executando a rotina de Inclus�o de Alunos...");
			break;
			
		case 2:
			System.out.println ("Executando a rotina de Altera��o de Alunos...");
			break;
			
		case 3:
			System.out.println ("Executando a rotina de Exclus�o de Alunos...");
			break;
			
		case 4:
			System.out.println ("Executando a rotina de Consulta de Alunos...");
			break;
			
		
		}
	}
}
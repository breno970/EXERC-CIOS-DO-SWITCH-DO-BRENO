package Exercícios_Switch;

import java.util.Scanner;

public class Exercícios_Switch_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int cod;
		
		System.out.println("Escolha uma opção\r\n" + 
				          "1 para Executar a rotina de Inclusão de Alunos\r\n" + 
				          "2 para Executar a rotina de Alteração de Alunos\r\n" + 
			              "3 para Executar a rotina de Exclusão de Alunos\r\n" + 
				          "4 para Executar a rotina de Consulta de Alunos");
		
		Scanner leitor= new Scanner(System.in);
		
		System.out.println("Escolha uma opção:");
		cod = leitor.nextInt();
		
		switch(cod) {
		
		case 1:
			System.out.println ("Executando a rotina de Inclusão de Alunos...");
			break;
			
		case 2:
			System.out.println ("Executando a rotina de Alteração de Alunos...");
			break;
			
		case 3:
			System.out.println ("Executando a rotina de Exclusão de Alunos...");
			break;
			
		case 4:
			System.out.println ("Executando a rotina de Consulta de Alunos...");
			break;
			
		
		}
	}
}
package Exerc�cios_Switch;

import java.util.Scanner;

public class Exerc�cios_Switch_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leitor = new Scanner (System.in);
		
		int cod;
		float n1, n2, n3;
		
		System.out.println(" Digite sua primeira nota:");
		n1=leitor.nextFloat();
		
		System.out.println(" Digite sua segunda nota:");
		n2=leitor.nextFloat();
		
		System.out.println(" Digite sua terceira nota:");
		n3=leitor.nextFloat();
		
		System.out.println(" Digite 1 para exibir sua m�dia aritim�tica\r\n "+
				          "2 para a m�dia ponderada");
		cod=leitor.nextInt();
		
		switch (cod) {
		
		case 1:
		System.out.println(" Sua m�dia � "+(n1+n2+n3)/3);
		
		case 2:
			System.out.println(" Sua m�dia � "+((n1*3)+(n2*3)+(n3*4))/3);
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
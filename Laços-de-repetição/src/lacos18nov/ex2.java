package lacos18nov;

/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

import java.util.Scanner;

public class ex2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int i, par = 0, num, impar = 0;
		
		for (i = 1;  i <= 10; i++){
			System.out.println ("Digite um n�mero: ");
			num = ler.nextInt();
		        
		        if (num%2==0) {
		        	par=par+1;
		        	impar = 10 - par;
		        }
		    }
		    System.out.println("O n�mero de elementos pares no conjunto digitado �: " + par);
		    System.out.printf("O n�mero de elementos �mpares no conjunto digitado �: " + impar);
		}	
	}

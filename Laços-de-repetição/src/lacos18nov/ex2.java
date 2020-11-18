package lacos18nov;

/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

import java.util.Scanner;

public class ex2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int i, par = 0, num, impar = 0;
		
		for (i = 1;  i <= 10; i++){
			System.out.println ("Digite um número: ");
			num = ler.nextInt();
		        
		        if (num%2==0) {
		        	par=par+1;
		        	impar = 10 - par;
		        }
		    }
		    System.out.println("O número de elementos pares no conjunto digitado é: " + par);
		    System.out.printf("O número de elementos ímpares no conjunto digitado é: " + impar);
		}	
	}

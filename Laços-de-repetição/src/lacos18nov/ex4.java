package lacos18nov;

/* Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 */

import java.util.Scanner;

public class ex4 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int num, soma = 0;
		System.out.println("Digite um número: ");
		
		do {
			num = ler.nextInt();
			soma = soma + num;
		}
		while (num != 0);
		
		System.out.println("A soma dos números digitados é: "+ soma);
		
	}

}

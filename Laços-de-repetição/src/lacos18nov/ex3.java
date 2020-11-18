package lacos18nov;

/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/

import java.util.Scanner;

public class ex3 {
	public static void main (String args[]) {
		int idade = 0, menor21 = 0, maior50 = 0;
		Scanner ler = new Scanner (System.in);
		
		while(idade != -99) {
			System.out.println("Digite a idade: ");
			idade = ler.nextInt();
			if (idade < 21) {
				menor21 = menor21 +1;
			}
			if (idade > 50) {
				maior50 = maior50 +1;
			}
			if (idade < 0) {
				System.out.println("A idade inserida não é válida");
			}
		}
		
		System.out.println("A quantidade de pessoas com menos de 21 anos é: "+ menor21);
		System.out.println("A quantidade de pessoas com mais de 50 anos é: "+ maior50);
	}

}

package matrizesvetorespoo;

import java.util.Scanner;

/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos,
escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, 
contabilize e apresente também quantas foram as ocorrências da maior pontuação. */

public class ex1 {
	public static void main (String args []) {
		Scanner entrada = new Scanner (System.in);
		
		int maiorPontuacao = 0, media = 0, vezes = 0, i = 0;
		int[] jogadas = new int [10];
		
		for (i = 0; i < 10; i ++) {
				System.out.println("Digite o valor da jogada: ");
				jogadas [i] = entrada.nextInt();

			media += jogadas[i];
			if (jogadas[i] > maiorPontuacao)
				maiorPontuacao = jogadas[i];
		}		
		for (i = 0; i < 10; i ++) {
			System.out.println("Os dados são: " + jogadas[i]);
				if (jogadas[i] == maiorPontuacao)
				vezes++;
		}
		System.out.println("A média entre os valores é: "+ media/10);
		System.out.println("O maior valor obtido foi: "+ maiorPontuacao + " e ele apareceu "+ vezes +" vezes.");
	}
}

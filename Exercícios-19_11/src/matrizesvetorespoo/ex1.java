package matrizesvetorespoo;

import java.util.Scanner;

/* Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos,
escreva esse vetor. A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o. */

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
			System.out.println("Os dados s�o: " + jogadas[i]);
				if (jogadas[i] == maiorPontuacao)
				vezes++;
		}
		System.out.println("A m�dia entre os valores �: "+ media/10);
		System.out.println("O maior valor obtido foi: "+ maiorPontuacao + " e ele apareceu "+ vezes +" vezes.");
	}
}

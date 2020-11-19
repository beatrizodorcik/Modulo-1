package matrizesvetorespoo;

/* Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2. */

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float [][] n1=new float[4][6], n2=new float[4][6], m1=new float[4][6], m2=new float[4][6];
		
		for (int linha = 0; linha < 4; linha++)
			for(int coluna = 0; coluna < 6; coluna++)
			{
				System.out.println("Insira o elemento N1 [" + (linha+1) +"] [" + (coluna+1) + "]:");
				n1[linha][coluna] = ler.nextFloat();
			}
		for (int linha = 0; linha < 4; linha++)
			for(int coluna = 0; coluna < 6; coluna++)
			{
				System.out.println("Insira o elemento N2 [" + (linha+1) +"] [" + (coluna+1) + "]:");
				n2[linha][coluna] = ler.nextFloat();
				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna];
				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna];
			}
		
		System.out.println("\nA matriz M1 (somas dos elementos de mesma posi��o das matrizes N1 e N2) �: ");
		for (int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 6; coluna++)
				System.out.print("\t[" + m1[linha][coluna] +"]\t");
			System.out.println();
		}
		System.out.println("\nA matriz M2 (diferen�as dos elementos de mesma posi��o das matrizes N1 e N2) �: ");
		for (int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 6; coluna++)
				System.out.print("\t[" + m2[linha][coluna] +"]\t");
			System.out.println();
		}
	}

}

package lacos18nov;

/* A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e 
n�mero de filhos. A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00.  (FOR) */

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int filhos, mediaFilhos=0, contador=0;
		double salario = 0, maiorSalario=0;
		
		for (int i = 1; i <= 20 ; i++)
		{
			salario=-1;
			filhos=-1;
			while (salario < 0 || filhos < 0)
			{
				System.out.println("\nRespostas do habitante " + i + ".");
				System.out.println("\nQual o seu sal�rio? ");
				salario = ler.nextDouble();
				System.out.println("\nQuantos filhos voc� tem? ");
				filhos = ler.nextInt();
			}
			maiorSalario += salario;
			mediaFilhos += filhos;
			
			if (salario > maiorSalario)
				maiorSalario = salario;
			if (salario <= 100)
				contador++;
		}
		
		System.out.println("\nA m�dia de sal�rio da popula��o: " + (salario/20) + " reais.");
		System.out.println("\nA m�dia de n�mero de filhos dessa popula��o: " + (mediaFilhos/20) + ".");
		System.out.println("\nO maior sal�rio da popula��o: " + maiorSalario + ".");
		System.out.println("\nO percentual de pessoas com sal�rios at� 100 reais: " + 100.0*contador/20.0 + " %.");
		}
	}


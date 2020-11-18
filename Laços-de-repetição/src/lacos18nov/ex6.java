package lacos18nov;

/* A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e 
número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  (FOR) */

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
				System.out.println("\nQual o seu salário? ");
				salario = ler.nextDouble();
				System.out.println("\nQuantos filhos você tem? ");
				filhos = ler.nextInt();
			}
			maiorSalario += salario;
			mediaFilhos += filhos;
			
			if (salario > maiorSalario)
				maiorSalario = salario;
			if (salario <= 100)
				contador++;
		}
		
		System.out.println("\nA média de salário da população: " + (salario/20) + " reais.");
		System.out.println("\nA média de número de filhos dessa população: " + (mediaFilhos/20) + ".");
		System.out.println("\nO maior salário da população: " + maiorSalario + ".");
		System.out.println("\nO percentual de pessoas com salários até 100 reais: " + 100.0*contador/20.0 + " %.");
		}
	}


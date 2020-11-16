package lacoacondicionais;

import java.util.*;

/* Faça um sistema que leia um número inteiro e 
 * mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
 */

public class ex4 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) 
		{
			System.out.println("O número "+ numero+ " é par");
		}
		
		if (numero % 2 > 0)
		{
			System.out.println("O número "+ numero+ " é ímpar");
		}
		
		if (numero >= 0) 
		{
			System.out.println("O número "+ numero+ " é positivo");
		}
		
		if (numero < 0)
		{
			System.out.println("O número "+ numero+ " é negativo");
		}
	}
}

package lacoacondicionais;

import java.util.*;

/* Fa�a um sistema que leia um n�mero inteiro e 
 * mostre uma mensagem indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.
 */

public class ex4 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.println("Digite um n�mero inteiro: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) 
		{
			System.out.println("O n�mero "+ numero+ " � par");
		}
		
		if (numero % 2 > 0)
		{
			System.out.println("O n�mero "+ numero+ " � �mpar");
		}
		
		if (numero >= 0) 
		{
			System.out.println("O n�mero "+ numero+ " � positivo");
		}
		
		if (numero < 0)
		{
			System.out.println("O n�mero "+ numero+ " � negativo");
		}
	}
}

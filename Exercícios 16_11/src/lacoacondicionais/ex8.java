package lacoacondicionais;

import java.util.*;

/* Construa um sistema para ler uma vari�vel num�rica N 
 * e imprimi-la somente se a mesma for maior que 100, caso contr�rio imprimi-la com o valor zero.
 */

public class ex8 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		float numero;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextFloat();
		
		if (numero > 100) 
		{
			System.out.println("O n�mero � "+ numero);
		}
		
		if (numero <= 100){
			numero = 0;
			System.out.println(numero);
		}
		
	}

}

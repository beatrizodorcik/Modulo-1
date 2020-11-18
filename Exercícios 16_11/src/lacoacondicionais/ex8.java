package lacoacondicionais;

import java.util.*;

/* Construa um sistema para ler uma variável numérica N 
 * e imprimi-la somente se a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
 */

public class ex8 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		float numero;
		
		System.out.println("Digite um número: ");
		numero = ler.nextFloat();
		
		if (numero > 100) 
		{
			System.out.println("O número é "+ numero);
		}
		
		if (numero <= 100){
			numero = 0;
			System.out.println(numero);
		}
		
	}

}

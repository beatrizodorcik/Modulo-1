package lacoacondicionais;

import java.util.*;

/* Receber valores de base e altura de um triângulo e 
 * verificar se são valores válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo (base* altura)/2.
 */

public class ex7 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int base, altura, area = 0;
		
		System.out.println("Digite o valor da base do triângulo: ");
		base = ler.nextInt();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		altura = ler.nextInt();
		
		if (altura >= 0 && base >= 0) {
			area = (base * altura)/2;
			System.out.println("A área do triângulo é "+ altura);
			
		}
		else {
			System.out.println("Os valores inseridos são inválidos.");
		}
	}
}

package lacoacondicionais;

import java.util.*;

/* Receber valores de base e altura de um tri�ngulo e 
 * verificar se s�o valores v�lidos (positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo (base* altura)/2.
 */

public class ex7 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int base, altura, area = 0;
		
		System.out.println("Digite o valor da base do tri�ngulo: ");
		base = ler.nextInt();
		
		System.out.println("Digite o valor da altura do tri�ngulo: ");
		altura = ler.nextInt();
		
		if (altura >= 0 && base >= 0) {
			area = (base * altura)/2;
			System.out.println("A �rea do tri�ngulo � "+ altura);
			
		}
		else {
			System.out.println("Os valores inseridos s�o inv�lidos.");
		}
	}
}

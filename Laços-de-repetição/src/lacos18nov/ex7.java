package lacos18nov;
/* Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o  m�ltiplos de tr�s 
 * e que se encontram no conjunto dos n�meros de 1 at� 500. (FOR)
 */

public class ex7 {
	public static void main(String[] args) {
		int num, soma = 0;
		for(num=1; num<=500; num++) {
			if(num % 3 == 0 && num % 2 != 0) {
				soma = soma + num;
			}
		}
		System.out.println("A soma dos n�meros divis�veis por 3 de 1 a 500 �: "+ soma);		
	}
}

package lacoacondicionais;

import java.util.*;

/*  Desenvolva um sistema em que:
Leia 4 (quatro) n�meros;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
*/

public class ex3 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int a, b, c, d, quadA, quadB, quadC, quadD;
		System.out.println("Digite o n�mero A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o n�mero B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o n�mero C: ");
		c = ler.nextInt();
		
		System.out.println("Digite o n�mero D: ");
		d = ler.nextInt();
		
		quadA = a * a;
		quadB = b * b;
		quadC = c * c;
		quadD = d * d;
		
		if (quadC >= 1000) {
			System.out.println("O quadrado do n�mero C excede 1000, uma vez que �: "+ quadC);
		}
		else {
			System.out.println("O quadrado do n�mero A (" + a + ") corresponde ao valor: "+ quadA+".");
			System.out.println("O quadrado do n�mero A (" + b + ") corresponde ao valor: "+ quadB+".");
			System.out.println("O quadrado do n�mero A (" + c + ") corresponde ao valor: "+ quadC+".");
			System.out.println("O quadrado do n�mero A (" + d + ") corresponde ao valor: "+ quadD+".");
		}
		
		
	}

}

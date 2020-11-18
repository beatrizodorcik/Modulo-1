package lacoacondicionais;

import java.util.*;

/*  Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

public class ex3 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int a, b, c, d, quadA, quadB, quadC, quadD;
		System.out.println("Digite o número A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o número B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o número C: ");
		c = ler.nextInt();
		
		System.out.println("Digite o número D: ");
		d = ler.nextInt();
		
		quadA = a * a;
		quadB = b * b;
		quadC = c * c;
		quadD = d * d;
		
		if (quadC >= 1000) {
			System.out.println("O quadrado do número C excede 1000, uma vez que é: "+ quadC);
		}
		else {
			System.out.println("O quadrado do número A (" + a + ") corresponde ao valor: "+ quadA+".");
			System.out.println("O quadrado do número A (" + b + ") corresponde ao valor: "+ quadB+".");
			System.out.println("O quadrado do número A (" + c + ") corresponde ao valor: "+ quadC+".");
			System.out.println("O quadrado do número A (" + d + ") corresponde ao valor: "+ quadD+".");
		}
		
		
	}

}

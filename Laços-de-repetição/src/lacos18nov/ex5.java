package lacos18nov;

/* Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
import java.util.Scanner;

public class ex5 {
	public static void main (String args[]) {
		int n, soma = 0, cont = 0;
		float media = 0;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite um número: ");
		
		do {
			n = ler.nextInt();
			if (n % 3 == 0) {
				soma = soma + n;
				cont ++;
				media = soma / cont;
			}
		}
		while (n != 0);
		
		System.out.println("A média dos números é: "+ media);
		
	}

}

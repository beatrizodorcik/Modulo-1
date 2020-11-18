package lacos18nov;

/* Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
 * (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
 * deveremos observar na tela a seguinte sequência: 5 15 45 135. (WHILE)
 */

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, valor;
		
		System.out.println("\nEntre com o número: ");
		num = ler.nextInt();
		valor = num;
		
		while (valor >0 && valor < 100){
			valor = valor*3; 
			System.out.println("\n" + valor);
		}
	}			
}			
		


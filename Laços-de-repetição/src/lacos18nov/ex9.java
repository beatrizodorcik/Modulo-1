package lacos18nov;

/* Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s  
 * (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio digita 5,  
 * deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135. (WHILE)
 */

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, valor;
		
		System.out.println("\nEntre com o n�mero: ");
		num = ler.nextInt();
		valor = num;
		
		while (valor >0 && valor < 100){
			valor = valor*3; 
			System.out.println("\n" + valor);
		}
	}			
}			
		


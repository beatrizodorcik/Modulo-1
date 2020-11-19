package lacoacondicionais;

import java.util.*;

/* João TOMATEIRO, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
 * deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates)
 * e verifique se há excesso. 
 * Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
 * Caso contrário mostrar tais variáveis com o conteúdo ZERO.
 */

public class ex1 {
	public static void main (String args[]) {
		Scanner ent = new Scanner (System.in);
		float peso;
		float excesso = 0;
		float multa = 0;
		
		System.out.printf("Entre com o peso de tomates (em kg): ");
		peso = ent.nextFloat ();
		
		if(peso>50) {
			excesso = peso - 50;
			multa = excesso * 4;
			System.out.println("Você excedeu o peso em " + excesso + " kg, e deverá pagar uma multa no valor de R$"+ multa);
		}
		else{
			System.out.println("Você não excedeu o peso, ou seja: " + excesso + " kg de excesso e portanto sua multa é R$" + multa);
		}
		
	}
}

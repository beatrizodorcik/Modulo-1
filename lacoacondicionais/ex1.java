package lacoacondicionais;

import java.util.*;

/* Jo�o TOMATEIRO, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
 * deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates)
 * e verifique se h� excesso. 
 * Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. 
 * Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
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
			System.out.println("Voc� excedeu o peso em " + excesso + " kg, e dever� pagar uma multa no valor de R$"+ multa);
		}
		else{
			System.out.println("Voc� n�o excedeu o peso, ou seja: " + excesso + " kg de excesso e portanto sua multa � R$" + multa);
		}
		
	}
}

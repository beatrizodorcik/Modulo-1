package lacoacondicionais;

import java.util.*;

/* Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. 
 * E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. 
 * Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, 
 * caso contr�rio zerar tal vari�vel. 
 * A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio excedente.
 */

public class ex2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int c, n, salario, e=0, salE, total;
		System.out.println("Digite o c�digo do oper�rio: ");
		c = ler.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		n = ler.nextInt();
		
		salario = n *10;
		
		if (n>10) {
			e = n - 50;
			salE = e * 20;
			total = salE + salario;
			
			System.out.println("O sal�rio do funcion�rio � R$"+ salario + ", e o sal�rio excedente � R$"+ salE);
		}
	}

}

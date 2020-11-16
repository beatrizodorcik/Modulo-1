package lacoacondicionais;

import java.util.*;

/* Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
 * E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
 * caso contrário zerar tal variável. 
 * A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
 */

public class ex2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		int c, n, salario, e=0, salE, total;
		System.out.println("Digite o código do operário: ");
		c = ler.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		n = ler.nextInt();
		
		salario = n *10;
		
		if (n>10) {
			e = n - 50;
			salE = e * 20;
			total = salE + salario;
			
			System.out.println("O salário do funcionário é R$"+ salario + ", e o salário excedente é R$"+ salE);
		}
	}

}

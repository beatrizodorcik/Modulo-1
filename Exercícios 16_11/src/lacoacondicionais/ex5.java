package lacoacondicionais;

import java.util.*;

/* A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes do 
 * meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. 
 * Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
 * se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades,
 * se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
 * Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
 */

public class ex5 {
	public static void main (String args[]) {
		double indice;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o índice de poluição: ");
		indice = ler.nextDouble();
		
		if (indice >= 0.05 && indice <= 0.25) {
			System.out.println("O índice de poluição esté em um nível aceitável");
		}
		else if (indice == 0.3) {
			System.out.println("Indústrias do grupo 1: Suspendam as atividades");
		}
		else if (indice == 0.4) {
			System.out.println("Indústrias do grupo 1 e 2: Suspendam as atividades");
		}
		else if (indice == 0.5) {
			System.out.println("Indústria do grupo 1, 2 e 3: Suspendam as atividades");
		}		
	}
}

package lacoacondicionais;

import java.util.*;

/* A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o altamente poluentes do 
 * meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. 
 * Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, 
 * se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades,
 * se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
 * Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.
 */

public class ex5 {
	public static void main (String args[]) {
		double indice;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o �ndice de polui��o: ");
		indice = ler.nextDouble();
		
		if (indice >= 0.05 && indice <= 0.25) {
			System.out.println("O �ndice de polui��o est� em um n�vel aceit�vel");
		}
		else if (indice == 0.3) {
			System.out.println("Ind�strias do grupo 1: Suspendam as atividades");
		}
		else if (indice == 0.4) {
			System.out.println("Ind�strias do grupo 1 e 2: Suspendam as atividades");
		}
		else if (indice == 0.5) {
			System.out.println("Ind�stria do grupo 1, 2 e 3: Suspendam as atividades");
		}		
	}
}

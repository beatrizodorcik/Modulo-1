package exercicios13;

import java.util.Scanner;

/* 1. Fa�a um sistema que leia as 3 notas de um 
 * aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � ponderada e
 * que o peso das notas �: 2,3 e 5, respectivamente.
 */

public class ex1 {
	
	public static void main (String args []) {
		Scanner ent = new Scanner(System.in);
        float nota1, nota2, nota3;
        float media;
        
        System.out.println("\n Digite sua 1� nota: ");
        nota1 = ent.nextInt();
        
        System.out.println("\n Digite sua 2� nota: ");
        nota2 = ent.nextInt();
        
        System.out.println("\n Digite sua 3� nota: ");
        nota3 = ent.nextInt();
		
        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        System.out.print("\n A m�dia do aluno � " + media);
	}

}

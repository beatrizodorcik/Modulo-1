package exercicios13;

import java.util.Scanner;

/* 1. Faça um sistema que leia as 3 notas de um 
 * aluno e calcule a média final deste aluno. Considerar que a média é ponderada e
 * que o peso das notas é: 2,3 e 5, respectivamente.
 */

public class ex1 {
	
	public static void main (String args []) {
		Scanner ent = new Scanner(System.in);
        float nota1, nota2, nota3;
        float media;
        
        System.out.println("\n Digite sua 1ª nota: ");
        nota1 = ent.nextInt();
        
        System.out.println("\n Digite sua 2ª nota: ");
        nota2 = ent.nextInt();
        
        System.out.println("\n Digite sua 3ª nota: ");
        nota3 = ent.nextInt();
		
        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        System.out.print("\n A média do aluno é " + media);
	}

}

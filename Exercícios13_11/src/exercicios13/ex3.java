package exercicios13;

import java.util.Scanner;

/* 3. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
 * calcule a seguinte express�o: d = R + S /2  
 */

public class ex3 {
	public static void main (String args []){
		Scanner ent = new Scanner(System.in);
	    int numA, numB, numC;
	   
	    System.out.println("\n Digite o n�mero A: ");
	    numA = ent.nextInt();
	    
	    System.out.println("\n Digite o n�mero B: ");
	    numB = ent.nextInt();
	    
	    System.out.println("\n Digite o n�mero C: ");
	    numC = ent.nextInt();
	    
	    float r = (numA + numB) * (numA + numB);
	    float s = (numB + numC) * (numB + numC);
	    float d = (r + s)/2;
	    
	    System.out.println("O valor da express�o D �: "+ d);
	    
	}
	
	

}

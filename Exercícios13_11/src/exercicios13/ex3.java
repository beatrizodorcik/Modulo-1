package exercicios13;

import java.util.Scanner;

/* 3. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
 * calcule a seguinte expressão: d = R + S /2  
 */

public class ex3 {
	public static void main (String args []){
		Scanner ent = new Scanner(System.in);
	    int numA, numB, numC;
	   
	    System.out.println("\n Digite o número A: ");
	    numA = ent.nextInt();
	    
	    System.out.println("\n Digite o número B: ");
	    numB = ent.nextInt();
	    
	    System.out.println("\n Digite o número C: ");
	    numC = ent.nextInt();
	    
	    float r = (numA + numB) * (numA + numB);
	    float s = (numB + numC) * (numB + numC);
	    float d = (r + s)/2;
	    
	    System.out.println("O valor da expressão D é: "+ d);
	    
	}
	
	

}

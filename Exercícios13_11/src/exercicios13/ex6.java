package exercicios13;

import java.util.Scanner;

/* 6.Faça um sistema que leia a idade de uma pessoa expressa em dias
e mostre-a expressa em anos, meses e dias.*/

public class ex6 {
	public static void main (String args []) {
		Scanner ent = new Scanner(System.in);
	    int dia, mes, ano, idade;
	    
	    System.out.println("Digite sua idade em dias: ");
	    idade = ent.nextInt();
	    
	    ano = idade / 365;
	    mes = (idade / 365) / 12;
	    dia = (idade % 365) % 30;
	    
	    System.out.println("A idade " + idade+ " expressas em dias, equivale a " + ano+ " anos, "+ mes + " meses e "+ dia+ " dias.");
	    
	    
	}

}

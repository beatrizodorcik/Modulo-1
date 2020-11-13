package exercicios13;

import java.util.Scanner;

/* 5. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
 meses e dias e mostre-a expressa apenas em dias. */

public class ex5 {
	public static void main (String args[]) {
		Scanner ent = new Scanner(System.in);
	    int dia, mes, ano, idade;
	    
	    System.out.println("Escreva sua idade em anos: ");
	    ano = ent.nextInt();
	    
	    System.out.println("Escreva sua idade em meses: ");
	    mes = ent.nextInt();
	    
	    System.out.println("Escreva sua idade em dias: ");
	    dia = ent.nextInt();
	    
	    ano = ano * 365;
	    mes = mes * 30;
	    idade = ano + mes + dia;
	    
	    System.out.println("A sua idade em dias é "+ idade + " dias");
	    
	}

}

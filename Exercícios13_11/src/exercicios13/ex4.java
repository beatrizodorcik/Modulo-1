package exercicios13;

import java.util.Scanner; 

/* 4.	Faça um sistema que leia o tempo de duração
 * de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos
 */

public class ex4 {
	public static void main (String args[]) {
		Scanner ent = new Scanner(System.in);
		
		int duracaoSegundos, horas, minutos, segundos;
		
		System.out.println("\n Digite a duração do evento (em segundos): ");
        duracaoSegundos = ent.nextInt();
        
        horas = duracaoSegundos / 3600; 
        minutos = (duracaoSegundos - (horas * 3600)) / 60;
        segundos = duracaoSegundos % 60;
        
        System.out.println("A duração do evento foi "+ horas + " horas, " + minutos +" minutos e "+ segundos + " segundos.");
	}

}

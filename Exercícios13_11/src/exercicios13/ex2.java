package exercicios13;

import java.util.Scanner;

/* 2.	O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e 
 * dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor 
 * seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
 */

public class ex2 {
	public static void main (String args []) {
		Scanner ent = new Scanner(System.in);
		double custoConsumidor, custoFabrica, custoFabricaImpostos;
		double distribuidora = 1.28, impostos = 1.45;
		
		System.out.println("\n Digite o custo de f�brica do carro: ");
        custoFabrica = ent.nextInt();
        
        custoFabricaImpostos = custoFabrica * impostos;
        custoConsumidor = custoFabricaImpostos * distribuidora;
        
        System.out.print("\n O custo de f�brica � R$" + custoFabrica + " e adicionado os impostos, o valor � R$"+ custoFabricaImpostos);
        System.out.print("\n O custo do consumidor � R$" + custoConsumidor);
        
		
	}

}

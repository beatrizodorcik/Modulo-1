package lacos18nov;

/* Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 
 * quando estiver entre 300 e 400 e de 5 em 5 quando não estiver. (DO...WHILE)
 */

public class ex10 {
	public static void main(String[] args) {
		
		int num=233;
		
		do
		{
			System.out.println("\n"+ num);
			num = num + 3;
		} while (num < 300);
		do
		{
			System.out.println("\n"+ num);
			num = num + 5;
		} while (num < 400);
		do
		{
			System.out.println("\n"+ num);
			num = num + 3;
		} while (num < 457);
	}
}

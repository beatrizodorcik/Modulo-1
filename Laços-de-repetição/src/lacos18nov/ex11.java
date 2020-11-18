package lacos18nov;

/* Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28. .(DO...WHILE)
 */
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	
		int num=0 , sum=0;
		
		while (num <= 0)
		{
			System.out.println("\nEntre com o número: ");
			num = ler.nextInt();
		}		
		
		do
		{
			sum += num;
			num--;
		} while (num > 0);
		
		System.out.println("\nA soma dos números é: " + sum);
	}

}

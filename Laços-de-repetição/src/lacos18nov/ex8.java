package lacos18nov;

/* Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no final o total do somat�rio, 
 * a m�dia e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo 
 * valores positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor negativo. (WHILE)
 */
import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num = 0, cont = 0, soma = 0;
		
		
		while (num >= 0) {
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			
			if (num >= 0){
				soma = soma + num;
				cont ++;
            }
            
			else{
            }
		}
		System.out.println("A soma � " + soma);
        System.out.println("A quantidade de numeros digitados � " + cont);
        System.out.println("A media � " + soma / cont);
	}
}

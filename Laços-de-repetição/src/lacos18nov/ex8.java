package lacos18nov;

/* Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
 * a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
 * valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo. (WHILE)
 */
import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num = 0, cont = 0, soma = 0;
		
		
		while (num >= 0) {
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			if (num >= 0){
				soma = soma + num;
				cont ++;
            }
            
			else{
            }
		}
		System.out.println("A soma é " + soma);
        System.out.println("A quantidade de numeros digitados é " + cont);
        System.out.println("A media é " + soma / cont);
	}
}

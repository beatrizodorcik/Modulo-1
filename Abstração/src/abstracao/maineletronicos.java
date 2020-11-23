package abstracao;

public class maineletronicos {
	public static void main(String[] args) {
		produtosEletronicos televisao = new produtosEletronicos("4K", "Estéreo", "LG", "LG600");
		
		System.out.println(televisao.ligar());
		System.out.println(televisao);
		System.out.println();
		System.out.println(televisao.desligar());
		System.out.println(televisao);
	}
}

package hierarquia;

public class main {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Julie", 1, "AU AU AU!!", "Ela corre, e muito!");
		Cavalo cavalo = new Cavalo ("Aladim", 12, "IRRRIINN", "Ele trota e corre bastante");
		Preguica preguica = new Preguica ("Doroteia", 4, "AAAAAHHHZNN", "Sobe em árvores e lá fica");
		

		System.out.println("Cachorro: "+ cachorro.getNome() +", "+  cachorro.getIdade() +", "+ cachorro.getEmitirSom() +", "+ cachorro.getCorrer());
		System.out.println("Cavalo: " +cavalo.getNome() +", "+ cavalo.getIdade() +", "+ cavalo.getEmitirSom() +", "+ cavalo.getCorrer());
		System.out.println("Preguiça: " +preguica.getNome() +", "+ preguica.getIdade() +", "+ preguica.getEmitirSom() +", "+ preguica.getSubirEmArvores());
	
	} 
}

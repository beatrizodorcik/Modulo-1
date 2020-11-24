package hierarquia;

public class Preguica extends Animal{
	
	private  String subirEmArvores;
	
	public Preguica(String nome, int idade, String emitirSom, String subirEmArvores) {
		super(nome, idade, emitirSom);
		this.subirEmArvores = subirEmArvores;
	}

	public  String getSubirEmArvores() {
		return subirEmArvores;
	}

	public void setSubirEmArvores(String subirEmArvores) {
		this.subirEmArvores = subirEmArvores;
	}

	
}

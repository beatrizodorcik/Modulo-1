package abstracao;

/* Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe,
 * em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */

public class produtosEletronicos {
	private String imagem;
	private String som;
	private String marca; 
	private String modelo;
	private boolean ligar;
	private boolean desligar;
	private boolean sintonizar; 
	
	
	public produtosEletronicos(String imagem, String som, String marca, String modelo) {
		this.imagem = imagem;
		this.som = som;
		this.marca = marca;
		this.modelo = modelo;	
	}


	public String getImagem() {
		return imagem;
	}


	public void setImagem(String imagem) {
		this.imagem = imagem;
	}


	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public boolean isLigar() {
		return ligar;
	}


	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}


	public boolean isDesligar() {
		return desligar;
	}


	public void setDesligar(boolean desligar) {
		this.desligar = desligar;
	}


	public boolean isSintonizar() {
		return sintonizar;
	}


	public void setSintonizar(boolean sintonizar) {
		this.sintonizar = sintonizar;
	}
	
	public String ligar() {
		if (!ligar) {
			ligar = true; 
			return "Ligado";
		}
		return "Ligado";
	}
	
	public String desligar() {
		if (ligar) {
			ligar = false; 
			return "Desligado";
		}
		return "Desligado";
	}
	
	@Override
	public String toString () {
		return "Imagem: "+ this.imagem+
				"\nSom: "+ this.som+
				"\nMarca: "+this.marca+
				"\nModelo: "+this.modelo+
				"\nSituação da TV: "+ this.ligar;
	}
}

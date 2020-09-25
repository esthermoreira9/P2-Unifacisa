package varemetodos;

public class Carro {
	// questão do exercicio de variaveis de instancia e de classe

	String nome, marca, cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;
	
	static boolean promocao;
	
	// construtor com argumento nome, marca e precoBase
	Carro(String nome, String marca, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		
		this.portas = 2;
		this.cor = "BRANCA";
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	}
	
	// construtor com todos os atributos como argumento
	Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, 
			boolean arCondicionado, boolean cambioAutomatico, boolean direcaoEletrica, double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	
	
	// construtor vazio
	Carro(){
		this.nome = "Gol";
		this.marca = "Volkswagen";
		this.cor = "BRANCA";
		this.portas = 4;
		this.vidroEletrico = true;
		this.arCondicionado = true;
		this.cambioAutomatico = true;
		this.direcaoEletrica = true;
		this.precoBase = 55000;
	}
	
	double calculaPreco() {
		
		double preco = precoBase;
		
		switch(cor) {
			case "BRANCA":
			case "AZUL":
			case "VERMELHA":
			case "PRETA": break;
			default: preco += 1000;
		}
		
		if (vidroEletrico == true) {
			preco += 1250;
		}
		if (arCondicionado == true) {
			preco += 1250;
		}
		if (cambioAutomatico == true) {
			preco += 1250;
		}
		if (direcaoEletrica == true) {
			preco += 1250;
		}
		if (promocao == true) {
			preco *= 0.90;
		}
		
		return preco;
	}
	
	public String toString() {
		String desc = "";
		desc += "Nome: "+nome+"\n";
		desc += "Marca: "+marca+"\n";
		desc += "Cor: "+cor+"\n";
		desc += "Quantidade de Portas: "+portas+"\n";
		desc += "Vidro Elétrico: "+vidroEletrico+"\n";
		desc += "Ar Condicionado: "+arCondicionado+"\n";
		desc += "Cambio Automático: "+cambioAutomatico+"\n";
		desc += "Direção Elétrica: "+direcaoEletrica+"\n";
		desc += "Preço: "+calculaPreco()+"\n";
		
		return desc;
	}
	
}

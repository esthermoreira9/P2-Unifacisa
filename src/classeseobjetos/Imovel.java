package classeseobjetos;

public class Imovel {

	String tipo, imobiliaria;
	int andares, pavimentos, quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
	
	Imovel(String imobiliaria, int quartos,int suites, int banheiros, 
			int metrosQuadrados, boolean piscina, boolean quadra) {
		this.tipo = "Casa";
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	Imovel (String imobiliaria, int andares, int pavimentos, int quartos, int suites, int banheiros,
			int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra){
		this.tipo = "Apartamento";
		this.imobiliaria = imobiliaria;
		this.andares = andares;
		this.pavimentos = pavimentos;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	double calculaPreco() {
		double preco = metrosQuadrados * 1000;
		
		if(pavimentos > 4) {
			preco += (pavimentos - 4)*2000;
		}
		if(elevador == true) {
			preco += 2500;
		}
		if(piscina == true) {
			preco += 2500;
		}
		if(quadra == true) {
			preco += 2500;
		}
		return preco;
	}
	
	public String toString() {
		String desc = "";
		desc += "Tipo: "+tipo+"\n";
		desc += "Imobiliária: "+imobiliaria+"\n";
		desc += "Quantidade de andares: "+andares+"\n";
		desc += "Pavimento: "+pavimentos+"\n";
		desc += "Quartos: "+quartos+"\n";
		desc += "Suites "+suites+"\n";
		desc += "Banheiros: "+banheiros+"\n";
		desc += "Metros quadrados: "+metrosQuadrados+" m2"+"\n";
		desc += "Elevador: "+elevador+"\n";
		desc += "Piscina: "+piscina+"\n";
		desc += "Quadra: "+quadra+"\n";
		desc += "Preço: "+calculaPreco()+"\n";
		return desc;
	}
	
}

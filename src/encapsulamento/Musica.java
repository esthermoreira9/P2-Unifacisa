package encapsulamento;

public class Musica {
	
	private String nome, artista, letra;
	private Genero genero;
	private int anoDeLancamento, numReproduzida;
	private double duracao;
	
	public Musica(String nome, String artista, String letra, Genero genero,
					int anoDeLancamento, double duracao) {
		this.nome = nome;
		this.artista = artista;
		this.letra = letra;
		this.genero = genero;
		this.anoDeLancamento = anoDeLancamento;
		this.numReproduzida = numReproduzida;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public String getLetra() {
		return letra;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	
	public int getNumReproduzida() {
		return numReproduzida;
	}
	
	public double getDuracao() {
		return duracao;
	}
	
	public void tocarMusica() {
		this.numReproduzida++;
	}
	
	@Override
	public String toString() {
		String out = "";
		out += "Nome: "+nome+"\n";
		out += "Artista: "+artista+" / "+"Letra: "+letra+" / "+"Genero: "+genero+"\n";
		out += "Ano de lançamento: "+anoDeLancamento+" / "+"Numero de reproduções: "+numReproduzida+" / "+"Duração: "+duracao+"\n";
		return out;
	}

}

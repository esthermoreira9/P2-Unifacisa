package encapsulamento;


public class Spotify {
	
	private Musica[] musicas;
	private int qtdadeMusicas;
	
	public Spotify() {
		this(10);
	}
	
	public Spotify(int tamanhoArray) {
		this.musicas = new Musica[tamanhoArray];
		this.qtdadeMusicas = 0;
	}
	
	public void adicionarMusica(Musica m) {
		if(qtdadeMusicas >= musicas.length) {
			Musica[] aux = new Musica[2*musicas.length];
			for(int i = 0; i < musicas.length; i++) {
				aux[i] = musicas [i];
			}
			this.musicas = aux;
		}
		musicas[qtdadeMusicas] = m;
		qtdadeMusicas++;
	}
	
	public int getQtdadeMusicas() {
		return qtdadeMusicas;
	}
	
	public void removerMusicaPorNome(String nome) {
		boolean deslocarAEsquerda = false;
		for(int i = 0; i < this.qtdadeMusicas; i++) {
			if(musicas[i].getNome().equals(nome)) {
				deslocarAEsquerda = true;
				}
			if(deslocarAEsquerda) {
				this.musicas[i] = this.musicas[i+1];
			}
		}
	}
	
	public Musica[] listarMusicas(String artista) {
		int cont = 0;
		for(Musica m : musicas) {
			if(m != null && m.getArtista().equals(artista)) {
				cont++;
			}
		}
		if(cont > 0) {
			Musica[] musicasDoArtista = new Musica[cont];
			int i = 0;
			for(Musica m : musicas) {
				if(m != null && m.getArtista().equals(artista)) {
					musicasDoArtista[i] = m;
					i++;
				}
			}
			return musicasDoArtista;
		}else {
			return null;
		}
	}

	public static void main(String[] args) {
		
		Spotify spt = new Spotify(5);
		spt.adicionarMusica(new Musica("musica1", "artista1", "abc", Genero.ROCK, 2001, 3.75));
		spt.adicionarMusica(new Musica("musica2", "artista2", "abc", Genero.CLASSICO, 2002, 3.6));
		spt.adicionarMusica(new Musica("musica3", "artista3", "abc", Genero.BLUES, 2003, 3.5));
		spt.adicionarMusica(new Musica("musica4", "artista4", "abc", Genero.JAZZ, 2004, 3.2));
		spt.adicionarMusica(new Musica("musica5", "artista5", "abc", Genero.SAMBA, 2005, 3.3));
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		
		System.out.println("\n-----------------\n");
		
		spt.adicionarMusica(new Musica("musica6", "artista6", "abc", Genero.RAP, 2013, 3.1));
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		
		System.out.println("\n-----------------\n");
		
		spt.removerMusicaPorNome("musica2");
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		
		System.out.println("\n-----------------\n");
		
		Musica[] musicasArtista3 = spt.listarMusicas("artista3");
		
		for(Musica m : musicasArtista3) {
			System.out.println(m);
		}
		
	}
}

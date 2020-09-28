package strings;

public class StringUtils {

	public static String formataAtributo(String atributo) {
		String[] palavras = atributo.split(" ");
		
		String atributoFormatado = palavras[0];
		for(int i = 1; i < palavras.length; i++) {
			char ini = palavras[i].toUpperCase().charAt(0);
			String aux = String.valueOf(ini);
			aux += palavras[i].substring(1);
			
			atributoFormatado += aux;
		}
		
		return atributoFormatado;
	}
	
}

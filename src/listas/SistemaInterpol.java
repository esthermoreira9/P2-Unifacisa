package listas;

import java.util.ArrayList;
import java.util.List;

public class SistemaInterpol {
	
	private List<String> procurados;
	public SistemaInterpol() {
		this.procurados = new ArrayList<String>();
	}
	
	public void adicionarProcurado(String nome) {
		this.procurados.add(nome);
	}
	
	public boolean ehProcurado(String nome) {
		return this.procurados.contains(nome);
	}
	
	
	public static void main(String[] args ) {
		SistemaInterpol interpol = new SistemaInterpol();
		interpol.adicionarProcurado("Eduardo");
		System.out.println(interpol.ehProcurado("Eduardo"));
	}
}

	
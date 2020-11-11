package interfaces.restaurante;

public class Bebida implements Item{
	
	protected Tamanho tam;
	protected SaborBebida sabor;
	
	public Bebida(Tamanho tam, SaborBebida sabor) {
		this.sabor = sabor;
		this.tam = tam;
	}

	@Override
	public double getPreco() {
		return tam.getValor()+sabor.getValor();
	}

	@Override
	public String getDescricao() {
		return sabor.name()+" - "+tam.name();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof Bebida) {
				Bebida beb = (Bebida) obj;
				if(beb.sabor.equals(this.sabor) && beb.tam.equals(this.tam)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public SaborBebida getSabor() {
		return sabor;
	}
	
	public Tamanho getTam() {
		return tam;
	}
	
	

}

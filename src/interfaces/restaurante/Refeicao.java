package interfaces.restaurante;

public class Refeicao implements Item {

	protected Proteina prot;
	protected Carboidrato carb;
	
	public Refeicao(Proteina prot, Carboidrato carb) {
		this.carb = carb;
		this.prot = prot;
	}
	
	@Override
	public double getPreco() {
		return prot.getValor()+carb.getValor();
	}

	@Override
	public String getDescricao() {
		return prot.name()+" + "+carb.name();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof Refeicao) {
				Refeicao ref = (Refeicao) obj;
				if(ref.carb.equals(this.carb) && ref.prot.equals(this.prot)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Proteina getProteina() {
		return prot;
	}
	
	public Carboidrato getCarboidrato() {
		return carb;
	}
	

}

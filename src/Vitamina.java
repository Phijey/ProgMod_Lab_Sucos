
public class Vitamina extends Bebida {

	private static final double ACRESCIMO = 2.5;
	private static final int MAX_FRUTAS = 3;


	private enum ETamanho {
		PEQUENA(0d),
		MEDIA(0.4),
		GRANDE(0.6);

		private double ajuste;

		ETamanho(double ajuste){
			this.ajuste = ajuste;
		}
	}


	public Vitamina(EFruta fruta) {
		super("Vitamina");
		adicionar(fruta);
		
	}

	private ETamanho tamanho() {
		return ETamanho.values()[frutas.size() - 1];
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if(frutas.size() < MAX_FRUTAS)
			frutas.add(fruta);
		return frutas.size();
		
	}

	@Override 
	public double preco() {
		double valor = super.preco() + ACRESCIMO;
		return valor * (1 + tamanho().ajuste);
		
	}

	@Override 
	public String toString() {
		return super.toString() + " (" + tamanho().name().toLowerCase() + ")";
		
	}

}

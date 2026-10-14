
public class Suco extends Bebida {

	private static final int MAX_FRUTAS = 2;

	public Suco(EFruta fruta) {
		super("Suco");
		adicionar(fruta);
		
	}

	private boolean podeAdicionar(EFruta fruta) {
		boolean temLaranja = frutas.contains(EFruta.LARANJA) || fruta == EFruta.LARANJA;
		return frutas.size() < MAX_FRUTAS
			&& (frutas.isEmpty() || temLaranja);
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if(podeAdicionar(fruta))
			frutas.add(fruta);
		return frutas.size();	
	}

}

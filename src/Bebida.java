import java.util.ArrayList;
import java.util.List;

public abstract class Bebida {

	private String descricao;
	protected List<EFruta> frutas;

	public Bebida(String descricao) {
		this.descricao = descricao;
		frutas = new ArrayList<>(3);
		
	}

	public abstract int adicionar(EFruta fruta);

	public double preco(){
		double soma = 0d;
		for(EFruta fruta : frutas)
			soma += fruta.valor();
		double media = 0d;
		if(!frutas.isEmpty())
			media = soma / frutas.size();
		return media;	
	}

	@Override
	public String toString() {
		return String.format("%s de %s: R$ %.2f", descricao, frutas, preco());
	}

}

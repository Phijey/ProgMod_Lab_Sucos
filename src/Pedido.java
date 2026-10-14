import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<Bebida> itens;

	public Pedido() {
		itens = new ArrayList<>();
	}

	public int adicionar(Bebida item) {
		if(item != null)
			itens.add(item);
		return itens.size();	
	}

	public double preco() {
		double total = 0d;
		for(Bebida item : itens)
			total += item.preco();
		return total;
		
	}

	@Override 
	public String toString() {
		String nota = "";
		for(Bebida item : itens)
			nota += item + "\n";
		nota += String.format("TOTAL: R$ %.2f", preco());
		return nota;
	}

}

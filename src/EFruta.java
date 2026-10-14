public enum EFruta {

	CUPUACU(8.0),
	GRAVIOLA(7.0),
	LARANJA(4.0),
	MANGA(5.0),
	MORANGO(6.0);

	private double valor;
	
	EFruta(double preco){
		valor = preco;

	}

	public double valor(){
		return valor;

	}
}

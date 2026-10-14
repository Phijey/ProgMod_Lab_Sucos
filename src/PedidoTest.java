import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {

    @Test 
    public void precoDoPedidoSomaAsBebidas(){
        //Arramge 
        Pedido pedido = new Pedido();
		Vitamina vitamina = new Vitamina(EFruta.MANGA);
		vitamina.adicionar(EFruta.MORANGO);
		pedido.adicionar(new Suco(EFruta.LARANJA));    
		pedido.adicionar(vitamina);  

        //Act
        double total = pedido.preco();

        //Assert
        assertEquals(15.2, total, 0.01);
    }

    @Test 
    public void precoEhAMediaDasFrutas(){
        //Arrange
		Suco suco = new Suco(EFruta.LARANJA);
		suco.adicionar(EFruta.MORANGO);

		//Act
		double preco = suco.preco();

		//Assert
        assertEquals(5.0, preco, 0.01);
        
    }

    @Test 
    public void naoAceitaDuasFrutasSemLaranja() {
		//Arrange
		Suco suco = new Suco(EFruta.MANGA);

		//Act
		int quantidade = suco.adicionar(EFruta.MORANGO);

		//Assert
		assertEquals(1, quantidade);
	}

    @Test 
    public void vitaminaMediaTemAcrescimoDe40PorCento() {
		//Arrange
		Vitamina vitamina = new Vitamina(EFruta.MANGA);
		vitamina.adicionar(EFruta.MORANGO);

		//Act
		double preco = vitamina.preco();

		//Assert
		assertEquals(11.2, preco, 0.01);             
	}

    @Test 
    public void naoAceitaMaisQueTresFrutas() {
		//Arrange
		Vitamina vitamina = new Vitamina(EFruta.LARANJA);
		vitamina.adicionar(EFruta.MANGA);
		vitamina.adicionar(EFruta.MORANGO);

		//Act
		int quantidade = vitamina.adicionar(EFruta.GRAVIOLA);

		//Assert
		assertEquals(3, quantidade);
	}
}



    


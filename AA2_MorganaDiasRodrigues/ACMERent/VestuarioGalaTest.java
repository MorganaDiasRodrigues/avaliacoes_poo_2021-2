import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class VestuarioGalaTest {
	
	@Test
	public void aluguelDiarioDeveRetornar840() {
		Alugavel vestGala = new VestuarioGala("Smoking", "Gala", 1106, 700);
		double valorAluguelRetornado;
		valorAluguelRetornado = vestGala.calculaAluguelDiario();
		Assert.assertEquals(840.00, valorAluguelRetornado, 840.01);
	}

}

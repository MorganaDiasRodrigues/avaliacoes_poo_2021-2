import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class VestuarioEsporteTest {
	
	@Test
	public void aluguelDiarioDeveRetornar75() {
		Alugavel vestEsporte = new VestuarioEsporte("Tênis", "Esporte", 1103, 75);
		double valorAluguelRetornado;
		valorAluguelRetornado = vestEsporte.calculaAluguelDiario();
		Assert.assertEquals(75.00, valorAluguelRetornado, 75.01);
	}

}

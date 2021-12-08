import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ImovelTest {

	@Test
	public void aluguelDiarioDeveRetornar3003() {
		Alugavel imovelTest = new Imovel("Bangalô", 60, 1107, 3000); 
		double valorAluguelRetornado;
		valorAluguelRetornado = imovelTest.calculaAluguelDiario();
		Assert.assertEquals(3003.00, valorAluguelRetornado, 3003.01);
	}
}

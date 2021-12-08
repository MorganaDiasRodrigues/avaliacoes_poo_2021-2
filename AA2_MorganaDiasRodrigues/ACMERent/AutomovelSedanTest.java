import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AutomovelSedanTest {

	@Test
	public void aluguelDiarioDeveRetornar945() {
		AutomovelSedan autSedan = new AutomovelSedan("Fiat", "Sedan", 1057, 900);
		double valorAluguelRetornado;
		valorAluguelRetornado = autSedan.calculaAluguelDiario();
		Assert.assertEquals(945.00, valorAluguelRetornado, 945.01);
	}
}

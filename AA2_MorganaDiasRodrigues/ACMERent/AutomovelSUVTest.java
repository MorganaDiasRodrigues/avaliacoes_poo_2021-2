import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AutomovelSUVTest {
	
	@Test
	public void aluguelDiarioDeveRetornar1150() {
		Alugavel autSUV = new AutomovelSUV("Chery Tiggo", "SUV", 1458, 1000);
		double valorAluguelRetornado;
		valorAluguelRetornado = autSUV.calculaAluguelDiario();
		Assert.assertEquals(1150.00, valorAluguelRetornado, 1150.01);
	}

}

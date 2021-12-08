import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class VestuarioSocialTest {
	
	@Test
	public void aluguelDiarioDeveRetornar110() {
		Alugavel vestSocial = new VestuarioSocial("Camisa", "Social", 1105, 100);
		double valorAluguelRetornado;
		valorAluguelRetornado = vestSocial.calculaAluguelDiario();
		Assert.assertEquals(110.00, valorAluguelRetornado, 110.01);
	}

}

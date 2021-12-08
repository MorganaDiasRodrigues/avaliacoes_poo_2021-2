import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AutomovelTest {
	
	@Test
	public void aluguelDiarioDeveRetornar2000() {
		Automovel automovelTest = new Automovel("Gol", "Comum", 1234, 2000);
		double valorAluguelRetornado;
		valorAluguelRetornado = automovelTest.calculaAluguelDiario();
		Assert.assertEquals(2000.00, valorAluguelRetornado, 2000.00);
	}
	
//	public void geraDescricaoRetornaString() {
//		Automovel automovelTest = new Automovel("Gol", "Comum", 1234, 2000);
//		String mensagemRetornada;
//		mensagemRetornada = automovelTest.geraDescricao();
//	}
	
	

}

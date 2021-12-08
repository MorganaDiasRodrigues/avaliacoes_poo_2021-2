
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class CadastroTest {

	@Test
	public void cadastroRetornaTrue() {
		Cadastro cadastro = new Cadastro();
		Alugavel aux = new AutomovelSUV("Fiat", "SUV", 1234, 500);
		boolean retorno;
		retorno = cadastro.cadastra(aux);
		Assert.assertEquals(true, retorno);
	}
	
	@Test
	public void cadastroRetornaFalse() {
		Cadastro cadastro = new Cadastro();
		Alugavel aux = new AutomovelSUV("Fiat", "SUV", 1234, 500);
		cadastro.cadastra(aux);
		Alugavel aux2 = new Automovel("Gol", "Comum", 1234, 200);
		boolean retorno;
		retorno = cadastro.cadastra(aux2);
		Assert.assertEquals(false, retorno);
	}
	
	@Test
	public void calculaAluguelRetorna400() {
		Cadastro cadastro = new Cadastro();
		Alugavel a1 = new Automovel("Gol", "Comum", 1056, 200);
		cadastro.cadastra(a1);
		double valorRetornado;
		valorRetornado = cadastro.calculaAluguel(1056, 2);
		Assert.assertEquals(400.00, valorRetornado, 400.00);
	}
	
	@Test
	public void calculaAluguelRetornarMenos1() {
		Cadastro cadastro = new Cadastro();
		Alugavel a1 = new Imovel("Bangalô", 200, 1111, 3000);
		cadastro.cadastra(a1);
		double valorRetornado;
		valorRetornado = cadastro.calculaAluguel(1117, 2);
		Assert.assertEquals(-1, valorRetornado, -1.0);
	}
	
	@Test
	public void pesquisaPorNomeDeveConterDoisAlugaveisVestuario() {
		Cadastro cadastro = new Cadastro();		
		Alugavel a7 = new VestuarioGala("Smoking", "Gala", 1105, 200);
		cadastro.cadastra(a7);
		Alugavel a8 = new VestuarioGala("Smoking", "Gala", 1106, 100);
		cadastro.cadastra(a8);
		Alugavel a9 = new VestuarioGala("Smoking Preto", "Gala", 1108, 100);
		cadastro.cadastra(a8);
		cadastro.pesquisa("smoking");
		int totalAlugaveis = 0;
		for(int i = 0; i < cadastro.getAlugaveis().size(); i++) {
			totalAlugaveis += 1;
		}
		Assert.assertEquals(2, totalAlugaveis);
	}
	
	@Test
	public void pesquisaPorNomeDeveRetornarNull() {
		Cadastro cadastro = new Cadastro();		
		Alugavel a7 = new VestuarioGala("Smoking", "Gala", 1105, 200);
		cadastro.cadastra(a7);
		Alugavel a8 = new VestuarioGala("Smoking", "Gala", 1106, 100);
		cadastro.cadastra(a8);
		Alugavel a9 = new VestuarioGala("Smoking Preto", "Gala", 1108, 100);
		cadastro.cadastra(a8);
		boolean retornoNull;
		if (cadastro.pesquisa("smokin") == null) {
			retornoNull = true;
		}
		else
			retornoNull = false;
		Assert.assertEquals(true, retornoNull);
	}
	
	@Test
	public void pesquisaTudoDeveConter5Alugaveis() {
		Cadastro cadastro = new Cadastro();
		Alugavel a4 = new Imovel("Triplex", 200, 1100, 5000);
		cadastro.cadastra(a4);
		Alugavel a5 = new Imovel("Bangalô", 60, 1101, 700);
		cadastro.cadastra(a5);
		Alugavel a6 = new VestuarioEsporte("Agasalho", "Esporte", 1103, 40);
		cadastro.cadastra(a6);
		Alugavel a7 = new VestuarioSocial("Camisa", "Social", 1105, 80);
		cadastro.cadastra(a7);
		Alugavel a8 = new VestuarioGala("Smoking", "Gala", 1106, 100);
		cadastro.cadastra(a8);
		int totalAlugaveis = 0;
		for(int i = 0; i < cadastro.getAlugaveis().size(); i++) {
			totalAlugaveis += 1;
		}
		Assert.assertEquals(5, totalAlugaveis);
	}
	
	@Test
	public void pesquisaTudoDeveRetornaeNull() {
		Cadastro cadastro = new Cadastro();
		boolean retornoNull;
		if (cadastro.pesquisaTudo() == null) {
			retornoNull = true;
		}
		else
			retornoNull = false;
		Assert.assertEquals(true, retornoNull);
	}
	
	
}

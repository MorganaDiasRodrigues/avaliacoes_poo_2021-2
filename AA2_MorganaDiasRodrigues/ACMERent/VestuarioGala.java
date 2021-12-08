
public class VestuarioGala extends Vestuario {

	public VestuarioGala(String nome, String tipo, int identificador, double valorAluguelBase) {
		super(nome, tipo, identificador, valorAluguelBase);
	}
	
	@Override
	public double calculaAluguelDiario() {
		double valorAcrescimo = super.getValorAluguelBase() * 0.20;
		return super.calculaAluguelDiario() + valorAcrescimo;
	}

}

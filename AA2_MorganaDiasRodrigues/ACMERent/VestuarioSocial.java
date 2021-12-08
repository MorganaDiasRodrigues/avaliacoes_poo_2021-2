
public class VestuarioSocial extends Vestuario {

	public VestuarioSocial(String nome, String tipo, int identificador, double valorAluguelBase) {
		super(nome, tipo, identificador, valorAluguelBase);
	}
	
	@Override
	public double calculaAluguelDiario() {
		double valorAcrescimo = super.getValorAluguelBase() * 0.10; // Acr�scimo de 10%
		return super.calculaAluguelDiario() + valorAcrescimo;
	}

}

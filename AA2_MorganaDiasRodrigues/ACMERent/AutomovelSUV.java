public class AutomovelSUV extends Automovel {

	public AutomovelSUV(String nome, String categoria, int identificador, double valorAluguelBase) {
		super(nome, categoria, identificador, valorAluguelBase);
	}
	
	@Override
	public double calculaAluguelDiario() {
		double valorAcrescimo = super.calculaAluguelDiario() * 0.15;
		return super.calculaAluguelDiario() + valorAcrescimo;
	}

}

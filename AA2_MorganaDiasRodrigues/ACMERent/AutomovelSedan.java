public class AutomovelSedan extends Automovel {
	
	public AutomovelSedan(String nome, String categoria, int identificador, double valorAluguelBase) {
		super(nome, categoria, identificador, valorAluguelBase);
	}
	
	@Override
	public double calculaAluguelDiario() {
		double valorAcrescimo = super.calculaAluguelDiario() * 0.05;	
		return super.calculaAluguelDiario() + valorAcrescimo;
	}
	
}


public class Imovel extends Alugavel {
	private int tamArea;

	public Imovel(String nome, int tamArea, int identificador, double valorAluguelBase) {
		super(nome, identificador, valorAluguelBase);
		this.tamArea = tamArea;
	}

	@Override
	public double calculaAluguelDiario() {
		double valorAcrescimo = tamArea * 0.001;
		return super.getValorAluguelBase() + valorAcrescimo;
	}

	@Override
	public String geraDescricao() {
		return " Nome: " + this.nome + ";"
				+ " �rea: " + this.tamArea + ";"
				+ " Identificador: " + this.identificador + ";"
				+ " Valor aluguel base: " + this.valorAluguelBase;
	}
	
	@Override
	public String toString() {
		return  "\nNOME: " + this.nome 
				+ " \nTAMANHO DA �REA: " + this.tamArea
				+ " \nN�MERO DE IDENTIFICA��O: " + this.identificador 
				+ " \nVALOR ALUGUEL BASE: " + this.valorAluguelBase
				+ "\n---------------------------------";
	}

}

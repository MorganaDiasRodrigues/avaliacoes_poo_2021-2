public abstract class Vestuario extends Alugavel {
	private String tipo;

	public Vestuario(String nome, String tipo, int identificador, double valorAluguelBase) {
		super(nome, identificador, valorAluguelBase);
		this.tipo = tipo;
	}

	@Override
	public double calculaAluguelDiario() {
		return super.valorAluguelBase;
	}

	@Override
	public String geraDescricao() {
		return " Nome: " + this.nome + ";"
				+ " Tipo: " + this.tipo + ";"
				+ " Identificador: " + this.identificador + ";"
				+ " Valor aluguel base: " + this.valorAluguelBase;
	}
	
	@Override
	public String toString() {
		return  "\nNOME: " + this.nome 
				+ " \nTIPO: " + this.tipo
				+ " \nNÚMERO DE IDENTIFICAÇÃO: " + this.identificador 
				+ " \nVALOR ALUGUEL BASE: " + this.valorAluguelBase
				+ "\n---------------------------------";
	}

}

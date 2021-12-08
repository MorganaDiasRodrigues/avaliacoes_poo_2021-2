public abstract class Alugavel {

	protected String nome;
	protected int identificador;
	protected double valorAluguelBase;

	public Alugavel(String nome, int identificador, double valorAluguelBase) {
		this.nome = nome;
		this.identificador = identificador;
		this.valorAluguelBase = valorAluguelBase;
	}

	public abstract double calculaAluguelDiario();

	public abstract String geraDescricao();

	public String getNome() {
		return this.nome;
	}

	public int getIdentificador() {
		return identificador;
	}

	public double getValorAluguelBase() {
		return valorAluguelBase;
	}
	

}

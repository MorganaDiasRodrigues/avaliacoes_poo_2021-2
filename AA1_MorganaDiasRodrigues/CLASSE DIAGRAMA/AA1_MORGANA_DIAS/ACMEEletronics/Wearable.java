public class Wearable {

	private String marca;
	private double preco;
	private String cor;
	private int numeroSerie;
	private String acessorio;
	private String tempoGarantia;
	
	public Wearable(String marca, double preco, String cor, int numeroSerie) {
		this.marca = marca;
		this.preco = preco;
		this.cor = cor;
		this.numeroSerie = numeroSerie;
	}

	
	public Wearable(String marca, double preco, String cor, String acessorio, String tempoGarantia, int numeroSerie) {
		this.marca = marca;
		this.preco = preco;
		this.cor = cor;
		this.acessorio = acessorio;
		this.tempoGarantia = tempoGarantia;
		this.numeroSerie = numeroSerie;
	}

	// Construtor auxiliar para cadastramento de novo Wearable digitado pelo cliente.
	public Wearable() {

	}

	public String getMarca() {
		return marca;
	}

	public double getPreco() {
		return preco;
	}

	public String getCor() {
		return cor;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public String getAcessorio() {
		return acessorio;
	}

	public String getTempoGarantia() {
		return tempoGarantia;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}

	public void setTempoGarantia(String tempoGarantia) {
		this.tempoGarantia = tempoGarantia;
	}

	@Override
	public String toString() {
		return "\nMARCA DO PRODUTO: " + this.marca + "\nPREÇO: " + this.preco +  "\nCOR: " + this.cor + "\nNÚMERO DA SÉRIE: " + this.numeroSerie + "\nACESSORIO: " + this.acessorio + "\nGARANTIA: " + this.tempoGarantia;
	}


}

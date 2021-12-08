
public class Automovel extends Alugavel {
	private String categoria;
	
	public Automovel(String nome, String categoria, int identificador, double valorAluguelBase) {
		super(nome, identificador, valorAluguelBase);
		this.categoria = categoria;
		}

	@Override
	public double calculaAluguelDiario() {
		return super.valorAluguelBase;
	}

	@Override
	public String geraDescricao() {
		return " Nome: " + this.nome + ";"
				+ " Categoria: " + this.categoria + ";"
				+ " Identificador: " + this.identificador + ";"
				+ " Valor aluguel base: " + this.valorAluguelBase;
	}
	
	@Override
	public String toString() {
		return  "\nNOME: " + this.nome 
				+ " \nCATEGORIA: " + this.categoria
				+ " \nNÚMERO DE IDENTIFICAÇÃO: " + this.identificador 
				+ " \nVALOR ALUGUEL BASE: " + this.valorAluguelBase
				+ "\n---------------------------------";
	}
}

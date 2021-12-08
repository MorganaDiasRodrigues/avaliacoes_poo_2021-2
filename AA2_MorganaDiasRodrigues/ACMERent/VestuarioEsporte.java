
public class VestuarioEsporte extends Vestuario {

	public VestuarioEsporte(String nome, String tipo , int identificador, double valorAluguelBase) {
		super(nome, tipo, identificador, valorAluguelBase);
	}
	
	@Override
	public double calculaAluguelDiario() {
		return super.calculaAluguelDiario(); // Não possui acréscimo
	}

}

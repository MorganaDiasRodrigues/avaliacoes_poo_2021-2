public class Venda {

	private int codigo;
	private String comprador;
	private Wearable wearable;

	public Venda(int codigo, String comprador, Wearable wearable) {
		this.codigo = codigo;
		this.comprador = comprador;
		this.wearable = wearable;
	}
	// Construtor auxiliar para cadastramento de nova venda digitada pelo cliente.
	public Venda() {

	}

	public int getCodigo() {
		return codigo;
	}

	public String getComprador() {
		return comprador;
	}

	public Wearable getWearable() {
		return wearable;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public void setWearable(Wearable wearable) {
		this.wearable = wearable;
	}

	
	@Override
	public String toString() {
		return "\nCODIGO DA VENDA: " + this.codigo + "\nNOME DO COMPRADOR(A): " + this.comprador + "\n --- DETALHES DA COMPRA: ---" + this.wearable;
	}

} 

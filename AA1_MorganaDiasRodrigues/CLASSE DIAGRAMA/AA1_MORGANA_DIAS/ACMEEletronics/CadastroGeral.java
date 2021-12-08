import java.util.Vector;
public class CadastroGeral {

	private Vector<Wearable> wearables = new Vector<Wearable>(5,1);
	private Vector<Venda> vendas = new Vector<Venda>(5,1);

	public void cadastra(Wearable wearable) {
		this.wearables.add(wearable);
	}
	// Cadastrando as vendas dos eletrônicos no vetor vendas.
	public void cadastra(Venda venda) {
		this.vendas.add(venda);
	}
	
	public String pesquisaTudo() {
		if (vendas.isEmpty()) {
			return null; }
		else {
			return vendas.clone().toString();
		}
		
	}

	public Venda pesquisa(int codigo) {
		for (Venda venda : vendas) {
			if (venda.getCodigo() == codigo) {
				return venda;
			}

		}
			
	return null;
	}

	public String pesquisa(String marca) {
		String auxiliar = "";
		for (Wearable wearable : wearables) {
			if (wearable.getMarca().equals(marca)) {
				for (Venda venda : vendas) {
					if (venda.getWearable() == wearable) {
						auxiliar +=  venda.toString() + "\n";
					}
					
				}
			}
		}
		if (auxiliar.equals("")) {
			return null;
		}
	return auxiliar;
	}

} 
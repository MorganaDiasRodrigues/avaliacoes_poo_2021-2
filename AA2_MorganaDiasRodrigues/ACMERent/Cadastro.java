import java.util.ArrayList;

public class Cadastro {

	private ArrayList<Alugavel> alugaveis = new ArrayList<>();


	public boolean cadastra(Alugavel item) {
		for (Alugavel alugavel : alugaveis) {
			if (item.getIdentificador() == alugavel.getIdentificador()) {
				return false;
			}
		}
		alugaveis.add(item);
	return true;
	}

	public ArrayList<Alugavel> pesquisa(String nome) {
		ArrayList<Alugavel> auxAlugaveis = new ArrayList<>();
			for (Alugavel alugavel : alugaveis) {
				if (alugavel.getNome().toLowerCase().equals(nome.toLowerCase())) {
					if (alugaveis.contains(alugavel)) {
						auxAlugaveis.add(alugavel);
					}
				}
			}
		if (auxAlugaveis.isEmpty()) {
			return null;
		}
		else
			return auxAlugaveis;
	}

	public String pesquisaTudo() {
		String todosAlugaveis = "";
		int i = 0;
		while (i < alugaveis.size()) {
			for (Alugavel alugavel : alugaveis) {
				todosAlugaveis += alugaveis.get(i).toString() 
						+ " \nALUGUEL DIÁRIO: R$" + alugavel.calculaAluguelDiario()
						+ "\n---------------------------------";
				i++;
			}
		}
		if (todosAlugaveis == "") {
			return null;
		}
		else
			return todosAlugaveis;
	}

	public double calculaAluguel(int identificador, int dias) {
		for (Alugavel alugavel : alugaveis) {
			if (alugavel.getIdentificador() == identificador) {
				double valorAluguelTotal = alugavel.calculaAluguelDiario() * dias;
				return valorAluguelTotal;
			}
		}
		return -1.0;
	}
	
	public ArrayList<Alugavel> getAlugaveis() {
		return alugaveis;
	}

}

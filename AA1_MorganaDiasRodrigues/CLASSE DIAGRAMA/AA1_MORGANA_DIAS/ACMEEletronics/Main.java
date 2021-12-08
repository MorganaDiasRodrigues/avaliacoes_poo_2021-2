import java.util.Scanner;
public class Main {

	private CadastroGeral cadastroGeral = new CadastroGeral();
	private TelaCiclica auxiliar_tela = new TelaCiclica();

	public static void main(String[] args) {
		Main main = new Main();
		main.inicializar();
		main.processar();
		
	}

	public void inicializar() {
		Wearable watchSimply = new Wearable("Watch Simply", 1200.0, "Preto", 20210801);
		Wearable watchPlus = new Wearable("Watch Plus", 1500, "Prata", 20210802);
		Wearable watchMaster = new Wearable("Watch Master", 2000, "Dourado", "Fone de Ouvido", "1 ano", 20210803);
		Wearable watchKids = new Wearable("Watch Kids", 900, "Verde", 20210804);
		Wearable watchGrizzly = new Wearable("Watch Grizzly", 1100, "Cinza", 20210805);
		Wearable watchFamily = new Wearable("Watch Family", 2300, "Branco", "Câmera vigia", "2 anos", 20210806);

		cadastroGeral.cadastra(watchSimply);
		cadastroGeral.cadastra(watchPlus);
		cadastroGeral.cadastra(watchMaster);
		cadastroGeral.cadastra(watchKids);
		cadastroGeral.cadastra(watchGrizzly);
		cadastroGeral.cadastra(watchFamily);

		Venda venda01 = new Venda(1, "Mariana", watchSimply);
		Venda venda02 = new Venda(2, "Jaqueline", watchPlus);
		Venda venda03 = new Venda(3, "Gabriel", watchMaster);
		Venda venda04 = new Venda(4, "Leonardo", watchKids);
		Venda venda05 = new Venda(5, "Beatriz", watchGrizzly);
		Venda venda06 = new Venda(6, "Charles", watchFamily);
		Venda venda07 = new Venda(7, "Ana", watchPlus);

		cadastroGeral.cadastra(venda01);
		cadastroGeral.cadastra(venda02);
		cadastroGeral.cadastra(venda03);
		cadastroGeral.cadastra(venda04);
		cadastroGeral.cadastra(venda05);
		cadastroGeral.cadastra(venda06);
		cadastroGeral.cadastra(venda07); }

	public void processar() {
		Scanner entrada = new Scanner(System.in);
		int usuario_opcao;
			do {
				auxiliar_tela.separaLinha();
				auxiliar_tela.constroiMenu();
				auxiliar_tela.separaLinha();
				System.out.print("➜ OPÇÃO: ");
				usuario_opcao = entrada.nextInt();
				entrada.nextLine(); // Limpar o scanner entrada.
				switch(usuario_opcao) {
				case 1: System.out.println(cadastroGeral.pesquisaTudo()); break;
	
				case 2: System.out.println("DIGITE O CÓDIGO DA VENDA: "); 
						int usuario_codigo = entrada.nextInt(); 
						cadastroGeral.pesquisa(usuario_codigo);
						if (cadastroGeral.pesquisa(usuario_codigo) == null) {
							System.out.println("Nenhuma venda encontrada com este codigo.");
						}
						else {
							System.out.println(cadastroGeral.pesquisa(usuario_codigo));
						} break;
	
				case 3: System.out.print("DIGITE O NOME DO PRODUTO: ");
						String usuario_produto = entrada.nextLine();
						System.out.println(usuario_produto);
						String auxiliar = cadastroGeral.pesquisa(usuario_produto);
						if (auxiliar == null) {
							System.out.println("Nenhuma venda realizada com esta marca de produto.");
						} 
						else {
							System.out.println(auxiliar);
						} break;

				case 4: Wearable cliente = new Wearable();
						System.out.println("DIGITE A MARCA DO PRODUTO: ");
						String cliente_marca = entrada.next();
						cliente.setMarca(cliente_marca);
						entrada.nextLine();

						System.out.println("DIGITE O PREÇO DO PRODUTO: ");
						double cliente_preco = entrada.nextDouble();
						cliente.setPreco(cliente_preco);
						entrada.nextLine();

						System.out.println("DIGITE A COR DO PRODUTO: ");
						String cliente_cor = entrada.next();
						cliente.setCor(cliente_cor);
						entrada.nextLine();

						System.out.println("DIGITE O NÚMERO DE SÉRIE DO PRODUTO: ");
						int cliente_nro_serie = entrada.nextInt();
						cliente.setNumeroSerie(cliente_nro_serie);
						entrada.nextLine();

						System.out.println("DIGITE O ACESSÓRIO DO PRODUTO: ");
						String cliente_acessorio = entrada.next();
						cliente.setAcessorio(cliente_acessorio);
						entrada.nextLine();

						System.out.println("DIGITE O TEMPO DE GARANTIA DO PRODUTO: ");
						String cliente_garantia = entrada.next();
						cliente.setTempoGarantia(cliente_garantia);
						entrada.nextLine();

						cadastroGeral.cadastra(cliente);
						System.out.println("PRODUTO CADASTRADO");

						Venda cliente_venda = new Venda();
						System.out.println("INSIRA AS INFORMAÇÕES DA VENDA");

						System.out.println("CÓDIGO DA VENDA: ");
						int cliente_codigo = entrada.nextInt();
						cliente_venda.setCodigo(cliente_codigo);
						entrada.nextLine();

						System.out.println("NOME DO COMPRADOR: ");
						String cliente_comprador = entrada.next();
						cliente_venda.setComprador(cliente_comprador);
						entrada.nextLine();

						cliente_venda.setWearable(cliente);
						cadastroGeral.cadastra(cliente_venda);
						System.out.println("VENDA CADASTRADA"); 
						break;

						
				case 5: System.out.println("VOCÊ SAIU DO APLICATIVO. \n OBRIGADA"); break;
				
				default: System.out.println("OPÇÃO INVÁLIDA"); }
				
			} while (usuario_opcao != 5);
			entrada.close();
		}

	}
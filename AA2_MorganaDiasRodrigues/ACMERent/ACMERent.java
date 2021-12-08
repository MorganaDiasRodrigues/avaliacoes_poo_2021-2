import java.util.Scanner;
public class ACMERent {

	private Cadastro estoque = new Cadastro();
	private Alugavel aux;
	public void preCadastra() {
		Alugavel a1 = new Automovel("Gol", "Comum", 1056, 200);
		estoque.cadastra(a1);
		Alugavel a2 = new AutomovelSedan("Fiat Cronos", "Sedan", 1057, 400);
		estoque.cadastra(a2);
		Alugavel a3 = new AutomovelSUV("Chery Tiggo", "SUV", 1058, 600);
		estoque.cadastra(a3);
		Alugavel a4 = new Imovel("Triplex", 200, 1100, 5000);
		estoque.cadastra(a4);
		Alugavel a5 = new Imovel("Bangalô", 60, 1101, 700);
		estoque.cadastra(a5);
		Alugavel a6 = new VestuarioEsporte("Agasalho", "Esporte", 1103, 40);
		estoque.cadastra(a6);
		Alugavel a7 = new VestuarioSocial("Camisa", "Social", 1105, 80);
		estoque.cadastra(a7);
		Alugavel a8 = new VestuarioGala("Smoking", "Gala", 1106, 100);
		estoque.cadastra(a8);
		Alugavel a9 = new Imovel("Bangalô", 60, 1107, 500); 
		estoque.cadastra(a9);
		Alugavel a10 = new VestuarioSocial("Camisa", "Social", 1117, 95);
		estoque.cadastra(a10);

	}

	public void executa() {

		Scanner entrada = new Scanner(System.in);
		int usuarioOpcao;
		System.out.println("|_________________ACMERent Alugáveis_________________|");
		System.out.println("|    BEM-VINDO(A), ESCOLHA UMA DAS OPÇÕES ABAIXO:    |");
		do {
			System.out.println("\n");
			System.out.println(" 1. Cadastrar item alugavel");
			System.out.println(" 2. Mostrar todas as informações do cadastro");
			System.out.println(" 3. Pesquisar item por nome");
			System.out.println(" 4. Calcular aluguel");
			System.out.println(" 5. Sair");


			System.out.print("OPÇÃO: ");
			usuarioOpcao = entrada.nextInt();
			entrada.nextLine();
			switch(usuarioOpcao) {
			case 1:
				int usuarioAlugavel = 0;
				do {

					System.out.println("\nQual destes itens você gostaria de cadastrar?");
					System.out.println("1. Automovel");
					System.out.println("2. Imovel");
					System.out.println("3. Vestuário");
					System.out.println("4. Voltar");

					usuarioAlugavel = entrada.nextInt();
					entrada.nextLine();
					if (usuarioAlugavel == 1) {
						String nome;
						String categoria;
						int identificador;
						double valorAluguelBase;
						System.out.println("Nome: ");
						nome = entrada.next();
						entrada.nextLine();
						System.out.println("Categoria: ");
						categoria = entrada.next();
						entrada.nextLine();
						System.out.println("Identificador: ");
						identificador = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Valor aluguel base: ");
						valorAluguelBase = entrada.nextInt();
						entrada.nextLine();
						if (categoria.toLowerCase().equals("comum")) {
							aux = new Automovel(nome, categoria, identificador,valorAluguelBase);
							if (estoque.cadastra(aux) == false) {
								System.out.println("Item repetido.");
							}
							else 
								System.out.println("Item adicionado com sucesso.");
						}
						else if (categoria.toLowerCase().equals("sedan")) {
							aux = new AutomovelSedan(nome, categoria, identificador, valorAluguelBase);
							if (estoque.cadastra(aux) == false) {
								System.out.println("Item repetido.");
							}
							else
								System.out.println("Item adicionado com sucesso.");
						}
						else if (categoria.toLowerCase().equals("suv")) {
							aux = new AutomovelSUV(nome, categoria, identificador, valorAluguelBase);
							if (estoque.cadastra(aux) == false) {
								System.out.println("Item repetido.");
							}
							else 
								System.out.println("Item adicionado com sucesso.");
						}
						else {
							System.out.println("Categoria inválida.");
							System.out.println("Por favor, reinicie o cadastramento.");
						}

					}

					else if (usuarioAlugavel == 2) {
						String nome;
						int tamArea;
						int identificador;
						double valorAluguelBase;
						System.out.println("Nome: ");
						nome = entrada.next();
						entrada.nextLine();
						System.out.println("Área (m²): ");
						tamArea = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Identificador: ");
						identificador = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Valor aluguel base: ");
						valorAluguelBase = entrada.nextInt();
						entrada.nextLine();
						aux = new Imovel(nome, tamArea, identificador,valorAluguelBase);
						if (estoque.cadastra(aux) == false) {
							System.out.println("Item repetido.");
						}
						else 
							System.out.println("Item adicionado com sucesso.");

					}

					else if (usuarioAlugavel == 3) {
						String nome;
						String tipo;
						int identificador;
						double valorAluguelBase;
						System.out.println("Nome: ");
						nome = entrada.next();
						entrada.nextLine();
						System.out.println("Tipo: ");
						tipo = entrada.next();
						entrada.nextLine();
						System.out.println("Identificador: ");
						identificador = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Valor aluguel base: ");
						valorAluguelBase = entrada.nextInt();
						entrada.nextLine();
						if (tipo.toLowerCase().equals("esporte")) {
							aux = new VestuarioEsporte(nome, tipo, identificador, valorAluguelBase);
							if (estoque.cadastra(aux) == false) {
								System.out.println("Item repetido.");
							}
							else
								System.out.println("Item adicionado com sucesso.");
						}
						else if (tipo.toLowerCase().equals("social")) {
							aux = new VestuarioSocial(nome, tipo, identificador, valorAluguelBase);
							if (estoque.cadastra(aux) == false) {
								System.out.println("Item repetido.");
							}
							else
								System.out.println("Item adicionado com sucesso.");
						}
						else if (tipo.toLowerCase().equals("gala")) {
							aux = new VestuarioGala(nome, tipo, identificador, valorAluguelBase);
							if (estoque.cadastra(aux) == false) {
								System.out.println("Item repetido.");
							}
							else
								System.out.println("Item adicionado com sucesso.");
						}
						else {
							System.out.println("Tipo inválido.");
							System.out.println("Por favor, reinicie o cadastramento.");
						}
						estoque.cadastra(aux);
					}

				} while (usuarioAlugavel != 4);

				break;

			case 2:
				if(estoque.pesquisaTudo() == null) {
					System.out.println("Nenhum item cadastrado.");
				}
				else
					System.out.println(estoque.pesquisaTudo());
				break;

			case 3:
				String nome;
				System.out.println("Digite o nome do item: ");
				nome = entrada.next();
				entrada.nextLine();
				if (estoque.pesquisa(nome) == null) {
					System.out.println("Nenhum item foi localizado com este nome");
				}
				else
					System.out.println(estoque.pesquisa(nome));
				break;

			case 4:
				int codigoItem, diasParaAlugar;
				System.out.println("Digite o código do item: ");
				codigoItem = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Digite o número de dias que deseja alugar: ");
				diasParaAlugar = entrada.nextInt();
				entrada.nextLine();
				if (estoque.calculaAluguel(codigoItem, diasParaAlugar) == -1) {
					System.out.println("Nenhum item foi localizado com este identificador.");
				}
				else {
					System.out.println("VALOR TOTAL POR " + diasParaAlugar + " DIAS sDE ALUGUEL: ");
					System.out.println( "R$" + estoque.calculaAluguel(codigoItem, diasParaAlugar));
				}
					
				break;

			case 5:
				System.out.println("Execução terminada.");
				System.out.println("Obrigada por usar a ACMERent.");
				break;


			default: System.out.println("ERRO: OPÇÃO INVÁLIDA. DIGITE NOVAMENTE."); }

		} while (usuarioOpcao != 5);
		entrada.close();
	}
}




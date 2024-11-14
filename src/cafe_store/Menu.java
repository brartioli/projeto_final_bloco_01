package cafe_store;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import cafe_store.controller.cafe_storeController;
import cafe_store.model.ProdutoCafé;
import cafe_store.model.ProdutosRelacionados;

public class Menu {

	public static void main(String[] args) {

		cafe_storeController produtos = new cafe_storeController();
		Scanner scanner = new Scanner(System.in);

		int opcao = 0, numero, tipo;
		String nome, produtor, origem, material;
		float preco;

		ProdutoCafé pc1 = new ProdutoCafé(produtos.gerarNumero(), 1, "Catuai 99", 54.0f, "Jean Vilhena",
				"Ibiraci - MG");
		produtos.cadastrar(pc1);
		ProdutoCafé pc2 = new ProdutoCafé(produtos.gerarNumero(), 1, "Bourbon Amarelo", 65.0f, "Álvaro Coli",
				"Carmo de Minas - MG");
		produtos.cadastrar(pc2);
		ProdutosRelacionados pr1 = new ProdutosRelacionados(produtos.gerarNumero(), 2, "Moedor Manual", 80.0f, "Inox");
		produtos.cadastrar(pr1);
		ProdutosRelacionados pr2 = new ProdutosRelacionados(produtos.gerarNumero(), 2, "Prensa Francesa", 100.0f,
				"Vidro");
		produtos.cadastrar(pr2);

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                CAFÉ STORE                          ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar o Produto                  ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Deletar Produto                       ");
			System.out.println("            6 - Metodos de pagamento                 ");
			System.out.println("            7 - Redes Sociais                        ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.printf("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				opcao = 0;
			}

			if (opcao == 8) {
				System.out.println("\nAté mais! Aproveite seu café!");

				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Cadastro do Produto\n\n");

				System.out.println("Digite o nome do produto: ");
				scanner.skip("\\R?");
				nome = scanner.nextLine();
				System.out.println("Digite o número do Produto:");
				numero = scanner.nextInt();
				System.out.println("Digite o preço do Produto (R$): ");
				preco = scanner.nextFloat();

				do {
					System.out.println("Digite se o produto é café ou acessório (1- café e 2-acessório)");
					tipo = scanner.nextInt();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o produtor:");
					scanner.skip("\\R?");
					produtor = scanner.nextLine();
					System.out.println("Digite a origem do café:");
					scanner.skip("\\R?");
					origem = scanner.nextLine();
					produtos.cadastrar(new ProdutoCafé(produtos.gerarNumero(), numero, nome, preco, produtor, origem));
				}
				case 2 -> {
					System.out.println("Digite o material que é feito o acessório:");
					scanner.skip("\\R?");
					material = scanner.nextLine();
					produtos.cadastrar(new ProdutosRelacionados(produtos.gerarNumero(), numero, nome, preco, material));
				}
				}

				keypress();
				break;
			case 2:
				System.out.println("Listar todas os Produtos\n\n");

				produtos.listarTodos();
				keypress();
				break;
			case 3:
				System.out.println("Consultar produtos - por número\n\n");

				System.out.println("Digite o número do produto:");
				numero = scanner.nextInt();

				produtos.procurarPorNumero(numero);

				keypress();
				break;
			case 4:
				System.out.println("Atualizar dados do Produto\n\n");

				System.out.println("Digite o número do Produto:");
				numero = scanner.nextInt();

				var buscaProduto = produtos.buscarNaCollection(numero);

				if (buscaProduto != null) {
					tipo = buscaProduto.getTipo();

					System.out.println("Digite o nome do produto: ");
					scanner.skip("\\R?");
					nome = scanner.nextLine();
					System.out.println("Digite o número do Produto:");
					numero = scanner.nextInt();
					System.out.println("Digite o preço do Produto (R$): ");
					preco = scanner.nextFloat();

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o produtor:");
						scanner.skip("\\R?");
						produtor = scanner.nextLine();
						System.out.println("Digite a origem do café:");
						scanner.skip("\\R?");
						origem = scanner.nextLine();
						produtos.cadastrar(
								new ProdutoCafé(produtos.gerarNumero(), numero, nome, preco, produtor, origem));
					}
					case 2 -> {
						System.out.println("Digite o material que é feito o acessório:");
						scanner.skip("\\R?");
						material = scanner.nextLine();
						produtos.cadastrar(
								new ProdutosRelacionados(produtos.gerarNumero(), numero, nome, preco, material));
					}
					}

				}else {
					System.out.println("O produto não foi encontrado!");
				}

				keypress();
				break;
			case 5:
				System.out.println("Deletar Produto\n\n");
				
				System.out.println("Digite o número do produto");
				numero = scanner.nextInt();
				
				produtos.deletar(numero);

				keypress();
				break;
			case 6:
				System.out.println("Metodos de pagamento\n\n");
				System.out.println();
				System.out.println("\nOs metodos de pagamento são:");
				System.out.println("Cartão de crédito");
				System.out.println("Cartão de débito");
				System.out.println("Bolero bancário");
				System.out.println(
						"Carteiras digitais, como PicPay, Ame Digital, Google Pay, Apple Pay, PagBank, Mercado Pago");
				System.out.println("PIX");

				keypress();
				break;
			case 7:
				System.out.println("Redes Sociais\n\n");
				System.out.println();
				System.out.println("instagram: @café_Store");
				System.out.println("Facebook: cafe store");
				System.out.println("Site: htpps://www.cafestore.com.br");

				keypress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keypress();
				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Bruna F. Artioli");
		System.out.println("Generation Brasil - brunaartioli.ba@gmail.com");
		System.out.println("https://github.com/brartioli/projeto_final_bloco_01");
		System.out.println("*********************************************************");
	}

	public static void keypress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}

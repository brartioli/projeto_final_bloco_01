package cafe_store;

import java.util.Scanner;

import cafe_store.model.ProdutoCafé;
import cafe_store.model.ProdutosRelacionados;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcao = 0;

		ProdutoCafé pc1 = new ProdutoCafé(1, "Catuai99", 54.0f, "Jean Vilhena", "Ibiraci - MG");
		pc1.visualizar();
		ProdutosRelacionados pr1 = new ProdutosRelacionados(1, "Moedor", 120.0f, "inox");
		pr1.visualizar();

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

			opcao = scanner.nextInt();

			if (opcao == 8) {
				System.out.println("\nAté mais! Aproveite seu café!");

				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Cadastro do Produto\n\n");

				break;
			case 2:
				System.out.println("Listar todas os Produtos\n\n");

				break;
			case 3:
				System.out.println("Consultar produtos - por número\n\n");

				break;
			case 4:
				System.out.println("Atualizar dados do Produto\n\n");

				break;
			case 5:
				System.out.println("Deletar Produto\n\n");

				break;
			case 6:
				System.out.println("Metodos de pagamento\n\n");

				break;
			case 7:
				System.out.println("Redes Sociais\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
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
}

import controller.ProdutoController;
import model.Console;
import model.Jogo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        ProdutoController produtos = new ProdutoController();

        System.out.println("\nCriar Produtos\n");


        Console console1 = new Console(produtos.gerarId(), "Playstation 5", 5000.00f, "Sony", 1, "500GB");
        produtos.cadastrar(console1);

        Jogo jogo1 = new Jogo(produtos.gerarId(), "Metal Slug", 120.0f, "SNK", 2, "Shooter", "Xbox");
        produtos.cadastrar(jogo1);

        int id, tipo;
        String nome, fabricante, armazenamento, genero, plataforma;
        float preco = 0;
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        int opcao;

        while (true) {

            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                GAMESTORE              ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Cadastrar Produto                     ");
            System.out.println("            2 - Listar todas os produtos              ");
            System.out.println("            3 - Buscar produto                        ");
            System.out.println("            4 - Atualizar Produto                     ");
            System.out.println("            5 - Apagar Produto                        ");
            System.out.println("            6 - Sair                      ");
            System.out.println("                                                      ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao = 0;
            }

            if (opcao == 6) {
                System.out.println("\nGameStore - Jogue com qualidade!");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Produto\n\n");

                    System.out.println("Digite o Nome do Produto: ");
                    leia.skip("\\R?");
                    nome = leia.nextLine();
                    System.out.println("Digite o Preço do produto");
                    try {
                        preco = leia.nextFloat();
                    } catch (InputMismatchException e) {
                        System.out.println("\nUse . para separar as casas decimais ");
                        preco = leia.nextFloat();
                    }
                    System.out.println("Digite o Fabricante do produto");
                    leia.skip("\\R?");
                    fabricante = leia.nextLine();

                    System.out.println("É um console ou um jogo? (1-Console ou 2-Jogo): ");
                    tipo = leia.nextInt();
                    leia.nextLine();

                    switch (tipo) {
                        case 1 -> {
                            System.out.println("Qual tamanho do armazenamento do console? ");
                            armazenamento = leia.nextLine();
                            produtos.cadastrar(new Console(produtos.gerarId(), nome, preco, fabricante, tipo, armazenamento));
                        }
                        case 2 -> {
                            System.out.println("Digite o Gênero do Jogo: ");
                            genero = leia.nextLine();
                            System.out.println("Digite a plataforma do Jogo: ");
                            plataforma = leia.nextLine();
                            produtos.cadastrar(new Jogo(produtos.gerarId(), nome, preco, fabricante, tipo, genero, plataforma));
                        }
                    }
                    break;

                case 2:
                    System.out.println("Listar todos os Produtos\n\n");
                    produtos.listarProdutos();
                    ;
                    break;
                case 3:
                    System.out.println("Buscar Produto\n\n");

                    System.out.println("Digite o ID do produto ");
                    id = leia.nextInt();

                    produtos.procurarProduto(id);

                    break;
                case 4:
                    System.out.println("Atualizar Produto\n\n");

                    System.out.println("Digite o ID do Produto: ");
                    id = leia.nextInt();

                    var buscaProduto = produtos.buscarNaLista(id);

                    if (buscaProduto != null) {

                        System.out.println("Digite o Nome do Produto: ");
                        leia.skip("\\R?");
                        nome = leia.nextLine();
                        System.out.println("Digite o Preço do produto");
                        preco = leia.nextFloat();
                        System.out.println("Digite o Fabricante do produto");
                        leia.skip("\\R?");
                        fabricante = leia.nextLine();

                        tipo = buscaProduto.getTipo();


                        switch (tipo) {
                            case 1 -> {
                                System.out.println("Qual tamanho do armazenamento do console? ");
                                armazenamento = leia.nextLine();
                                produtos.atualizar(new Console(id, nome, preco, fabricante, tipo, armazenamento));
                            }
                            case 2 -> {
                                System.out.println("Digite o Gênero do Jogo: ");
                                genero = leia.nextLine();
                                System.out.println("Digite a plataforma do Jogo: ");
                                plataforma = leia.nextLine();
                                produtos.atualizar(new Jogo(id, nome, preco, fabricante, tipo, genero, plataforma));
                            }
                        }
                    }

                    break;
                case 5:
                    System.out.println("Apagar Produto\n\n");

                    System.out.println("Digite o ID do produto: ");
                    id = leia.nextInt();

                    produtos.deletar(id);

                    break;

                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}

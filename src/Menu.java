import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
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

            opcao = leia.nextInt();

            if (opcao == 6) {
                System.out.println("\nGameStore - Jogue com qualidade!");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Produto\n\n");

                    break;
                case 2:
                    System.out.println("Listar todos os Produtos\n\n");

                    break;
                case 3:
                    System.out.println("Buscar Produto\n\n");

                    break;
                case 4:
                    System.out.println("Atualizar Produto\n\n");

                    break;
                case 5:
                    System.out.println("Apagar Produto\n\n");

                    break;

                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}

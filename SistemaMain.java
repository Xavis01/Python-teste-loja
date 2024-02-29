package Class.Exercicio2;

import java.util.Scanner;

public class SistemaMain {
    private static Scanner scan = new Scanner(System.in);
    private static Sistema sistema = new Sistema();
    private static int codigo, opcao;
    private static String nome, resposta;
    private static char tipoAlimento;

    public static void main(String[] args) {
        do{
            menu();

            System.out.print("=> ");
            opcao = scan.nextInt();

            switch(opcao) {
                case 1:
                incluirVendedor();
                break;

                case 2:
                consultarVendedores();
                break;

                case 3:
                consultarVendedorTipo();
                break;

                case 4:
                consultarDados();
                break;

                case 5:
                excluirVendedor();
                break;

                default:
                System.out.println("\nValor inválido");

                case 0:
                System.out.println("Sistema finalizado.");
            }
        } while (opcao != 0);
    }

    public static void menu() {
        System.out.println("\n====== Menu ======" +
            "\n1) Cadastrar vendedor no sistema." +
            "\n2) Consultar todos os vendedores." +
            "\n3) Consultar total de vendedores de um tipo de alimento." +
            "\n4) Consultar dados de um vendedor" +
            "\n5) Excluir vendedor." +
            "\n0) Sair");
    }

    public static void incluirVendedor() {
        do{
            System.out.print("\nDigite o codigo do vendedor: ");
            codigo = scan.nextInt();
            scan.nextLine();

            System.out.print("Digite o nome do vendedor: ");
            nome = scan.nextLine();

            System.out.print("Digite o tipo de alimento (P - perecível / N - não perecível): ");
            tipoAlimento = scan.nextLine().charAt(0);

            sistema.incluirVendedor(codigo, nome, tipoAlimento);

            System.out.println("Deseja cadastrar outro vendedor? (S/N):");
            resposta = scan.nextLine();
        }
        while (resposta.equalsIgnoreCase("S"));
    }

    public static void consultarVendedores() {
        sistema.consultarVendedores();
    }

    public static void consultarVendedorTipo() {
        System.out.print("Digite o tipo de alimento (P - perecível / N - não perecível: )");
        scan.nextLine();
        tipoAlimento = scan.nextLine().charAt(0);
        sistema.consultarVendedorTipo(tipoAlimento);
    }

    public static void consultarDados() {
        System.out.print("\nDigite o vendedor que deseja pesquisar: ");
        scan.nextLine();
        nome = scan.nextLine();
        sistema.consultarDados(nome);
    }

    public static void excluirVendedor() {
        System.out.print("Digite o vendedor que deseja excluir: ");
        scan.nextLine();
        nome = scan.nextLine();
        sistema.excluirVendedor(nome);
    }
}

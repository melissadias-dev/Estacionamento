import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE ESTACIONAMENTO ===");
            System.out.println("[1] Cadastrar Veículo");
            System.out.println("[2] Consultar Veículo");
            System.out.println("[3] Consultar Veículos Estacionados");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Informe o nome do Proprietário: ");
                    String proprietario = scanner.nextLine();

                    System.out.print("Informe a placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Informe o modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Informe a senha: ");
                    int senha = scanner.nextInt();
                    scanner.nextLine();

                    Veiculo novoVeiculo =
                            new Veiculo(proprietario, placa, modelo, senha);

                    estacionamento.cadastrarVeiculo(novoVeiculo);
                    break;

                case 2:

                    System.out.print("Informe a senha: ");
                    int busca = scanner.nextInt();
                    scanner.nextLine();

                    estacionamento.buscarVeiculo(busca);
                    break;

                case 3:

                    estacionamento.exibirVeiculos();
                    break;

                case 4:

                    System.out.println("Encerrando o sistema...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
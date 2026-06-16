import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    //aqui informa se o veículo foi cadastrado após o preenchimento das informações
    public void cadastrarVeiculo(Veiculo veiculo) {
        listaVeiculos.add(veiculo);
        System.out.println("Veículo cadastrado com sucesso!");
    }

    //aqui ele exibe os veículos estacionados e cadastrados
    public void exibirVeiculos() {
        System.out.println("=== VEÍCULOS CADASTRADOS ===");
        if (listaVeiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado no sistema.");
            return;
        }
        for (Veiculo veiculo : listaVeiculos) {
            System.out.println("---------------------");
            System.out.println("Proprietário: " + veiculo.getProprietario());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Modelo: " + veiculo.getModelo());
            listaVeiculos.size();
        }
    }

    //aqui ele busca um veículo específico de acordo com a placa informada
    public void buscarVeiculo(int buscaSenha) {
        boolean encontrado = false;

        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getSenha() == buscaSenha) {
                System.out.println("Proprietário: ......... " + veiculo.getProprietario());
                System.out.println("Placa: ................ " + veiculo.getPlaca());
                System.out.println("Modelo: ............... " + veiculo.getModelo());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Veículo não cadastrado.");
        }

    }
}

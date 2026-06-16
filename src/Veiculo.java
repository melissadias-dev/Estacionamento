
public class Veiculo {
    private String proprietario;
    private String modelo;
    private String placa;
    private int senha;

    public Veiculo(String proprietario, String placa, String modelo, int senha) {
        this.proprietario = proprietario;
        this.placa = placa;
        this.modelo = modelo;
        this.senha = senha;
    }

    public String getModelo() {return modelo;}
    public int getSenha() {return senha;}
    public String getProprietario(){ return proprietario; }
    public String getPlaca() { return placa; }
}

package POO.Encapsulamento;

public class MainClienteVIP {
    public static void main(String[] args) {
        ClienteVIP cvip = new ClienteVIP();

        cvip.setcpf("394.382.384-89");
        cvip.setNome("Leandro");
        cvip.setLimiteCredito(1000);
        cvip.exibirCliente();
    }
}

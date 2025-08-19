package POO.Herança;

public class MainTransação {
    public static void main(String[] args) {
        TransferênciaBancária t1 = new TransferênciaBancária("Erick", 1250, "07/12/2025", "13503-123", "13249-098");
        System.out.println(t1.transferênciaEntreContas());
    }
}
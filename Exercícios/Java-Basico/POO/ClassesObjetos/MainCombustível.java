package POO.ClassesObjetos;

public class MainCombustível {
    public static void main(String[] args) {
        CalculoCombustível carro1 = new CalculoCombustível();
        carro1.modelo = "Civic";
        carro1.distancia = 11;
        carro1.consumoPorKm = 14;

        System.out.println(">>>>>Relatório Consumo de Carro " + carro1.modelo);
        carro1.calcularConsumo(carro1.distancia);
        carro1.exibirDados();

        CalculoCombustível carro2 = new CalculoCombustível();
        carro2.modelo = "Toro";
        carro2.distancia = 27;
        carro2.consumoPorKm = 8;

        System.out.println(">>>>>Relatório Consumo de Carro " + carro2.modelo);
        carro2.calcularConsumo(carro2.distancia);
        carro2.exibirDados();
    }
}

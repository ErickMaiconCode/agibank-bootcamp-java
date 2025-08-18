package POO.ClassesObjetos;

public class CalculoCombustível {
    public String modelo;
    public double consumoPorKm;
    public double distancia;

    public double calcularConsumo(double distancia){
        return distancia/consumoPorKm;
    }
    public void exibirDados(){
        System.out.println("CALCULO DE CONSUMO COMBUSTÍVEL");
        System.out.println("Modelo: ------------------" + this.modelo);
        System.out.println("Consumo Km/L: ------------" + this.consumoPorKm);
        System.out.println("Distância Percorrida: -----" + this.distancia);
    }
}

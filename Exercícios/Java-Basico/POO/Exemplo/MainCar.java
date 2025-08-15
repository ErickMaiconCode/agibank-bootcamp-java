package POO.Exemplo;

public class MainCar {
    public static void main(String[] args) {
        //Criando um objeto da classe Carro
        Car meuCarro = new Car();

        meuCarro.mostrarInformacoes();

        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corola";
        meuCarro.ano = 2022;

        //Usando os métodos do objeto
        meuCarro.acelerar();
        meuCarro.frear();
        meuCarro.mostrarInformacoes();
    }
}

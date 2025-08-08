package Metodo;

public class EX05ComparAtivo {
    public static String compararAtivos(float ativo1, float ativo2){
        if(ativo1 > ativo2){
            return "Ativo 1 possui maior rendimento";
        } else if(ativo1 == ativo2){
            return "Os ativos possui o mesmo valor de rendimento";
        }else{
            return "Ativo 2 possui maior rendimento";
        }
    }
    public static void main(String[] args) {
        float ativo1 = 7.0f;
        float ativo2 = 6.0f;

        String comparativo = compararAtivos(ativo1,ativo2);
        System.out.println(comparativo);
    }
}

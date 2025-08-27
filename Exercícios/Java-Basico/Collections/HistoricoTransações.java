package Collections;

import java.util.*;

public class HistoricoTransações {
    public static void registrarTransacao(List<String> historico, String transacao){
        historico.add(transacao);
    }

    public static boolean buscarTransacao(List<String> historico, String transacao){
        return historico.contains(transacao);
    }

    public void exibirHistorico(List<String> historico){
        historico.forEach(System.out::println);

        list.forEach(x -> System.out.println(x));
    }

    public static void main(String[] args) {
        List <String> historico = new ArrayList<>();

        registrarTransacao(historico, "123");
        registrarTransacao(historico, "124");
        registrarTransacao(historico, "125");

        buscarTransacao(historico, "124");

    }
}

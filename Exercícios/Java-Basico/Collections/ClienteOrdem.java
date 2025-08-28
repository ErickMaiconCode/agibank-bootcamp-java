package Collections;

import java.util.*;

public class ClienteOrdem {
    int id;
    String nome;
    String CPF;

    public ClienteOrdem(int id, String nome, String CPF) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       List < ClienteOrdem > cliente = new ArrayList<>();

       cliente.add(new ClienteOrdem(12, "Erick", "454-232"));
       cliente.add(new ClienteOrdem(15, "Matheus", "432.132"));
       cliente.add(new ClienteOrdem(13, "Maicon", "938-382"));
       cliente.add(new ClienteOrdem(16, "Rafaela", "123-948"));
       cliente.add(new ClienteOrdem(11, "Giovana", "984-283"));

        System.out.println("CPF cadastrados: " + cliente);
        for(ClienteOrdem c : cliente){
            System.out.println(c.CPF);
        }

        String cpfbusca = "454-232";


        for(ClienteOrdem c : cliente){
            if(c.getCPF().equals(cpfbusca))
                System.out.println("Cliente cadastrado: " + c.getNome());
        }
    }
}

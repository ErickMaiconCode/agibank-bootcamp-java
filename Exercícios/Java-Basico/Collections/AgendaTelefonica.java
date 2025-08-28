package Collections;

import java.util.*;

public class AgendaTelefonica {
    static class contato{
        private String nome;
        private String telefone;
        private String email;

        public contato(String nome, String telefone, String email) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
        }

        public boolean equals(Object o){
            if(this == o)return true;{
                if(!(o instanceof contato))return false;
                contato that = (contato) o;
                return telefone.equals(that.telefone);
            }
        }

        public int hashCode() {return telefone.hashCode();}

        public String toString(){
            return "Contato:{ Telefone: " + telefone + " | Nome: " + nome + " | Email: " + email + "}";
        }
    }

    public static void main(String[] args) {
        Set< contato > dadosCliente = new HashSet<>();

        dadosCliente.add(new contato("Maria", "19123456", "maria@"));
        dadosCliente.add(new contato("João", "19875431", "joão@"));
        dadosCliente.add(new contato("Edson", "19474838", "maria@"));
        dadosCliente.add(new contato("Erick", "19383848", "erick@"));

        List<contato> dados = new ArrayList<>(dadosCliente);
        dadosCliente.sort(Comparator.comparing(contato::getNome));

        for(contato v: dados ){
            System.out.println("Lista de clientes: " + v);
        }
    }
}
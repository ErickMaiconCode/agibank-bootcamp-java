package Collections;

import java.util.*;

public class Assinante {

    int id;
    String nome;
    String email;

    public Assinante(int id, String nome, String email){
        this.id = id;
        this.email = email;
        this.nome = nome;
    }

    public boolean equals(Object o){
        if(this == o)return true;{
            if(!(o instanceof Assinante))return false;
            Assinante that = (Assinante)o;
            return email.equals(that.email);
        }
    }

    public int hashCode() {return email.hashCode();}

    public String toString(){
        return "Assinante{" + " id: " + id + " nome: " + nome + " email: " + email + "}";
    }

    public static void main(String[] args) {
        Set< Assinante > assinante = new HashSet<>();

        assinante.add(new Assinante(12, "Erick", "erick.lima@"));
        assinante.add(new Assinante(13, "Maicon", "erick.lima@"));
        assinante.add(new Assinante(14, "Mathes", "matheus@"));
        assinante.add(new Assinante(15, "Pamela", "pamela@"));
        assinante.add(new Assinante(16, "Alexandra", "alexandra@"));

        for(Assinante v: assinante){
            System.out.println("Assinaturas sem duplicatas: " + v.email);
        }
    }
}

import java.util.HashMap;

public class ExemploMap {

    public static void main(String[] args) {

        HashMap<Integer, String> alunos = new HashMap<>();

        alunos.put(1, "Carlos");

        alunos.put(2, "Marina");


        for (int chave : alunos.keySet()) {

            System.out.println("ID: " + chave + ", Nome: " + alunos.get(chave));

        }

    }

}
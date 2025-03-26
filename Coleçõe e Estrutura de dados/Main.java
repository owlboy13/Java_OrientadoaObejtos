import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

class ListaNomes {

    private ArrayList<String> nomes = new ArrayList<>();

    public void adicionarNomes(String pnome){
            nomes.add(pnome);
    }

    public void removerNomes(String pnome){
        nomes.remove(pnome);
    }

    public void listarNomes(){
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}


public class Main {
    public static void main(String[] args){
        System.out.println("Array de nomes...**");

        ListaNomes lista = new ListaNomes();
        lista.adicionarNomes("Anderson Luiz");
        lista.adicionarNomes("Maria das Neves");

        lista.listarNomes();


    }
}
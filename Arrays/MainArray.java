import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class GerenciadorArray{
    private int[] array;
    private int tamanho;
    private int valor;

    public GerenciadorArray (int capacidade) {
        array = new int[capacidade];
        tamanho = 0;

    }

    public void inserir(int valor) {
        if(tamanho < array.length) {
            array[tamanho++] = valor;
        }
    }

    public void remover(int valor) {
        for(int i = 0; i < tamanho; i++){
            if(array[i] == valor) {
                array[i] = array[tamanho - 1];
                tamanho--;
                return;
            }
        }
    }

    public boolean pesquisar(int valor){
        for(int i = 0; i < tamanho; i++){
            if(array[i] == valor) return true;
         }
         return false;
    }

    public void exibir(){
        System.out.println(Arrays.toString(Arrays.copyOf(array, tamanho)));
    }
}

public class MainArray{
    public static void main(String[] args){
        System.out.println("Tipos de Array");

        GerenciadorArray ga= new GerenciadorArray(10);
        ga.inserir(5);
        ga.inserir(10);
        ga.inserir(15);
        System.out.println("Pesquisa: " + ga.pesquisar(5));
        ga.exibir();
    }
        
}
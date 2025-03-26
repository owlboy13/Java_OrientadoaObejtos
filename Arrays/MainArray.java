import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class GerenciadorArray {
    private int[] array;  // Array interno para armazenar os valores
    private int tamanho;  // Rastreia quantos elementos estão realmente no array
    private int valor;    // (Observação: Esta variável não está sendo utilizada)

    // Construtor: inicializa o array com uma capacidade fixa
    public GerenciadorArray(int capacidade) {
        array = new int[capacidade];  // Cria o array com o tamanho especificado
        tamanho = 0;  // Inicialmente vazio
    }

    // Insere um valor no array se houver espaço
    public void inserir(int valor) {
        if(tamanho < array.length) {  // Verifica se há capacidade
            array[tamanho++] = valor;  // Adiciona e incrementa o tamanho
        }
        // (Observação: Não trata caso o array esteja cheio)
    }

    // Remove um valor específico do array
    public void remover(int valor) {
        for(int i = 0; i < tamanho; i++) {
            if(array[i] == valor) {
                // Substitui o valor removido pelo último elemento válido (otimização)
                array[i] = array[tamanho - 1];
                tamanho--;  // Reduz o tamanho lógico
                return;  // Sai do método após a remoção
            }
        }
        // (Observação: Não informa se o valor não foi encontrado)
    }

    // Pesquisa se um valor existe no array
    public boolean pesquisar(int valor) {
        for(int i = 0; i < tamanho; i++) {
            if(array[i] == valor) return true;  // Valor encontrado!
        }
        return false;  // Valor não encontrado
    }

    // Exibe os elementos válidos do array
    public void exibir() {
        System.out.println(Arrays.toString(Arrays.copyOf(array, tamanho)));
        // Usa Arrays.copyOf para mostrar apenas os elementos inseridos
    }
}

public class MainArray {
    public static void main(String[] args) {
        System.out.println("Tipos de Array");

        GerenciadorArray ga = new GerenciadorArray(10);  // Cria um gerenciador com capacidade 10

        // Operações de teste:
        ga.inserir(5);
        ga.inserir(10);
        ga.inserir(15);

        System.out.println("Pesquisa: " + ga.pesquisar(5));  // Deve retornar true
        ga.exibir();  // Mostra: [5, 10, 15]
    }
}
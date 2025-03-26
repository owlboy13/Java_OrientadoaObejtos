import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Pedido 1");

        fila.add("Pedido 2");

        fila.add("Pedido 3");

        while (!fila.isEmpty()) {

            System.out.println("Processando: " + fila.poll());

        }

    }

}

 
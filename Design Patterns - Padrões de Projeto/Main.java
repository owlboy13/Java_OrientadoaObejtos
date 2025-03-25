// Importa as classes necessárias para usar Listas (ArrayList)
import java.util.ArrayList;
import java.util.List;

// 🔹 Interface Observador (contrato que define o método "atualizar")
interface Observador {
    void atualizar(String mensagem); // Todo observador DEVE ter este método
}

// 🔹 Classe CanalNoticia (o "Observado" que envia notificações)
class CanalNoticia {
    // Lista que armazena todos os observadores inscritos
    private List<Observador> observadores = new ArrayList<>();
    private String noticia; // A notícia mais recente

    // ✅ Inscreve um novo observador (ex: usuário que quer receber notícias)
    public void adicionarObservador(Observador o) {
        observadores.add(o); // Adiciona na lista
    }

    // ❌ Remove um observador (ex: usuário que não quer mais receber notícias)
    public void removerObservador(Observador o) {
        observadores.remove(o); // Tira da lista
    }

    // 📢 Publica uma nova notícia e AVISA todos os inscritos
    public void novaNoticia(String noticia) {
        this.noticia = noticia; // Guarda a notícia
        notificarObservadores(); // Chama o método que avisa todo mundo
    }

    // 🔔 Método PRIVADO que percorre a lista e avisa cada observador
    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.atualizar(noticia); // Chama o método "atualizar" de cada um
        }
    }
}

// 🔹 Classe Usuario (um "Observador" que recebe notícias)
class Usuario implements Observador {
    private String nome; // Nome do usuário

    // Construtor (cria um usuário com um nome)
    public Usuario(String nome) {
        this.nome = nome;
    }

    // 📩 Método OBRIGATÓRIO (definido pela interface Observador)
    @Override
    public void atualizar(String mensagem) {
        // Imprime a notícia recebida
        System.out.println(nome + " recebeu a notícia: " + mensagem);
    }
}

// 🔹 Classe Main (testa o código)
public class Main {
    public static void main(String[] args) {
        System.out.println("Padrão Observer");

        // 1️⃣ Cria o canal de notícias (Observado)
        CanalNoticia canal = new CanalNoticia();

        // 2️⃣ Cria dois usuários (Observadores)
        Usuario usuario1 = new Usuario("Anderson Luiz");
        Usuario usuario2 = new Usuario("Maria das Neves");

        // 3️⃣ Inscreve os usuários no canal
        canal.adicionarObservador(usuario1);
        canal.adicionarObservador(usuario2);

        // 4️⃣ Publica uma notícia (automaticamente avisa os inscritos)
        canal.novaNoticia(" Caiu de paraquedas!");
    }
}
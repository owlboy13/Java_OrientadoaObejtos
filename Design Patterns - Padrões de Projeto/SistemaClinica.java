import java.util.ArrayList;
import java.util.List;

// Interface Observer
interface Observer {

    void update(String mensagem);

}

// Classe Subject
class Agendamento {

    private String data;

    private String horario;

    private String medico;

    private String paciente;

    private List<Observer> observadores = new ArrayList<>();


    public void adicionarObserver(Observer observer) {

        observadores.add(observer);

    }

    public void removerObserver(Observer observer) {

        observadores.remove(observer);

    }

    public void notificarObservers() {

        for (Observer observer : observadores) {

            observer.update("Novo agendamento: " + paciente + " com o médico " + medico + " no dia " + data + " às " + horario);

        }

    }

    // Método para agendar consulta
    public void agendarConsulta(String paciente, String medico, String data, String horario) {

        this.paciente = paciente;

        this.medico = medico;

        this.data = data;

        this.horario = horario;

        notificarObservers();

    }

}

// Classe Paciente (Observer)
class Paciente implements Observer {

    private String nome;

    public Paciente(String nome) {

        this.nome = nome;

    }

    @Override
    public void update(String mensagem) {

        System.out.println("Paciente " + nome + " recebeu a notificação: " + mensagem);

    }

}

// Classe Medico (Observer)
class Medico implements Observer {

    private String nome;

    public Medico(String nome) {

        this.nome = nome;

    }

    @Override
    public void update(String mensagem) {

        System.out.println("Médico " + nome + " recebeu a notificação: " + mensagem);

    }

}

// Exemplo de uso
public class SistemaClinica {

    public static void main(String[] args) {

        // Criando o objeto Agendamento
        Agendamento agendamento = new Agendamento();

        // Criando pacientes e médicos (observadores)
        Paciente paciente1 = new Paciente("João Silva");
        Medico medico1 = new Medico("Dr. Pedro");

        // Adicionando observadores
        agendamento.adicionarObserver(paciente1);
        agendamento.adicionarObserver(medico1);

        // Agendando consulta
        agendamento.agendarConsulta("João Silva", "Dr. Pedro", "10/12/2024", "14:00");

        // Criando outro paciente para notificar
        Paciente paciente2 = new Paciente("Maria Oliveira");
        agendamento.adicionarObserver(paciente2);

        // Agendando nova consulta
        agendamento.agendarConsulta("Maria Oliveira", "Dr. Pedro", "11/12/2024", "09:00");

    }

}
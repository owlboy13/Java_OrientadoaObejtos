public class App {

    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.login();
        professor.executaComando(" Curso");
        professor.logout();

        Estudante estudante = new Estudante();
        estudante.login();
        estudante.executaComando(" Visualizar Cursos");
        estudante.executaComando(" Inscrever em Curso");
        estudante.logout();

    }
}
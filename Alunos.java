public class Alunos {
    private String nome;
    private String email;
    private int idade;
    private String cursoMatriculado;

    // Contrutor Padrão
    public Alunos(){
        this.nome = "Nome Indefinido";
        this.email = "Email Indefinido";
        this.idade = 0;
        this.cursoMatriculado = "Curso não definido";
    }

    // Construtor com parâmetros

    public Alunos(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cursoMatriculado = "Curso não definido";
    }

    // Sobrecarga com curso matriculado
    public Alunos(String nome, String email, int idade, String cursoMatriculado){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cursoMatriculado = cursoMatriculado;
    }

    public void exibirAluno(){
        System.out.println("Aluno: " + nome + " Email: " + email + " idade: " + idade + " Curso: " + cursoMatriculado);
    }

    public static void main(String[] args){
        Alunos a1 = new Alunos();
        Alunos a2 = new Alunos("Anderson", "anderson@gmail.com", 30);
        Alunos a3 = new Alunos("Anderson","anderson@gmail.com", 30, "ADS");

        a1.exibirAluno();
        a2.exibirAluno();
        a3.exibirAluno();

    }
}
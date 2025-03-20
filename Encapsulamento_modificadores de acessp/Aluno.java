class Aluno {
    private String nome;
    private int matricula;
    private double nota;

    // Construtor da classe Aluno

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    // Métodos get e set para encapsulamento
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome= nome;
    }
    // GET
    public int getMatricula() {
        return matricula;
    }
    // SET
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota){
        if (nota >=7 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota Inválida - Nome: " + nome + ", Matrícula: " + matricula + ", Nota: " + nota);
        }
    }

    public void infoAlunos() {
        System.out.println("Nome: " + nome + "Matrícula: " + matricula + ", Nota: " + nota);
    }
}
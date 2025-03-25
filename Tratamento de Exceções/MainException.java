class Aluno {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        setNota(nota);
    }

    public void setNota(double nota) {
        try {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Nota inválida! Deve estar entre 0 e 10.");
            }
            this.nota = nota;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        } finally {
            System.out.println("Operação finalizada");
        }
    
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Matricula: " + matricula + ", Nota: " + nota);
    }
}

public class MainException {

        public static void main(String[] args){

            Aluno al1 = new Aluno("Anderson", 00000, 15);
            al1.setNota(8);
            al1.exibirInfo();


        }
}

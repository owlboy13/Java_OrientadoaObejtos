public class Escolas {

    public static void main(String[] args) {

        Alunos aluno1 = new Alunos("Anderson Luiz", 000000, 10);
        aluno1.setNota(5);
        aluno1.infoAlunos();

        Avaliacao alunoGrad = new AlunoGraduacao("Maria", 11111, 8);
        Avaliacao alunoPosGrad = new AlunoPosGraduacao("Raimundo", 22222, 8);

        System.out.println("Média de Maria: " + alunoGrad.calcularMedia());
        System.out.println("Média do Raimundo: " + alunoPosGrad.calcularMedia());


    }
}
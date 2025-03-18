public class Estudante implements Comando, UsuarioSistema {

    @Override
    public void login(){
        System.out.println("Login do estudante realizado");
    }

    @Override
    public void logout(){
        System.out.println("Logout do aluno realizado");
    }

    @Override
    public void executaComando(String comando){
        System.out.println("O Aluno executou o comando" + comando);
    }
}
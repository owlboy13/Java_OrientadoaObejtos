public class Professor implements Comando, UsuarioSistema{

    @Override
    public void login(){
        System.out.println("Login do professor realizado");
    }

    @Override
    public void logout(){
        System.out.println("Logout do professor realizado");
    }

    @Override
    public void executaComando(String comando){
        System.out.println("O professor criou um" + comando);
    }

}
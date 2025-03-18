public class Bode extends Animal implements Treinavel {
    
    @Override
    public void falar(){
        System.out.println("O bode faz bée");
    }

    @Override
    public void executarComando(String comando){
        System.out.println("O bode executou o comando" + comando);
    }
}
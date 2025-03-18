public class Macaco extends Animal implements Treinavel{

    @Override
    public void falar(){
        System.out.println("O macaco grita");
    }

    @Override
    public void executarComando(String comando){
        System.out.println("O macaco executa o comando" + comando);
    }
}
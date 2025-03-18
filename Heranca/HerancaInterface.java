public class HerancaInterface{

    public static void main(String[] args){

        Cachorro cachorro = new Cachorro();
        cachorro.falar();
        cachorro.executarComando(" Sentar");

        Macaco macaco = new Macaco();
        macaco.falar();
        macaco.executarComando(" Pular");

        Bode bode = new Bode();
        bode.falar();
        bode.executarComando(" Correr");
    }
}
public class ExemploContinue{

    public static void main(String[] args){

        int[] numeros = {1,2,3,6,4};

        for (int numero: numeros) {
            if (numero < 3){
                continue;
            }
            System.out.println("Número:  " +numero);
        }
    }
}
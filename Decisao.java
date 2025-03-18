import java.util.Scanner;

public class Decisao {

    public static void main(String[] args){

        System.out.println("Digite um número: ");
        Scanner s = new Scanner(System.in);

        int numero = s.nextInt();

        if(numero > 0){
            System.out.println("O número é Positivo:" + numero);
        }
        else
            if (numero < 0) {
                System.out.println("O número é negativo:" + numero);
            }
            else{
                System.out.println("O número é igual a zero" + numero);
            }

        System.out.println("Fim do Programa");

    }



}
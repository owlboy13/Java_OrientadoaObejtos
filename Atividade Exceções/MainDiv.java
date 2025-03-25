import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner.*;

class Dividir {

    private int a;
    private int b;
    private int resultado;

    public Dividir(int a, int b){
         try {
            if (a < 0 || b < 0 ) {
                throw new IllegalArgumentException("Número inválido, não pode ser negativo");
            } 
            this.resultado = a / b;  
        } catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não é permitido" + e.getMessage());
        } finally {
            System.out.println("Divisão finalizada");
        }
    }

    public void resultadoInfo() {
        System.out.println("Resultado: " + resultado);
    }

}

class MainDiv {
    public static void main(String[] args) {
        
        System.out.println("Insira dois números inteiros: ");
        Scanner sc = new Scanner(System.in);


        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Dividir div1 = new Dividir(num1, num2);
        div1.resultadoInfo();
    }
}

public class Calculadora implements OperacoesBasicas {

    @Override
    public void somar(int a, int b) {
        System.out.println("Resultado: " + (a + b));
    }

    @Override
    public void subtrair(int a, int b) {
        System.out.println("Resultado: " + (a - b));
    }

    @Override
    public void multiplicar(int a, int b) {
        System.out.println("Resultado: " + (a * b));
    }

    
    @Override
    public void dividir(double a, double b) {
        System.out.println("Resultado: " + (a / b));
    }

}
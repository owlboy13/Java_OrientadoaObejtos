public class DiasDaSemana {
    public static void main(String[] agrs){
        int dia = 3; // 1 representa segunda, 2 terça-feira e etc...

        switch (dia){
            case 1:
                System.out.println("Hoje é Segunda-feira");

                break;
            case 2:
                System.out.println("Hoje é Terça-feira");

                break;
            case 3:
                System.out.println("Hoje é Quarta-Feira");

                break;
            default:
                System.out.println("Dia inválido");

                break;

        }
    }
}
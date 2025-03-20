public class Carros {

    private String modelo;
    private int ano;

    public Carros(){
        this.modelo = "Modelo Desconhecido";
        this.ano = 0;
    }

    public Carros(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo(){
        System.out.println("Carro: " + modelo + ", Ano: " +ano);
    }

        public static void main(String[] args){
            Carros c1 = new Carros();
            Carros c2 = new Carros("Golf", 1998);

            c1.exibirInfo();
            c2.exibirInfo();

    }
}


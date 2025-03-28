class Unidimensional {

    private int[] uniarray;
    private int size;
    private int count;

    public Unidimensional() {

        this.size = 5;
        this.uniarray = new int[this.size];
        this.count = 0;
            
        }

    public void inserir(int values) {
        if (count < size) { 
            uniarray[count] = values;
            count++;
        } else {
            System.out.println("Array Unidimensional Completo");
        }
    }

    public void exibir(){
        System.out.println("Elementos Adicionados: ");
        for (int j = 0; j < count; j++){
            System.out.println("Posição " + j + ": " + uniarray[j]);
        }
    }

    public void sum(){
        int soma = 0;
        for (int i = 0; i < uniarray.length; i++){
            soma += uniarray[i];
        }
        System.out.println("A soma dos valores é: " + soma);

    }

}

class Bidimensional {

    private int[][] biarray;
    private int rows;
    private int columns;
    private int count;

    public Bidimensional() {

        this.rows = 3;
        this.columns = 3;
        this.biarray = new int[rows][columns];
        this.count = 0;

    }

    public void inserir(int values){
        if (count < rows * columns) {
            int row = count / columns;
            int col = count % columns;
            biarray[row][col] = values;
            count++;
        } else {
            System.out.println("Matriz Completa");
        }
    }


    public void sumMatriz(){
        int soma = 0;
        for (int k = 0; k < biarray.length; k++){
            for (int l = 0; l < biarray[k].length; l++){
                soma += biarray[k][l];
            }
        }
        System.out.println("A soma dos valores é: " + soma);

    }

        public void exibirMatriz(){
        System.out.println("Elementos da Matriz: ");
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < columns; l++) {
                if ((k * columns + l) < count) {
                    System.out.print(biarray[k][l] + " ");
                }
            } 
            System.out.println();
        }
    }


}


public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Unidimensional unidimensional = new Unidimensional();

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            int values = sc.nextInt();
            unidimensional.inserir(values);

        }

        unidimensional.exibir();
        unidimensional.sum();

        Scanner sc2 = new Scanner(System.in);
        Bidimensional bidimensional = new Bidimensional();

        for (int j = 0; j < 9; j++) {
            System.out.println("Bidiomensional, Digite o  " + (j+1) + "º número: ");
            int values2 = sc2.nextInt();
            bidimensional.inserir(values2);
        }

        bidimensional.exibirMatriz();
        bidimensional.sumMatriz();


    }
}
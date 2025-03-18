public class ClassificarProduto {

    public static void main(String[] args) {

        double preco = 150.00;

        int popularidade = 85; // percentual de aprovação

 

        if (preco <= 100) {

            System.out.println("Produto de baixo custo.");

        } else if (preco > 100 && preco <= 500) {

            System.out.println("Produto de médio custo.");

        } else {

            System.out.println("Produto de alto custo.");

        }

 

        if (popularidade >= 80) {

            System.out.println("Produto bem avaliado.");

        } else {

            System.out.println("Produto com baixa avaliação.");

        }

    }

}
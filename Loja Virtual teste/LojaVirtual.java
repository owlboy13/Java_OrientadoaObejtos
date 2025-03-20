public class LojaVirtual {

    public static void main(String[] args) {

        Produtos produto = new Produtos("Notebook", 3500.00, 10);

 

        // Exibir detalhes do produto

        produto.exibirDetalhes();

 

        // Atualizar preço e quantidade

        produto.setPreco(3600.00);

        produto.setQuantidade(8);

 

        // Exibir detalhes atualizados

        System.out.println("\nDetalhes atualizados:");

        produto.exibirDetalhes();

    }

}
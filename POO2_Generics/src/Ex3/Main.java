package Ex3;

public class Main {
	
    public static void main(String[] args) {
    	
        Pedido pedido = new Pedido();
        ProdutoX produto1 = new ProdutoX("1", "Produto 1");
        ProdutoX produto2 = new ProdutoX("2", "Produto 2");

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);

        pedido.mostrarProdutos();
    }
}

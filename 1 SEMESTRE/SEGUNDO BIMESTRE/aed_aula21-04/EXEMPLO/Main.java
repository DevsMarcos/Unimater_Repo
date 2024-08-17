package src;

public class Main {
    public static void main(String[] args) {

        final String APRESENTAR_PRODUTO = "%s - R$%.2f%n";

        Produto p1 = new Produto("Coca", 5.00);
        Produto p2 = new Produto("Pastel", 10.00);
        Produto p3 = new Produto("Coxinha", 7.00);
        Produto p4 = new Produto("Brigadeiro", 2.00);

        Pedido pedido1 = new Pedido();

        pedido1.adicionarProduto(p1);
        pedido1.adicionarProduto(p2);
        pedido1.adicionarProduto(p3);
        pedido1.adicionarProduto(p4);

        for (Produto produto : pedido1.listaDeProdutos) {
            System.out.printf(APRESENTAR_PRODUTO, produto.nome, produto.preco);
        }

        System.out.println("Total " + pedido1.valorTotal());
    }
}

import java.util.ArrayList;
import java.util.List;

import Classes.ProductsService;
import Classes.Produto;

public class App {
    public static void main(String[] args){

        List<Produto> produto = new ArrayList<>();
        produto.add(new Produto("Batata", 2.50, 0));
        produto.add(new Produto("Arroz", 67, 0));
        produto.add(new Produto("Feijão", 12, 0));
        produto.add(new Produto("Bife", 55, 0));

        ProductsService novoServiço = new ProductsService();

        novoServiço.filterList(produto);
        novoServiço.somaPrecos(produto);
        novoServiço.produtoMaisCaro(produto);
        System.out.println("------------------------------------------");
        novoServiço.produtosOrdenados(produto);
        System.out.println("------------------------------------------");

        novoServiço.aplicarDesconto(produto);
    }
}

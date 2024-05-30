package Classes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductsService {
    //Utilize Streams para filtrar os produtos que possuem preço maior que 50.0 e exiba seus nomes.
    public void filterList(List<Produto> lista){
        lista.stream()
        .filter(produto -> produto.preco >= 50) //Filtro nos produtos
        .forEach(produto -> System.out.println("-> "+ produto.nome));//Printa os produtos
    }

    public void somaPrecos(List<Produto> lista){
        double soma = lista.stream()
        .mapToDouble(produto -> produto.preco)
        .sum();

        System.out.println(soma);
    }

    public void produtoMaisCaro(List<Produto> lista){
        Produto produtoComMaiorValor =  lista.stream()
         .max(Comparator.comparingDouble((p1)-> p1.preco))
         .get();
         System.out.println(produtoComMaiorValor.nome);
         
    }

    public void produtosOrdenados(List<Produto> lista){
        lista.stream()
        .sorted((o1, o2) -> o1.nome.compareTo(o2.nome))
        .forEach(produto -> System.out.println(produto.nome));
    }

    public void aplicarDesconto(List<Produto> lista){
        lista.stream()
        .forEach(produto -> {
            produto.aplicarDesconto();
            System.out.println(produto.nome+ "Valor: "+ produto.preco);
        });
        
    }

    public void contarProdutosComPrecoNaFaixa(List<Produto> lista){
        double quanitdadeProdutos = lista.stream()
        .filter(produto -> produto.preco >= 30.0 && produto.preco <= 100.0)
        .count();

        System.out.println(quanitdadeProdutos);
    }

    public void contarProdutosDeAcordoValor(List<Produto> lista){
        lista.stream()
        .filter(produto -> produto.preco <= 50)
        .toList()
        .forEach(System.out::println);

        lista.stream()
        .filter(produto -> produto.preco >= 50)
        .toList()
        .forEach(System.out::println);
    }

    public void concatenarProdutos(List<Produto> lista){
       String listaJunta = lista.stream()
        .map(produto -> produto.nome)
        .collect(Collectors.joining( ", "));
        System.out.println(listaJunta);
    }
}

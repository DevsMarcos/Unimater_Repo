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

    //Utiliza do Stream para realizar a soma de todos os preços dos itens.
    public void somaPrecos(List<Produto> lista){
        double soma = lista.stream()
        .mapToDouble(produto -> produto.preco) //Mapeando os valores do tipo Double da Lista
        .sum();//Realizando a soma dos mesmos

        System.out.println("Total de soma: R$"+soma);//Printando resultado
    }

    //Utiliza o stream para verificar qual é item mais caro 
    public void produtoMaisCaro(List<Produto> lista){
        Produto produtoComMaiorValor =  lista.stream() 
         .max(Comparator.comparingDouble((p1)-> p1.preco))//Realiza a comparação dos doubles, substituindo a posição naquele que for maior
         .get();//Obtem o dado da lista
         System.out.println("O produto mais caro da lista é: "+produtoComMaiorValor.nome);
         
    }

// Utiliza do stream para odernar os produtos em ordem alfabética
    public void produtosOrdenados(List<Produto> lista){
        lista.stream()
        .sorted((o1, o2) -> o1.nome.compareTo(o2.nome))//Compara os nomes dos produtos
        .forEach(produto -> System.out.println(produto.nome));//A cada item da lsita ele printa 
    }
//Realiza a aplicação de desconto de 10% em cada item da lista 
    public void aplicarDesconto(List<Produto> lista){
        lista.stream()
        .forEach(produto -> {
            produto.aplicarDesconto();//Chama a função aplicar desconto para cada item da lista; 
            System.out.println(produto.nome+ "Valor: "+ produto.preco);//Printa os produtos com o seus novos valores
        });
        
    }

    //Printa os produtos que estão na faixa de preço de 30 a 100;
    public void contarProdutosComPrecoNaFaixa(List<Produto> lista){
        double quanitdadeProdutos = lista.stream()
        .filter(produto -> produto.preco >= 30.0 && produto.preco <= 100.0)//Realiza essa filtragem
        .count();//Realiza a contagem 

        System.out.println(quanitdadeProdutos);//Printa os produtos
    }

    //Printa os produtos de acorodo com o valor 50, se é maior ou menor
    public void contarProdutosDeAcordoValor(List<Produto> lista){
        double abaixo = lista.stream()
        .filter(produto -> produto.preco < 50)//Realiza o filtro
        .count();
        System.out.println("Produtos abaixo ou igual a R$50,00: "+abaixo);//Itera essa lista

        double acima = lista.stream()
        .filter(produto -> produto.preco >= 50)
        .count();
        System.out.println("Produtos acima de R$50,00: "+acima);
    }

    //Concatena os produtos, um ao lado do outro
    public void concatenarProdutos(List<Produto> lista){
       String listaJunta = lista.stream() //Aramazena o Stream em uma variável 
        .map(produto -> produto.nome)//Utiliza do map, para encontrar os nomes dos produtos
        .collect(Collectors.joining( ", "));//Juntamos estes nomes, separando -os por virgula 
        System.out.println(listaJunta);//Printamos
    }
}

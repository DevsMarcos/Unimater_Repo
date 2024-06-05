package src;

public class Pedido {

    public Produto[] listaDeProdutos;

    public Pedido(){
        listaDeProdutos = new Produto[0];
    }

    public void adicionarProduto(Produto produto){
        Produto[] novoArray = new Produto[listaDeProdutos.length + 1];
        System.arraycopy(listaDeProdutos, 0, novoArray, 0, listaDeProdutos.length);
        novoArray[novoArray.length - 1] = produto;
        this.listaDeProdutos = novoArray;
    }

    public double valorTotal(){
        double retorno = 0d;
        for (Produto produto : this.listaDeProdutos) {
            retorno += produto.preco;
        }
        return  retorno;
    }

}

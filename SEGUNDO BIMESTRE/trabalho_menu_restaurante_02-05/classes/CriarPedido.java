package classes;

public class CriarPedido {
    //Essa função tem por objetivo criar um novo pedido sempre que precisarmos
    //Recebe como parâmetro um arrayy de itens, e uma array bidimencional de pedidos
    public int[][] criarPedido(String[]itens, int[][] pedidos) {

        //Primeiramente analisamos se o array de itens possui algum item;
        //Caso elenão tenha a função é parada;
        if (itens.length < 1) {
            System.out.println("Adicione umm item primeiro");
            return pedidos;
        //Caso tenha um item, adicionamos o pedido que o usuário requisitou
        }else if(pedidos.length < 1 ){
            System.out.println("Pedido adcionado!");
            return new int[1][1];//Retornando um novo array bidimencional um 1 posição
        }

        //Aqui criamos um novo array bidimencional, onde o mesmo possui o tamanho do pedido e o tamanho do pedido na última posição do
        //mesmo. Assim podemos manter a ordem de criação do array, onde ele terá a quantidade de casas correspondete a quanitdade de itens
        //que podem ser adcionados.
        int[][] novoPedidos = new int[pedidos.length][pedidos[pedidos.length-1].length];

        //Por fim, iteramos o array de pedidos, e armazenamos ambas as posições em um novo array
        // O que permite criamos um pedido, com sempre a mesma quantidade de casas para itens
        for (int i = 0; i < pedidos.length; i++) {
            for (int j = 0; j < pedidos[i].length; j++) {
                novoPedidos[i][j] = pedidos[i][j];
            }
        }
        System.out.println("Pedido adicionado!");
        return novoPedidos;//Retornamo esse array bidimencional, que será salvo na chamada da função.
        
    }
}

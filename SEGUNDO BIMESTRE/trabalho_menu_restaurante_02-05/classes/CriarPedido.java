package classes;

public class CriarPedido {
    public int[][] criarPedido(String[]produtos, int[][] pedidos) {

        if (produtos.length < 1) {
            System.out.println("Adicione umm porduto primeiro");
            return pedidos;
        }else if(pedidos.length < 1 ){
            System.out.println("Primeira pedido adicionada");
            return new int[1][1];
        }


        int[][] novoPedidos = new int[pedidos.length][pedidos[pedidos.length-1].length];

        for (int i = 0; i < pedidos.length; i++) {
            for (int j = 0; j < pedidos[i].length; j++) {
                novoPedidos[i][j] = pedidos[i][j];
            }
        }
        System.out.println("Pedido adicionado!");
        return novoPedidos;
        
    }
}

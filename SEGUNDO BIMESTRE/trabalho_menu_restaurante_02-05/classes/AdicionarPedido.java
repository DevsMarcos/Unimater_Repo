package classes;

import java.util.Scanner;

public class AdicionarPedido {
    public int[][] adicionarPedido(int[][] pedido, String[] produtos, Scanner leitor) {

        int itenEscolhido = 0;
        int pedidoEscolhido = 0;

        if (pedido.length < 1) {
            System.out.println("Crie um novo pedido primeiramente");
            return pedido;
        }

        System.out.println("Qual dos pedidos você deseja adicionar o item: ");
        for (int i = 0; i < pedido.length; i++) {
            System.out.println(i + "° pedido");
        }
        pedidoEscolhido = leitor.nextInt();

        System.out.println("Qual iten você deseja adicionar no pedido: ");
        for (int i = 1; i < produtos.length; i++) {
            System.out.println(i + " - " + produtos[i]);
        }
        itenEscolhido = leitor.nextInt();

        for (int i = 0; i < produtos.length; i++) {

        }

        

        for (int i = 0; i < pedido[pedidoEscolhido].length; i++) {
            if (pedido[pedidoEscolhido][i] == 0) {
                pedido[pedidoEscolhido][i] = itenEscolhido;
                return pedido;
            } else if (pedido[pedidoEscolhido].length - 1 == i) {
                int[][] novoArray = new int[pedido.length][pedido[pedidoEscolhido].length + 1];
                for (int j = 0; j < pedido.length; j++) {
                    for (int k = 0; k < pedido[i].length; k++) {
                        novoArray[j][k] = pedido[j][k];
                    }
                }
                novoArray[pedidoEscolhido][novoArray[pedidoEscolhido].length - 1] = itenEscolhido;
                return novoArray;
            }
        }

        // for que percorre pedido[pedidoEscolhido]
        // ver se o item (pedido[pedidoEscolhido][i] == 0)
        // -> true -> voce sobreescreve o 0 por itenEscolhido
        // -> reetorna pedido
        // else if(é a ulta posicao da linha pedido[pedidoEscolhido] "i ==
        // pedido[pedidoEscolhido].lenght -1"
        // -> cria um novo array int[mantem][adiciona uma posicao]
        // -> copia o array antigo para o novo
        // -> adiciona na ultima posicao da linha pedido[pedidoEscolhido] o item
        // desejado
        // -> retorna o novo array criado
        //

        return pedido;

    }
}

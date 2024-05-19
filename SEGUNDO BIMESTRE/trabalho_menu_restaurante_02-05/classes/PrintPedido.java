package classes;

import java.util.Scanner;

public class PrintPedido {
    //Essa função tem por objetivo printar os pedidos em aberto, dando a possibilidade do usuário saber
    //De qual deles deseja saber o valor total de pedido;
    //Recebe como parâmetro o array de itens, o array de preços e um Scanner para receber que pedido deseja fechar 
    public double fecharPedido(int[][] pedido, double[]precos, Scanner leitor){
        int pedidoEscolhido = 0; //Var que recebe o pedido a ser fecahdo
        double valorFInal = 0;//Var que aramzenará o valor final do pedido

        //Aqui requisitamos oa usuário que pedido que o memso deseja finalizar
        System.out.println("Qual dos pedidos você deseja fechar a conta: ");
        //Utilizamos do método FOR, para iterar pelo array de pedidos, e retornar printando os pedidos em aberto;
        for (int i = 0; i < pedido.length; i++) {
            System.out.println(i + "° pedido");
        }
        pedidoEscolhido = leitor.nextInt();//Aramzenamos o pedido que o memso quer fechar.

        for (int posicaoItem : pedido[pedidoEscolhido]) {//Por fim iteamos o array, na posição ou seja no pedido, que o usuário escolheu
            //Somamos os valores.
            valorFInal += precos[posicaoItem];
        }

        return valorFInal;//retornamos os valores que serão printados na chamada de função.
    }
    
}

package classes;

import java.util.Scanner;

public class PrintPedido {
    public double fecharPedido(int[][] pedido, double[]precos, Scanner leitor){
        int pedidoEscolhido = 0;
        double valorFInal = 0;

        System.out.println("Qual dos pedidos você deseja fechar a conta: ");
        for (int i = 0; i < pedido.length; i++) {
            System.out.println(i + "° pedido");
        }
        pedidoEscolhido = leitor.nextInt();

        for (int posicaoItem : pedido[pedidoEscolhido]) {
            valorFInal += precos[posicaoItem];
        }

        return valorFInal;
    }
    
}

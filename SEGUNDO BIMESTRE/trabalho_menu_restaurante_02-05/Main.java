import java.util.Scanner;
import classes.AddItem;
import classes.AddPrice;
import classes.AdicionarPedido;
import classes.CriarPedido;
import classes.PrefixPrice;
import classes.PrintProducts;
import classes.Produto;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] produtos = new String[1];
        double[] preco = new double[1];
        int[][] pedidos = new int[0][0];


        /*
         * 
         * 1 2 
         * 1 0 0
         * 
         * 
         */

        // -------------------
        AddItem addItem = new AddItem();
        PrefixPrice prefixarItem = new PrefixPrice();
        AddPrice adicionarPreco = new AddPrice();
        PrintProducts printarProduto = new PrintProducts();
        CriarPedido criarPedido = new CriarPedido();
        AdicionarPedido adicionarPedido = new AdicionarPedido();

        // --------------------
        int opcao = -1;
        Produto produto = new Produto(null, null);

        while (opcao != 0) {
            opcao = ExibirMenu(leitor);
            switch (opcao) {

                case 1: {
                    produtos = addItem.adicionarItem(produtos, leitor);
                    preco = prefixarItem.prefixarPosicaoPreco(preco);
                    break;
                }

                case 2: {
                    produto = adicionarPreco.prefixPriceItem(produtos, preco, leitor);
                    produtos = produto.nomesProdutos;
                    preco = produto.precos;
                    break;
                }

                case 3: {
                    printarProduto.printarItens(produtos, preco);
                    break;
                }
                case 4:{
                   pedidos = criarPedido.criarPedido(produtos, pedidos);
                   break;
                }
                case 5: {
                    pedidos = adicionarPedido.adicionarPedido(pedidos, produtos, leitor);
                    break;
                }
            }
        }
    }

    private static int ExibirMenu(Scanner leitor) {
        int opcao;
        System.out.println("""


                1 - Adicionar item
                2 - Atribuir valor ao item
                3 - Listar os itens
                4 - Criar novo pedido
                5 - Adicionar item no pedido
                6 - Mostrar valor total do pedido
                0 - Sair.
                """);
        opcao = leitor.nextInt();
        leitor.nextLine();
        return opcao;
    }
}

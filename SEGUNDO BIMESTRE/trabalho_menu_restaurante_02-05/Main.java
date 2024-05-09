import java.util.Scanner;
import classes.AddItem;
import classes.AddPrice;
import classes.PrefixPrice;
import classes.PrintProducts;
import classes.Produto;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] produtos = new String[0];
        double[] preco = new double[0];

        // -------------------
        AddItem addItem = new AddItem();
        PrefixPrice prefixarItem = new PrefixPrice();
        AddPrice adicionarPreco = new AddPrice();
        PrintProducts printarProduto = new PrintProducts();

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
                6 - Adicionar item no pedido
                7 - Mostrar valor total do pedido
                0 - Sair.
                """);
        opcao = leitor.nextInt();
        leitor.nextLine();
        return opcao;
    }
}

import java.util.Scanner;
import classes.AddItem;
import classes.AddPrice;
import classes.AdicionarPedido;
import classes.CriarPedido;
import classes.PrefixPrice;
import classes.PrintPedido;
import classes.PrintProducts;
import classes.Produto;

public class Main {
    public static void main(String[] args) {
        //A função main, irá realizar o controle de todas as funções criadas e comandos executados
        //Recebe um Scanner, que será um dos parâmetros a ser informado nas funções
        Scanner leitor = new Scanner(System.in);
        //Um array de intes, que será passado por parâmetro
        String[] itens = new String[1];
        //Um array de preços, que começa com uma posição, que será passado como parâmetro
        double[] preco = new double[1];
        //Um array bidimencional de pedidos, que incializa em 0, e que será passado como parâmetro
        int[][] pedidos = new int[0][0];
        // -------------------
        //Abaixo temos a instanciação de todas as funções
        AddItem addItem = new AddItem();
        PrefixPrice prefixarItem = new PrefixPrice();
        AddPrice adicionarPreco = new AddPrice();
        PrintProducts printarProduto = new PrintProducts();
        CriarPedido criarPedido = new CriarPedido();
        AdicionarPedido adicionarPedido = new AdicionarPedido();
        PrintPedido printarValoresPedido = new PrintPedido();
        Produto produto = new Produto(null, null);

        // --------------------
        int opcao = -1; //Aqui temos uma variável de controle, para a escolha do pedido
        
        //Nessa aba de código realizamos a chamda da função conforme o o desejo do usuário
        while (opcao != 0) {
            //Aramzenamos na variável opcao, o valor que o usuário definiu, na função de exbirMenu.
            opcao = ExibirMenu(leitor);
            switch (opcao) {
                //Se a opcao for 1, aramzenaremos no array de ites, o retorno da função de adicionar item.
                //E aramzenaremos no array preco, a posição desse item.
                case 1: {
                    itens = addItem.adicionarItem(itens, leitor);
                    preco = prefixarItem.prefixarPosicaoPreco(preco);
                    break; // Parada
                }
                //Se a opcao for 2, armazenaremos em cada array sua função correspondente.
                //adicionaremos um valor ao pedido, passando como parâmetro o array de itens, de preços e o leitor
                case 2: {
                    produto = adicionarPreco.prefixPriceItem(itens, preco, leitor);
                    itens = produto.nomesProdutos;
                    preco = produto.precos;
                    break;
                }
                //Se a opção for a 3, pritaremos todos os itens, passando como parâmtro o array de itens e de preços
                case 3: {
                    printarProduto.printarItens(itens, preco);
                    break;
                }
                //Se for a 4, armazenaremos no array de pedidos um novo pedido.
                // criaremos um novo pedido vazio, passando como parâmtro o array de itens e de pedidos.
                case 4:{
                   pedidos = criarPedido.criarPedido(itens, pedidos);
                   break;
                }
                //Se for 5,aramzenaremos no array de pedidos um novo item.
                 //adicionaremos um item ao pedido, passando como parâmetro o array de pedidos, de itens e o leitor
                case 5: {
                    pedidos = adicionarPedido.adicionarPedido(pedidos, itens, leitor);
                    break;
                }
                //Por fim se for 6, pritaremos o retorno da função, passando o array de pedido, o preço e o leitor
                case 6: {
                    System.out.println("Preço Final: " +printarValoresPedido.fecharPedido(pedidos, preco, leitor));
                }
            }
        }
    }

    //Abaixo temos uma função que exibe o menu
    //Recebe como parâmetro um Scanner.

    private static int ExibirMenu(Scanner leitor) {
        int opcao; //Variável de controle de escolha de opção
        System.out.println("""


        
                1 - Adicionar item
                2 - Atribuir valor ao item
                3 - Listar os itens
                4 - Criar novo pedido
                5 - Adicionar item no pedido
                6 - Mostrar valor total do pedido
                0 - Sair.
                """);
        opcao = leitor.nextInt();//Armazenamento da opção escolhida 
        leitor.nextLine();//Limpando os buffers
        return opcao;//Retornando a opção desejada.
    }
}

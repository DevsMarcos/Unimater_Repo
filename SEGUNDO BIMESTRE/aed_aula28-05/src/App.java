import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.InterecaoUsuario;
import Classes.ProductsService;
import Classes.Produto;

public class App {
    public static void main(String[] args) {

        int opcaoEscolhida = 0;//Variável de controle de opção escolhida 

        Scanner opcao = new Scanner(System.in);
        ProductsService novoServiço = new ProductsService();//Instanciação da Classe ProductServices
        InterecaoUsuario pergunta = new InterecaoUsuario();//Instanciação da classe Perguntas

        List<Produto> produto = new ArrayList<>();//Lista com os itens a serem trabalhados
        produto.add(new Produto("Pó de Café", 2.50, 0));
        produto.add(new Produto("Arroz", 8, 0));
        produto.add(new Produto("Feijão", 12, 0));
        produto.add(new Produto("Bife", 55, 0));
        produto.add(new Produto("Coca-Cola", 12.00, 0));
        produto.add(new Produto("Barril de Heineken", 75, 0));

        /*Abaixo efetuaremos uma opereção onde, rodaresmo o código até o momento em que o usuário escolher 
        O valor 9. A cada operação que ele escolher, executaremos um bloco de código correspondenten, 
        E retornaresmo o valor da variável para zero, reiniciando o processo.
        */
        do {
            opcaoEscolhida = pergunta.PerguntaAoUsuario(opcao);

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Filtrando os produtos que possuem preço maior que 50.0 e exiba seus nomes");
                    novoServiço.filterList(produto);
                    System.out.println("-----------------------------------------------------------");
                    opcaoEscolhida = 0;
                    break;
                case 2:
                    System.out.println("Soma os valores da lista: ");
                    novoServiço.somaPrecos(produto);
                    System.out.println("-----------------------------------------------------------");

                    opcaoEscolhida = 0;

                    break;
                case 3:
                    System.out.println("O produto mais caro é: ");
                    novoServiço.produtoMaisCaro(produto);
                    System.out.println("-----------------------------------------------------------");

                    opcaoEscolhida = 0;

                    break;
                case 4:
                    System.out.println("Os produtos em ordem ficam da seguinte mnaneira: ");
                    novoServiço.produtosOrdenados(produto);
                    System.out.println("-----------------------------------------------------------");
                    opcaoEscolhida = 0;

                    break;
                case 5:
                    System.out.println("Produtos com descontos aplicados");
                    novoServiço.aplicarDesconto(produto);
                    System.out.println("-----------------------------------------------------------");
                    opcaoEscolhida = 0;

                    break;
                case 6:
                    System.out.println("Contando os produtos com valor de faixa");
                    novoServiço.contarProdutosComPrecoNaFaixa(produto);
                    System.out.println("-----------------------------------------------------------");
                    opcaoEscolhida = 0;

                    break;
                case 7:
                    System.out.println("Contando os produtos de acordo com o valor");
                    novoServiço.contarProdutosDeAcordoValor(produto);
                    System.out.println("-----------------------------------------------------------");
                    opcaoEscolhida = 0;
                    break;

                case 8:
                    System.out.println("Concatenando os produtos");
                    novoServiço.concatenarProdutos(produto);
                    System.out.println("-----------------------------------------------------------");
                    opcaoEscolhida = 0;

                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println("-----------------------------------------------------------");
                    opcaoEscolhida = 0;

                    break;

                case 9:
                    System.out.println("Saindo.....");
                    break;
            }
        } while (opcaoEscolhida != 9);

        opcao.close();
    }
}

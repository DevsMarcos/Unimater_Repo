package classes;
import java.util.Scanner;
//Aqui possuímos uma função que tem por objetivo atribuir preços aos itens criados; 
public class AddPrice {
    //Ela recebe como parâmeetros um array de itens, um array de preços e por fim um Scanner
    public Produto prefixPriceItem(String[] itens, double[] precos, Scanner leitor) {

        AddItem addItem = new AddItem();//Instanciação da função adicionar item.
        PrefixPrice prefixPrice = new PrefixPrice();//Instanciação da função de fixar posição ao item.

        int idItem = 0; // inicialização de variável que se referente ao ID ao item
        double precoInfo = 0;//Inicialização de variável que recebe valor atualizado

        //Nesse IF, primeiramente verificamos se o tamanho do array recebido;
        //Isso serve para verificarmos se possuimos um item a ser adcionado valor;
        // caso for
        if (itens.length <= 1 ) {
            String[] produtos = new String[itens.length + 1];// Criamos um novo array, que possui tamanho do array do parâmetro + 1
            System.out.println("Adicone um item primeiro!"); // Exigimos que o usuário adicione um item
            produtos = addItem.adicionarItem(itens, leitor);//Adiconamos um item ao array criado
            precos = prefixPrice.prefixarPosicaoPreco(precos);//E adicinamos um preço ao item criado
            return new Produto(produtos, precos); //retornamos um novo array, com um item já criado, que será armazenado na chamda
            //da função
        }

        //Porém, se o array tiver um item, podemos realizar a atribuição do valor
        if (itens.length >= 1) {
            System.out.println("Observe os itens que você possui: ");
            //Realizamos um for para percorre o array de intes, e informar ao usuário os itens que o array possui aramzenado
            for (int i = 1; i < itens.length; i++) {
                System.out.println(i + "-" + itens[i]);
            }
        }

        //Através de um método de Scanner, podemos pedir ao usuário qual item ele deseja adiconar valor
        System.out.println("Qual dos itens você deseja atribuir um novo valor: ");
        idItem = leitor.nextInt();

        leitor.nextLine();//Utilizado para limpar o buffer

        //Aqui, utilzamos o Scanner para poder armazenar o valor informado ao item anteriormente
        System.out.println("Digita agora o valor desejado: ");
        precoInfo = leitor.nextDouble();

        //Limpamos o buffer
        leitor.nextLine();


//Por fim aramazenamos o valor no array de preço, de acordo com a poisção do item.
        precos[idItem] = precoInfo;
        return new Produto(itens, precos); //Retornamos um novo array, com o o item e o preço, que será armazenado na chamda da função;
    }

}

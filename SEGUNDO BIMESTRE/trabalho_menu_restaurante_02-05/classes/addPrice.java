package classes;

import java.util.Scanner;
import java.util.function.Function;

public class AddPrice {
    public Produto prefixPriceItem(String[] itens, double[] precos, Scanner leitor) {

        AddItem addItem = new AddItem();
        PrefixPrice prefixPrice = new PrefixPrice();

        int idItem = 0;
        double precoInfo = 0;

        if (itens.length < 1) {
            String[] produtos = new String[itens.length+1];
            System.out.println("Adicone um item primeiro!");
            produtos = addItem.adicionarItem(itens, leitor);
            precos = prefixPrice.prefixarPosicaoPreco(precos);
            return new Produto(produtos, precos);

        }
        if (itens.length >= 1) {
            System.out.println("Observe os itens que você possui: ");
            for (int i = 0; i < itens.length; i++) {
                System.out.println(i + "-" + itens[i]);
            }    
        }

        System.out.println("Qual dos itens você deseja atribuir um novo valor: ");
        idItem = leitor.nextInt();

        leitor.nextLine();

        System.out.println("Digita agora o valor desejado: ");
        precoInfo = leitor.nextDouble();

        leitor.nextLine();

        precos[idItem] = precoInfo;
        return new Produto(itens, precos);
    }


}

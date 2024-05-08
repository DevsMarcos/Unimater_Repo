package classes;

import java.util.Scanner;

public class AddPrice {
    public void prefixPriceItem(String[] itens, double[] precos, Scanner leitor) {

        int idItem = 0;
        double precoInfo = 0;

        System.out.println("Onserve os itens que você possui: ");
        for (int i = 0; i < itens.length; i++) {
            System.out.println(i + "-" + itens[i]);
        }

        System.out.println("Qual dos itens você deseja atribuir um novo valor: ");
        idItem = leitor.nextInt();

        leitor.nextLine();

        System.out.println("Digita agora o valor desejado: ");
        precoInfo = leitor.nextDouble();

        leitor.nextLine();

        precos[idItem] = precoInfo;
    }
}

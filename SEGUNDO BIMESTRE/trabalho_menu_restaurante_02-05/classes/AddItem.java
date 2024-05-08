package classes;

import java.util.Scanner;

public class AddItem {
    public String[] adicionarItem(String[] arrayParaItens, Scanner leitor) {
        String[] arrayDeItens = new String[arrayParaItens.length + 1];

        for (int i = 0; i < arrayParaItens.length; i++) {
            arrayDeItens[i] = arrayParaItens[i];
        }

        System.out.println("Digite o nome do item a ser adicionado no meunu: ");
        arrayDeItens[arrayDeItens.length - 1] = leitor.nextLine();

        return arrayDeItens;
    }

}

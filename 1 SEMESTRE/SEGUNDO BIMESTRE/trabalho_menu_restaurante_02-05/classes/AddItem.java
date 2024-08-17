package classes;

import java.util.Scanner;
 //Essa função tem por obejtivo adicionar um novo item ao Menu.
public class AddItem {
    //Ela recebbe como paRâmetros um array de Strings e um Scanner para receber as palavras 
    public String[] adicionarItem(String[] arrayParaItens, Scanner leitor) {
        String[] arrayDeItens = new String[arrayParaItens.length + 1]; // Aqui criamos um novo array,de Strings que possui
        //Tamanho igual ao array recebido de parâmtro + 1;

        for (int i = 1; i < arrayParaItens.length; i++) {
            arrayDeItens[i] = arrayParaItens[i];
        }

        //O for acima é utilizado para percorrer o array parâmetro, e armazenar os dados de cada posição no array criado nessa função

        System.out.println("Digite o nome do item a ser adicionado ao menu: ");
        arrayDeItens[arrayDeItens.length - 1] = leitor.nextLine();
        //Aqui pedimos ao usuário qual item deseja adicionar, e o armazenamos na última posição do array criado;

        return arrayDeItens;
        //Por fim retornamos o array criado.
    }

}

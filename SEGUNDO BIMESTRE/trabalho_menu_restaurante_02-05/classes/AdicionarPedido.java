package classes;

import java.util.Scanner;
//Essa função tem por objetivo adiicionar um item a um pedido
public class AdicionarPedido {
//Ela recebe como parâmtros, um array bidimencional de pedidos, um array com os itens e um Scanner para receber as respostas 
    public int[][] adicionarPedido(int[][] pedido, String[] itens, Scanner leitor) {

        int itenEscolhido = 0; //Var que recebe o item escolhido
        int pedidoEscolhido = 0; //Var que recebe o pedido escolhido

        //Primeiramente verificamos se possuimos um pedido no qual podemos adcionar itens, caso não haja
        //Essa função para, e precisaremos adcionar um pedido na função correta
        if (pedido.length < 1) {
            System.out.println("Crie um novo pedido primeiramente!");
            return pedido;
        }

        //CAso haja um pedido poderemos selecionar o mesmo para adiconar o item
        //Utilizamos do for para iterar o array de pedidos, e printar os mesmos na tela
        System.out.println("Qual dos pedidos você deseja adicionar um item: ");
        for (int i = 0; i < pedido.length; i++) {
            System.out.println(i + "° pedido");
        }
        pedidoEscolhido = leitor.nextInt(); //Aqui utilizamos do scanner para armzenar o pedido que desejamo acessar

        //Aqui utilizamos do mesmo método acima, iteramos o attay, printamos os itens do carápio
        //E aramzenamos o item ecsolhido na variável
        System.out.println("Qual iten você deseja adicionar no pedido: ");
        for (int i = 1; i < itens.length; i++) {
            System.out.println(i + " - " + itens[i]);
        }
        itenEscolhido = leitor.nextInt();

        //Com isso, iteramos nosso array de pedido, na posição de pedido que o usuário definiu, ou seja n próprio pediu que o
        //usuário definiu, e seguimos algumas condições
        for (int i = 0; i < pedido[pedidoEscolhido].length; i++) {
            //Se no pedido na poisção que o usuário definiu, na posição atual de i na reptição que estamos for igual a 0
            if (pedido[pedidoEscolhido][i] == 0) {
                //Substituimos o valor 0 dessa posição atual de i na repatição, pelo item que o usuário escolheu
                pedido[pedidoEscolhido][i] = itenEscolhido;
                //E retornamos o pedido
                return pedido;
                //Agora, se no pedido na poisção que o usuário escolheu, na última posição, foir igual ao valor atual da repetição
            } else if (pedido[pedidoEscolhido].length - 1 == i) {
                //Nós criamos um novo Array bidimencional, onde a primeira parte será o tamanho do array de pedidos recebido como 
                //parâmetro, e a segunda parte será o tamanho do array, no pedido definido pelo usuário + 1
                int[][] novoArray = new int[pedido.length][pedido[pedidoEscolhido].length + 1];
                //Sendo assim iteramos os dois arrays, e passamos os itens de cada posição para o array criado;
                for (int j = 0; j < pedido.length; j++) {
                    for (int k = 0; k < pedido[j].length; k++) {
                        novoArray[j][k] = pedido[j][k]; // Aqui estamos realizando esse armazenamento
                    }
                }
                //Se no novo array, no pedido que o usuário escolheu, ná utlima posição desse pedido, houver um pedido
                novoArray[pedidoEscolhido][novoArray[pedidoEscolhido].length - 1] = itenEscolhido;
                //Nós retornamos o novo array, com uma poisção a mais conforme acima feito.
                return novoArray;
            }
        }
        //Por fim, retornamos o pedido em si.
        return pedido;

    }
}

package Classes;
import java.util.Scanner;
//Temos uma calsse que faz as validçaõ de todas as combinações possíveis entre os numeros
//De duas listas, de tamanhos e valores informados pelo usuário;
public class Combinacoes {
    public void combinacoes(Scanner leitor) {//Aqui temos o método que realiza e controla essa tarefa 
        //Abaixo recebemos o tamanho da primeira lsita 
        int quantidadeNumerosLista1 = recebeQuantidadeLista1(leitor);
        //Abaixo, recemos o primeiro array que é salvo a var array1, recebendo os parâmetros necessários
        int [] array1 = Lista1(leitor, quantidadeNumerosLista1);
        //Abaixo recebemos o tamanho da segunda lsita 
        int quantidadeNumerosLista2 = recebeQuantidadeLista2(leitor);
        //Abaixo, recemos o segundo array que é salvo a var array2, recebendo os parâmetros necessários
        int[] array2 = Lista2(leitor, quantidadeNumerosLista2);

        printar(array1, array2);//Aqui passamos os arrays como parâmetro para realizar a impressão;
      
    }

    private int recebeQuantidadeLista1(Scanner leitor){
        int quantidadeNumeros1 = 0; //Variável de controle para a quantidade de números informadas

        System.out.println("Informe quantos numros você deseja ter na 1° lista: ");//Pergunta o usuário
        quantidadeNumeros1 = leitor.nextInt();//Utilizando do Scanner para salvar o número informado na variável

        return quantidadeNumeros1;//Retornando o valor da variável para ser utilzado posteriromente 
    }

    /*o método abaixo recebe a quantidade de itens que o usuário deseja ter na 2° lsita 
 * o méotodo em questão receb um Scanner para realiar a leitura do numero digita pelo usuário
*/
    private int recebeQuantidadeLista2(Scanner leitor){
        int quantidadeNumeros2 = 0;//Variável de controle para a quantidade de números informadas


        System.out.println("Informe quantos numros você deseja ter na 2° lista: ");//Pergunta o usuário
        quantidadeNumeros2 = leitor.nextInt();//Utilizando do Scanner para salvar o número informado na variável

        return quantidadeNumeros2;//Retornando o valor da variável para ser utilzado posteriromente 
    }

/*O método abaxio, realiza a montagem da lista para o usuário, com a quantidade de números informada
 * ou seja, ousuário pode informar uma sequência númerica do tamanho que ele mesmo escolheu.
 * possui de parâmetros um Scanner para salvar os números do usuário
 * possui um parâmetro que controle o tamanho do array.
 */
    private int[] Lista1(Scanner leitor, int quanitdadeDeNumeros){
        int numAtual = 0;//VAriável de controle do numeor atual;

        int[] array1 = new int[quanitdadeDeNumeros];//Array de tamanho personalizado

        //O for abaixo percorre o as posições do array acima, e a cada cliclo
        //Ele salva na posição um valor informado pelo usuário
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Informe o numero "+(i+1)+"º para a lista 1: ");//Pergunta feita ao usuário
            numAtual = leitor.nextInt();//Salvano o valor atual de forma temporaria
            array1[i] = numAtual;//Gravando o valor na posição do array.
        }

        return array1;//Retornado o array por completo para validação

    }
/*O método abaxio, realiza a montagem da lista para o usuário, com a quantidade de números informada
 * ou seja, ousuário pode informar uma sequência númerica do tamanhop que ele mesmo escolheu.
 */
    private int[] Lista2(Scanner leitor, int quanitdadeDeNumeros){
        int numAtual = 0;//VAriável de controle do numeor atual;
        
        int[] array2 = new int[quanitdadeDeNumeros];//Array de tamanho personalizado
        //O for abaixo percorre o as posições do array acima, e a cada cliclo
        //Ele salva na posição um valor informado pelo usuário
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Informe o numero "+(i+1)+"º para a lista 2: ");//Pergunta feita ao usuário
            numAtual = leitor.nextInt();//Salvano o valor atual de forma temporaria
            array2[i] = numAtual;//Gravando o valor na posição do array.
        }

        return array2;//Retornado o array por completo para validação

    }

    //O método abaxio, recebe dois arrays de parâmetro, e possui por ojbjetivo percorre os dois, printa
    //printando os valores de cada de forma de par ordenado
    public void printar(int[] arayPirmeiro, int[] arraySegundo){
        for (int i : arayPirmeiro) {//Percorre o primeiro array
            for (int j : arraySegundo) {//Percorre o segundo array
                System.out.println("(" + i + ", " + j + ")");//Printa no formado de par ordenado
            }
        }
    }
}

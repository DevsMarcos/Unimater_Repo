package Classes;
import java.util.Scanner;
/*Inicialmente temos a função principal, que será chamda no arquivo Main quando necessário,
 * essa função recebe uma função ordenaArray, com um Scanner de parâmetro para ser passando
 * posteriormente;
 */
public class OrdenarArray {
    //O método ordenaArray, recebe um Scanner para poder amrazenar em variáveis ovalor digitado
    //pelo usuário
    public void ordenaArray(Scanner leitor) {
    int quantidadeNumeros = recebeQuantidadeNumeros(leitor);//Aqui essa variável, recebe a
    //quantidade de números que o usuário que digitar

    int [] returnNumeros = new int [quantidadeNumeros];// Aqui criamos um array do tamanho correspodente

    returnNumeros = recebeNumeros(leitor, quantidadeNumeros);//Aqui chamamos o método que organiza esse 
    //recebe os numeros a serem salvos

    printarOrdem(returnNumeros);//Por fim chamamos o método que organiza e printa os numeros;
}

/*A função abaixo recebe a qunatidade de números que o usuário gostaria de organizar. Recebe um Scanner como
 * parâmetro para poder receber esse valor e salva-lo em uma variálve.
 */
private int recebeQuantidadeNumeros(Scanner leitor){
    //Temos a variável que controla a quantidade de números, sendo inicializada em0
    int quantidade = 0;

    //Temos a pergunta formulada ao usuário
    System.out.println("Quantos numeros você deseja ordenar: ");
    //O método Scanner, que realiza a atribuição do novo valor a variável;
    quantidade = leitor.nextInt();

    //O retorno da variável para ser utilzaidano método OrdenarArray
    return quantidade;
}

/*Abaixo temos o método que recebe os números informados pelo usuário, baseadana quantidade também
 * informada pelo mesmono método acima. Possui como parâmetro o Scanner para recebr os números e
 * a quanitdade de numeros que o mesmo deseja informar, sendo estabelecida no método acima.
 */
private int[] recebeNumeros(Scanner leitor, int quantidadeNumeros){
    
    //Aqui temos um array, do tamanho iformado pelo usuário
    int [] num = new int[quantidadeNumeros];
    //Uma vairável que faz o controle dos números a serem armazenados
    int numAtual = 0;

    //Temos um for que repete de acordo com a quantidade de espaços presentes no array
    // e no qual, salva um numero iformdo pelo usuário, no espaço respectivo do loop
    for (int i = 0; i < num.length; i++) {
        System.out.println("Informe o "+(i+1)+"º numero: "); //Pergunta ao usuário
        numAtual = leitor.nextInt();//Var de controle de numero atual, junto com o Scanner para armzenar
        num[i] = numAtual; // aramzeamento do valor informado pelo scanner, na poisção respectiva
        //do array, no loop em questão.
    }
    return num; //Retorno do array, para ser utilizado no métdo principal
}
/*Abaixo temos o método que recebe o array formado, percorre o mesmo, e realiza a organizaão do mesmo
com base no valor atual da posição, recebe um outro array como parâmetro
 */
private void printarOrdem(int [] num){
/*Ambos os for abaixo, percorrem o array, com o bjetivo de realizar a validção de qual número é o maior,
 * realizado a sua organização.
 * O primeiro for, percorre o array, até o seu fim indo do início ao fim;
 * O segundo for percorre o array, do fim do mesmo até o início, de trás para frente
 * ao mesmo tempo que anula o valor da posição do primeiro array;
 * 
 */
    for (int i = 0; i < num.length-1; i++) {
        for (int j = 0; j < num.length-i-1; j++) {
            if (num[j] > num[j+1]) {
                //Aqui ocorre a validção dos valores que os For`s estão percorrendo;
                //Se o numero na posição J for maio que o numero na posição J + 1:
                int temp = num[j];
                //Então esse número será armazenado temporariamente
                num[j] = num[j+1];
                //Após isso esse número é substituido pelo seu succesor
                num[j+1] = temp;
                //Que é aramzenado temporiamente, reiniciando o ciclo até o fimdo array
            }
        }
    }
//Por fim neste for, percorremos este array organizado e printamos o numero conforme a posição atual;
    for (int i = 0; i < num.length; i++) {
        System.out.println((i+1)+"º numero: "+num[i]);//Pritando o numero
    }
}
}

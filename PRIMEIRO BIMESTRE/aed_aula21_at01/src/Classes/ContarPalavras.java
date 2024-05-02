package Classes;
import java.util.Scanner;

/*Aqui temos um classe que realiza a contagem de espaços em uma frase */
public class ContarPalavras {
    public void contaPalavras(Scanner leitor){//Temo o método que efetivamente realiza o processo de contagem
        //dos espaços, e para isso ele utiliza de métodos auxiliares
        String palavras = "";//String que receberá a frase
        int espacos = 0;//Quantidade de espaços na frase

        palavras = recebePalavra(leitor);//Aqui recebemos a frase criada
        espacos = validacao(palavras);//Aqui recebemos a quanitade de espaços gerada na validação
       printar(espacos);//Aqui printamos o resultado baseado na validação

    }
//Esse método realiza o recebimento da frase que será validadda, possui um parâmetro Scanner para salvar
//EM uma variável o que o usuário digitar;
    private String recebePalavra(Scanner leitor){
        String retorno = "";//Variável de controle 
        System.out.println("Digite uma frase: ");//Pergunta 
        retorno = leitor.nextLine();//Utilização do Scanner para salvar em uma variável

        return retorno;//Retorno da variável para a utilização.
    }
//Método que realiza a validação dos espaços, utiliza como parâmetro a frase;
    private int validacao(String palavras){
        String[] array = palavras.split(" ");//Faz a searação da frase, e salva cada elemento no formato
        //De um arrar.
        int retorno = array.length-1;//mede o comprimento do array e tira um para, para remover
        //O valor inicial em 0

        return retorno; //Retorna o valor para utilização
 
    }
//Método que printa o resultado, possui de parâmetro um inteiro que seriam os espaços
    private void printar(int returnEspacos){
        
        System.out.println("O número de espaços é de: "+returnEspacos);//Print do resultado

    }
}

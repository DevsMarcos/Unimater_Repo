package Classes;
import java.util.Scanner;

public class ContarPalavras {
    public void contaPalavras(Scanner leitor){
        String palavras = "";
        int espacos = 0;

        palavras = recebePalavra(leitor);
        espacos = validacao(leitor, palavras);
       printar(espacos);

    }

    private String recebePalavra(Scanner leitor){
        String retorno = "";
        System.out.println("Digite uma frase: ");
        retorno = leitor.nextLine();

        return retorno;
    }

    private int validacao(Scanner leitor, String palavras){
        String[] array = palavras.split(" ");
        int retorno = array.length-1;

        return retorno;
 
    }

    private void printar(int returnEspacos){
        
        System.out.println("O número de espaços é de: "+returnEspacos);

    }
}

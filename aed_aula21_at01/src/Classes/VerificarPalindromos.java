package Classes;
import java.util.Scanner;

public class VerificarPalindromos {
    public void FuncaoPalidromos(Scanner leitor){
        String normal = "";
        String invertida = "";

        normal = palavraParaComparar(leitor);
        invertida = inversao(normal);
        printarRepo(normal, invertida);
        
    }
    //Essa função realiza o recebimento da palavra na qual se vereficará se é um palíndromo
    //Ela recebe como parâmetro um Scanner de nome leitor, no qual será informado na chamada da função
    private String palavraParaComparar(Scanner leitor){
        //Inicializamos com uma variável so tipo String
        String retorno = "";
        //Printamos a pergunta ao usuário, para ele digitar a frase ou palavra que deseja verificar
        System.out.println("Informe a palavra ou frase que você deseja verificar que é palíndromo: ");
        //Armazenamos na variável em questão, removendo todos os espaços ´presentes, e deixando tudo
        //EM Maísuculo
        retorno = leitor.nextLine().toUpperCase().replace(" ", "");
        //Retornamos esse valor para ser utilizada porsteriormente;
        return retorno;
    }
    
    //Essa função realiza o procedimento de inversão da palavra ou frase informada anteriomente;
    //Ela recebe como parâmetro uma String, na qual se trata da palavra ou frase escrita da forma orgional
    private String inversao(String palvaraNormal){
        String retorno = "";
        for (int i = palvaraNormal.length()-1; i >= 0; i--) {
            //Utilizamos o for para percorrer a palvara e "monta-la" ao contrário
            //Removendo todos os espaços e deixando tudo maísuculo
            retorno += palvaraNormal.toUpperCase().replace(" ", "").charAt(i);
        }
        //Retornamos esse valor para ser utilizada porsteriormente;
       return retorno;

    }

    private void printarRepo(String palvaraNormalResult, String palavraInvertResult){
        if (palavraInvertResult.equals(palavraInvertResult)) {
            System.out.println("Você possui um palíndromo!");
            System.out.println("Normal: "+palvaraNormalResult);
            System.out.println("Invertida: "+palavraInvertResult);
        }else {
            System.out.println("Você NÃO POSSUI um palíndromo");
            System.out.println("Normal: "+palvaraNormalResult);
            System.out.println("Invertida: "+palavraInvertResult);
        }
    }
}

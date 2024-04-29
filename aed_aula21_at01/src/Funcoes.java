import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Funcoes {
//OK---------------------------------------------------------------------------------------------------------------
    public void verificarPalindromo(){
        String normal = "";
        String invertida = "";
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a palavra ou frase que você deseja verificar que é palíndromo: ");
        normal = leitor.nextLine().toUpperCase().replace(" ", "");

        for (int i = normal.length()-1; i >= 0; i--) {
            invertida += normal.toUpperCase().replace(" ", "").charAt(i);
        }

        if (normal.equals(invertida)) {
            System.out.println("Você possui um palíndromo!");
            System.out.println("Normal: "+normal);
            System.out.println("Invertida: "+invertida);
        }else {
            System.out.println("Você NÃO POSSUI um palíndromo");
            System.out.println("Normal: "+normal);
            System.out.println("Invertida: "+invertida);
        }
        leitor.close();

    }
//---------------------
public void combinacoes() {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        for (int i : array1) {
            for (int j : array2) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }
//----------------------------------------------------------------------------------------
//PARCIALMENTE CERTO-------------------------------------------------------------------------------------------
    public void calculoJurosCompostos(){
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        double montate = 0; 
        int capital = 0;
        int taxaDeJuros = 0/100;
        int tempo = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor do capital inicial que você deseja aplicar: ");
        capital = leitor.nextInt();

        System.out.println("Informe a taxa de juros anual em porcento: ");
        taxaDeJuros = leitor.nextInt();

        System.out.println("Informe por quanto tempo você deseja deixar essse dinheiro aplicado: ");
        tempo = leitor.nextInt();

        montate = capital * Math.pow((1 + taxaDeJuros), tempo);

        System.out.println("O montate final da sua aplicaççao é de: "+dinheiro.format(montate));

        leitor.close();
    }
//-------------------------------------------------------------------------------
 //OK --------------------------------------------------------------------------
    public void contaPalavras(){
        String palavras = "";
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        palavras = leitor.nextLine();

       int numerosInt = palavras.split(" ").length;

       System.out.println("O número de espaços é de: "+numerosInt);

       leitor.close();

    }
//--------------------------------------------------------------------------------
// OK ----------------------------------------------------------------------------
    public void calculaDistanciaPontos(){
        float x1 = 0;
        float y1 = 0;
        float x2 = 0;
        float y2 = 0;
        double resultado = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira os valores o primeiro par ordenado");
        System.out.println("Insira o valor de X1: ");
        x1 = leitor.nextFloat();
        System.out.println("Informe o valor de Y1: ");
        y1 = leitor.nextFloat();

        System.out.println("Informe agora os valores do segundo par ordenado");
        System.out.println("Informe o valor de X2: ");
        x2 = leitor.nextFloat();
        System.out.println("Informe o valor de Y2: ");
        y2 = leitor.nextFloat();

        resultado = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));

        System.out.println("A distância dos pontos é de: "+resultado);

        leitor.close();
    }
//----------------------------------------------------------------------------------
}

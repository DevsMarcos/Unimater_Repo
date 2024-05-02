
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Funcoes {
//OK---------------------------------------------------------------------------------------------------------------
    public void verificarPalindromo(Scanner leitor){
        String normal = "";
        String invertida = "";

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
        

    }
///////-------------------
public void ordenaArray(Scanner leitor) {
    int [] numeros = new int[10];
    int numAtual = 0;

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Informe o "+(i+1)+"º numero: ");
        numAtual = leitor.nextInt();
        numeros[i] = numAtual;
    }

    for (int i = 0; i < numeros.length-1; i++) {
        for (int j = 0; j < numeros.length-i-1; j++) {
            if (numeros[j] > numeros[j+1]) {
                // troca numeros[j+1] e numeros[i]
                int temp = numeros[j];
                numeros[j] = numeros[j+1];
                numeros[j+1] = temp;
            }
        }
    }
    Arrays.stream(numeros).forEach(System.out::println);
}
//---------------------
public void combinacoes(Scanner leitor) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int numAtual = 0;
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Informe o numero "+(i+1)+"º para a lista 1: ");
            numAtual = leitor.nextInt();
            array1[i] = numAtual;
        }
        for (int j = 0; j < array2.length; j++) {
            System.out.println("Informe o numero "+(j+1)+"º para a lista 2: ");
            numAtual = leitor.nextInt();
            array2[j] = numAtual;
        }
        for (int i : array1) {
            for (int j : array2) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }
//----------------------------------------------------------------------------------------
//PARCIALMENTE CERTO-------------------------------------------------------------------------------------------
    public void calculoJurosCompostos(Scanner leitor){
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        double montate = 0; 
        double capital = 0;
        double taxaDeJuros = 0;
        double tempo = 0;

        System.out.println("Informe o valor do capital inicial que você deseja aplicar: ");
        capital = leitor.nextDouble();

        System.out.println("Informe a taxa de juros anual em porcento: ");
        taxaDeJuros = leitor.nextDouble();

        System.out.println("Informe por quanto tempo você deseja deixar essse dinheiro aplicado: ");
        tempo = leitor.nextDouble();

        montate = capital * (Math.pow((1 + (taxaDeJuros/100)), tempo));
        System.out.println("O montate final da sua aplicaççao é de: "+dinheiro.format(montate));

    }
//-------------------------------------------------------------------------------
 //OK --------------------------------------------------------------------------
    public void contaPalavras(Scanner leitor){
        String palavras = "";
        System.out.println("Digite uma frase: ");
        palavras = leitor.nextLine();

       String[] array = palavras.split(" ");
       int tamanho = array.length-1;

       System.out.println("O número de espaços é de: "+tamanho);


    }
//--------------------------------------------------------------------------------
// OK ----------------------------------------------------------------------------
    public void calculaDistanciaPontos(Scanner leitor){
        float x1 = 0;
        float y1 = 0;
        float x2 = 0;
        float y2 = 0;
        double resultado = 0;
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

    }
//----------------------------------------------------------------------------------
}
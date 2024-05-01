package Classes;
import java.util.Scanner;

public class Combinacoes {
    public void combinacoes(Scanner leitor) {
        int quantidadeNumerosLista1 = recebeQuantidadeLista1(leitor);
        int [] array1 = Lista1(leitor, quantidadeNumerosLista1);

        int quantidadeNumerosLista2 = recebeQuantidadeLista2(leitor);
        int[] array2 = Lista2(leitor, quantidadeNumerosLista2);

        printar(array1, array2);
      
    }

    private int recebeQuantidadeLista1(Scanner leitor){
        int quantidadeNumeros1 = 0;

        System.out.println("Informe quantos numros você deseja ter na 1° lista: ");
        quantidadeNumeros1 = leitor.nextInt();

        return quantidadeNumeros1;
    }

    private int recebeQuantidadeLista2(Scanner leitor){
        int quantidadeNumeros2 = 0;

        System.out.println("Informe quantos numros você deseja ter na 2° lista: ");
        quantidadeNumeros2 = leitor.nextInt();

        return quantidadeNumeros2;
    }

    private int[] Lista1(Scanner leitor, int quanitdadeDeNumeros){
        int numAtual = 0;

        int[] array1 = new int[quanitdadeDeNumeros];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Informe o numero "+(i+1)+"º para a lista 1: ");
            numAtual = leitor.nextInt();
            array1[i] = numAtual;
        }

        return array1;

    }

    private int[] Lista2(Scanner leitor, int quanitdadeDeNumeros){
        int numAtual = 0;
        
        int[] array2 = new int[quanitdadeDeNumeros];

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Informe o numero "+(i+1)+"º para a lista 2: ");
            numAtual = leitor.nextInt();
            array2[i] = numAtual;
        }

        return array2;

    }

    public void printar(int[] arayPirmeiro, int[] arraySegundo){
        for (int i : arayPirmeiro) {
            for (int j : arraySegundo) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }
}

package Classes;
import java.util.Scanner;

public class OrdenarArray {
    
    public void ordenaArray(Scanner leitor) {
    int quantidadeNumeros = recebeQuantidadeNumeros(leitor);

    int [] returnNumeros = new int [quantidadeNumeros];

    returnNumeros = recebeNumeros(leitor, quantidadeNumeros);

    printarOrdem(returnNumeros);
}

private int recebeQuantidadeNumeros(Scanner leitor){
    int quantidade = 0;

    System.out.println("Quantos numeros você deseja ordenar: ");
    quantidade = leitor.nextInt();

    return quantidade;
}

private int[] recebeNumeros(Scanner leitor, int quantidadeNumeros){
    
    
    int [] num = new int[quantidadeNumeros];
    int numAtual = 0;

    for (int i = 0; i < num.length; i++) {
        System.out.println("Informe o "+(i+1)+"º numero: ");
        numAtual = leitor.nextInt();
        num[i] = numAtual;
    }

    return num;
}

private void printarOrdem(int [] num){

    for (int i = 0; i < num.length-1; i++) {
        for (int j = 0; j < num.length-i-1; j++) {
            if (num[j] > num[j+1]) {
                // troca num[j+1] e num[i]
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
            }
        }
    }

    for (int i = 0; i < num.length; i++) {
        System.out.println((i+1)+"º numero: "+num[i]);
    }
}
}

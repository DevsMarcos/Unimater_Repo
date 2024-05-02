package aed_aula16_at04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor [] = new int [4];
        int maior = 0;
        int menor = Integer.MAX_VALUE;
        Scanner leitorNum = new Scanner(System.in);

        for (int i = 0; i < valor.length; i++) {
            System.out.println("Informe um valor "+(i+1)+"º valor: ");
            valor[i] = leitorNum.nextInt();

            if (valor[i] > maior) {
                maior = valor[i];
            }
        }

        for (int j = 0; j < valor.length; j++) {
            if (valor[j] < menor ) {
                menor = valor[j];
            }
        }

        leitorNum.close();
        System.out.println("O maior valor é: "+maior);
        System.out.println("O menor valor é: "+menor);

    }
}
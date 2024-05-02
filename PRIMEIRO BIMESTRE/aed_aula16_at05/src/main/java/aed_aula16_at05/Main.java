package aed_aula16_at05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Soma da das sequências de Fibonacci");

        int anterior = 0;
        int atual = 1;
        int soma = 1;
        int contador = 0;
        int numeroInformado = 0;

        Scanner leitorNum = new Scanner(System.in);

        do {
            System.out.println("Informe até qual termo da sequência de Fibonacci você deseja calcular: ");
            numeroInformado = leitorNum.nextInt();

            System.out.println("Segue a sequência de Fibonacci solicitada: ");
            for (contador = 0; contador < numeroInformado; contador++) {
                System.out.println((contador + 1) + "º " + anterior);
                soma = atual + anterior;
                anterior = atual;
                atual = soma;
            }
        } while (contador != numeroInformado);
        leitorNum.close();
        System.out.println("FIM");
    }
}
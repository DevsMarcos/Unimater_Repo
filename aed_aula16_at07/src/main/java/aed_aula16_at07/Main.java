package aed_aula16_at07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-Vindo a soma de números.");
        int n1 = 0 ;
        int soma = 0;
        int unidade = 0;
        
        Scanner leitorNum = new Scanner(System.in);

        System.out.println("Informe um número: ");
        n1 = leitorNum.nextInt();

        do {
            soma += n1 % 10;
            n1 = n1 / 10;
        } while (n1 !=0);

        System.out.println(soma);
    }
}
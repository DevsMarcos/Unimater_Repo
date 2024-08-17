package aed_aula16_at06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número qualquer, para verificar se o mesmo é primo: ");
        num = leitor.nextInt();
        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        if (!primo) {
            System.out.println("Não é primo!");
        }

        if (primo) {
            System.out.println("Seu número é primo!");
        }

        leitor.close();

    }
}
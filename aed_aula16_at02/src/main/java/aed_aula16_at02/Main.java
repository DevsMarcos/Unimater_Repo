package aed_aula16_at02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dividendo = 0;
        int divisor = 1;
        System.out.println("Descobrindo divisores");

        Scanner leitorNumero = new Scanner(System.in);
        System.out.println("Informe o numero ao qual você deseja descobrir o divisor: ");
        dividendo = leitorNumero.nextInt();

        while (divisor <= dividendo) {
            divisor++;
            if (dividendo % divisor == 0) {
                System.out.println("-> " + divisor);
            }
        }
        leitorNumero.close();
    }
}
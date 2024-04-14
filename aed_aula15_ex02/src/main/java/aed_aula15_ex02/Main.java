package aed_aula15_ex02;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // LOOP COM WHILE E DOWHILE 
        Random random = new Random();
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = random.nextInt(10);
        int numeroChutado = -1;


        while (numeroGerado != numeroChutado) {
            System.out.println("Informe um numero de 0  a 10");
            numeroChutado = leitor.nextInt();
            System.out.println("numero gerado: " + numeroGerado);
        }

        do {
            System.out.println("Informe um numero de 0  a 10");
            numeroChutado = leitor.nextInt();
            System.out.println("numero gerado: " + numeroGerado);
        } while (numeroGerado != numeroChutado);

        leitor.close();;
    }
}
package aed_aula15_ex01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ESTRUTURA DE REPETIÇÃO COM FOR 
        
        Random random = new Random();
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = random.nextInt(10);

        int numeroChutado = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Chute um numero: ");
            numeroChutado = leitor.nextInt();

            if (numeroChutado == numeroGerado) {
                System.out.println("Você Acertou!!!");
                break;
            } else{
                System.out.println("Você errou, tente novamente!");
            }
        }
        System.out.println("O némero era: "+numeroGerado);
        leitor.close();
    }
}
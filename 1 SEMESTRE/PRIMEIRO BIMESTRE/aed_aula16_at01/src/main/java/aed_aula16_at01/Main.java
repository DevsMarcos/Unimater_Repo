package aed_aula16_at01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero = 0;
        int resultado = 1;

        System.out.println("Calculadora de Fatorial");
        
        Scanner leitorNumero = new Scanner(System.in);
        System.out.println("Informe um número para calcular seu fatorial: ");
        numero = leitorNumero.nextInt();

        while (numero >= 1) {
            resultado = resultado*(numero);
            numero--;
        }
        System.out.println("O fatorial é "+resultado);
        leitorNumero.close();
    }
}
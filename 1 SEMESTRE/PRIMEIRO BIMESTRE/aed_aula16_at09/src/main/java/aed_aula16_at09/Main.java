package aed_aula16_at09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Verificando se um número é um palíndromo");
        int numero = 0;

        Scanner leitorNum = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = leitorNum.nextInt();

        String numeroString = String.valueOf((numero));
        char[] arrayDaString = numeroString.toCharArray();
        int contador = arrayDaString.length - 1 ;
        int contadorSobe = 0;
        boolean ehIgual = true;

        do {
            if (arrayDaString[contador] != arrayDaString[contadorSobe]) {
                ehIgual = false;
            }
            contador--;
            contadorSobe++;
        } while (contador >= 0);
        
        System.out.println(ehIgual ? "É palíndromo" : "Não é palídromo");
        
    }
}
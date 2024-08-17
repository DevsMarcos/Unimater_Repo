package aed_aula16_at10;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número para calcular a raiz quadrada: ");
            double num = scanner.nextDouble();
    
            if (num < 0) {
                System.out.println("Por favor, digite um número não negativo.");
                return;
            }
    
            double raiz = num / 2; // Inicia com uma estimativa
            double erro = 0.001;
            double diferenca;
    
            // Calcula a diferença usando a estimativa inicial
            diferenca = (raiz * raiz);
    
            // Loop while para refinar a estimat,-iva da raiz quadrada
            while (diferenca > erro || diferenca < -erro) {
                raiz = (raiz + num / raiz) / 2;
                diferenca = (raiz * raiz) - num;
            }
    
            System.out.printf("A raiz quadrada de %.3f é aproximadamente %.3f%n", num, raiz);
            scanner.close();
        }
    
    
    }
    
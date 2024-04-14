package aed_aula16_at03;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora de numeros primos");
        boolean ehprimo = true;

        for (int i = 1; i <= 100; i++) {
            ehprimo = true;            
          for (int j = i; j > 0; j--) {
            if (i%j==0 && i!=j && j!=1) ehprimo = false;            
          }
          if (ehprimo) System.out.println(i);        
        }
    }
}
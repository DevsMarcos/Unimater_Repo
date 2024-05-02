package aed_aula16_at08;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int somaDivisores = 0;


        for (int i = 1; i <= 1000; i++) {
            somaDivisores = 0;
            for (int j = i; j > 0; j--) {
                if (i%j == 0 && j != i) {
                    somaDivisores += j;
                }
            }
            if (i == somaDivisores) {
                System.out.println(i+ " é perfeito");
            }
        }
    }
}
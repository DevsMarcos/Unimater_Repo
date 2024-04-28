import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int [] numeros = {2, 2, 4, 4, 6, 8, 10};
        int contador = 0;


        Arrays.stream(numeros).forEach(System.out::println);

        for (int numero : numeros) {
            if (numero == 2) {
                contador++;
            }
            System.out.println("O número 2 aparece: "+contador);
        }
    }
}

public static void contarNum(int numero, int [] Array){
    
}
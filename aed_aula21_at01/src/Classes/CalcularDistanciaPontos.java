package Classes;
import java.util.Scanner;

public class CalcularDistanciaPontos {
        public void calculaDistanciaPontos(Scanner leitor){
        int x1 = ParX1(leitor);
        int y1 = ParY1(leitor);
        int x2 = ParX2(leitor);
        int y2 = ParY2(leitor);
        double resultadoFinal = calculo(x1, y1, x2, y2);
        printar(resultadoFinal);
    }

    private int ParX1(Scanner leitor){
        int retornoX1= 0;
        System.out.println("Insira os valores o 1° par ordenado");
        System.out.println("Insira o valor de X1: ");
        retornoX1 = leitor.nextInt();

        return retornoX1;
    }

    private int ParY1(Scanner leitor){
        int retornoY1= 0;
        System.out.println("Agora insira o valor de Y1: ");
        retornoY1 = leitor.nextInt();

        return retornoY1;
    }

    private int ParY2(Scanner leitor){
        int retornoY2= 0;
        System.out.println("Agora insira o valor de Y2: ");
        retornoY2 = leitor.nextInt();

        return retornoY2;
    }

    private int ParX2(Scanner leitor){
        int retornoX2= 0;
        System.out.println("Insira os valores o 2° par ordenado");
        System.out.println("Insira o valor de X1: ");
        retornoX2 = leitor.nextInt();

        return retornoX2;
    }

    private double calculo(int x1, int y1, int x2, int y2){
        double resultado = 0;
        resultado = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));

        return resultado;

    }

    private double printar(double resultado){
        System.out.println("A distância dos pontos é de: "+resultado);
        return resultado;
    }
}

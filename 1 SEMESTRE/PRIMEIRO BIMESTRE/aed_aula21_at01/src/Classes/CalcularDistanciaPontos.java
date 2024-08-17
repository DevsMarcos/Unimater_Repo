package Classes;
import java.util.Scanner;
//Essa classe possui um método que realiza o calcula de distância entro dois pontos do plano cartesiano
public class CalcularDistanciaPontos {
    /*Esse método recebe um Scanner de parâmetro, para poder relizar o recebimento dos valores de usuário
     * Recebe os valores de pares ordenados de cada método
     * Possui uma variável de recebe um método quer realiza o calculo
     * e um método que realiza o print do resutlado
     */
        public void calculaDistanciaPontos(Scanner leitor){
        int x1 = ParX1(leitor);//Par ordenado
        int y1 = ParY1(leitor);//Par ordenado
        int x2 = ParX2(leitor);//Par ordenado
        int y2 = ParY2(leitor);//Par ordenado
        double resultadoFinal = calculo(x1, y1, x2, y2);//Calculo
        printar(resultadoFinal);//Print
    }

    /*O método abaixo recebe o valor de Xdo primerio par ordenado, e possui um Scanner 
     * para receber o valor desse par ordenado
     */
    private int ParX1(Scanner leitor){
        int retornoX1= 0;//Valor inicial
        System.out.println("Insira os valores o 1° par ordenado");//Introdução
        System.out.println("Insira o valor de X1: ");//Pergunta
        retornoX1 = leitor.nextInt();//Atribuição do valor de X1, feita pelo user

        return retornoX1;//Retorno do valor do De X1
    }
    /*O método abaixo recebe o valor de Y do primerio par ordenado, e possui um Scanner 
     * para receber o valor desse par ordenado
     */
    private int ParY1(Scanner leitor){
        int retornoY1= 0;//Valor inicial
        System.out.println("Agora insira o valor de Y1: ");//Pergunta
        retornoY1 = leitor.nextInt();//Atribuição do valor de Y1, feita pelo user

        return retornoY1;//Retorno do valor do De Y1
    }
    /*O método abaixo recebe o valor de Xd o segundo par ordenado, e possui um Scanner 
     * para receber o valor desse par ordenado
     */
    private int ParX2(Scanner leitor){
        int retornoX2= 0;//Valor inicial
        System.out.println("Insira os valores o 2° par ordenado");//Introdução
        System.out.println("Insira o valor de X2: ");//Pergunta
        retornoX2 = leitor.nextInt();//Atribuição do valor de X2, feita pelo user

        return retornoX2;//Retorno do valor de X2

    /*O método abaixo recebe o valor de Y do segundo par ordenado, e possui um Scanner 
     * para receber o valor desse par ordenado
     */
    }
    private int ParY2(Scanner leitor){
        int retornoY2= 0;//Valor inicial
        System.out.println("Agora insira o valor de Y2: ");//Pergunta
        retornoY2 = leitor.nextInt();//Atribuição do valor de Y2, feita pelo user

        return retornoY2;//Retorno do valor do De Y2
    }

/*O método abaixo realiza o calculo da distância dos pares ordenados, possui como parâmetro os valores
 * dos pares ordenados 
 */
    private double calculo(int x1, int y1, int x2, int y2){
        double resultado = 0;//Valor inical
        resultado = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2));
        //Acima possui a realização do cácluclo (Math.pow é potenciação)

        return resultado;//Retorno do valor do De resultado

    }

    //O método abaixo realiza o print do resultado, e recebe o resultado como parâmetro
    private double printar(double resultado){
        System.out.println("A distância dos pontos é de: "+resultado);//pritn do resultado
        return resultado;//retorna o valor do resultado
    }
}

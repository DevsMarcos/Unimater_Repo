import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Funcoes funcoes = new Funcoes();

        int opcao = -1;
        while (opcao != 0){
            opcao = executarMenu(scanner);

            switch (opcao){
                case 1 -> funcoes.verificarPalindromo();
                case 2 -> funcoes.combinacoes();
                case 3 -> funcoes.calculoJurosCompostos();
                case 4 -> funcoes.contaPalavras();
                case 5 -> funcoes.verificarPalindromo();
                case 6 -> funcoes.calculaDistanciaPontos();

            }

        }
        scanner.close();
    }

    public static int executarMenu(Scanner scanner){
        out.println("Escolha uma funcao abaixo:\n" +
                "1 - verificar polindromo\n" +
                "2 - ordenar array\n" +
                "3 - calcular jurus composto\n" +
                "4 - contar palavras\n" +
                "5 - combinacoes\n" +
                "6 - calcular distancia entre pontos\n" +
                "0 - sair");

        int retorno = 0;
        try {

            retorno = scanner.nextInt();
        }catch (Exception e){
            out.println("Informe um número inteiro");
        }
        return retorno;
    }

}

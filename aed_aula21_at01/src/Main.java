import java.util.Scanner;

import Classes.CalculadroraDeJuros;
import Classes.CalcularDistanciaPontos;
import Classes.Combinacoes;
import Classes.ContarPalavras;
import Classes.OrdenarArray;
import Classes.VerificarPalindromos;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Scanner leitor = new Scanner(in);

        //Intsanciando os métodos--------------------------------------------
        VerificarPalindromos ehPalindromos = new VerificarPalindromos();
        OrdenarArray ordemArray = new OrdenarArray();
        CalculadroraDeJuros calcularJuros = new CalculadroraDeJuros();
        ContarPalavras contaEspacos = new ContarPalavras();
        Combinacoes executarCombinacoes = new Combinacoes();
        CalcularDistanciaPontos executarCalculoDistancia = new CalcularDistanciaPontos();
        //-------------------------------------------------------------------

        int opcao = -1;
        while (opcao != 0) {
            opcao = executarMenu(scanner);

            switch (opcao) {
                case 1 -> ehPalindromos.FuncaoPalidromos(leitor);
                case 2 -> ordemArray.ordenaArray(leitor);
                case 3 -> calcularJuros.calculoJurosCompostos(leitor);
                case 4 -> contaEspacos.contaPalavras(leitor);
                case 5 -> executarCombinacoes.combinacoes(leitor);
                case 6 -> executarCalculoDistancia.calculaDistanciaPontos(leitor);

            }
        }
        scanner.close();
    }

    public static int executarMenu(Scanner scanner) {
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
        } catch (Exception e) {
            out.println("Informe um número inteiro");
        }
        return retorno;
    }

}
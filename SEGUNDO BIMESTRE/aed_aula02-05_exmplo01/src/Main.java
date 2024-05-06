import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        // Cria scanner que vai ser usado duranante toda a aplicação
        Scanner leitor = new Scanner(in);
        // Instanciação do controlador de alunos
        ControleAlunos controleAlunos = new ControleAlunos();
        // Instanciação do controlador de notas
        ControleNotas controleNotas = new ControleNotas();
        // inicialização da opção para não dar erro quando for validar o while
        // do menu a primeira vez
        int opcaoMenu = -1;

        //Array que vai ser utilizado para armazenar os alunos
        String[] alunos = new String[0];
        //Array bidirecional para armazenar as notas
        //cada posição na primeira coluna do array representa um aluno
        //cada posição na segunda coluna representa uma avaliação
        double[][] notas = new double[0][0]; //// [1][3] = aluno 1: joão e nota 3: 10,00

        // Loop para permancecer no menu
        while (opcaoMenu != 0){
            // chamada da função que exibe o menu
            opcaoMenu = exibeMenu(leitor);
            switch (opcaoMenu){
                case 1:{
                    // chama método que adiciona um aluno e armazena retorno na variável alunos
                    // o retorno vai ser um array com uma posição a mais
                    // se for String[1]
                    // vira String[2]
                    alunos = controleAlunos.adicionarAluno(alunos, leitor);
                    // chama método que adiciona uma posição na primeira coluna do array bi
                    // das notas
                    // então se o array era float[1][1]
                    // virará float[2][1]
                    notas = controleAlunos.adicionaAlunoListaNotas(notas);
                    break;
                }
                case 2:{
                    // chama método que adiciona uma posição na segunda coluna do array bi
                    // das notas
                    // então se o array era float[1][1]
                    // virará float[1][2]
                    notas = controleNotas.adicionarAvaliacao(alunos,notas,leitor);
                    break;
                }
                case 3:{
                    // chama função que lança as notas por aluno
                    // não muda o tamanho do array, mas mudas os valores da posição
                    // selecionada float[posicaoQueRepresentaOAluno][PosicaoQueRepresentaAAvaliacao] = valor nota;
                    controleNotas.lancarNotas(alunos, notas, leitor);
                    break;
                }
                case 4: {
                    // System out println em um for para apresentar
                    // as notas e os alunos
                    imprimirAlunos(alunos, notas);
                }
            }
        }
    }


    private static void imprimirAlunos(String[] alunos, double[][] notas) {
        // percorre o array de alunos
        for (int i = 0; i < alunos.length; i++) {
            out.println(i + " - " + alunos[i]);
            // percorre a segunda coluna do array bi na posição da primeira coluna igual ao array do alunuo
            if(notas.length > i) {
                for (int j = 0; j < notas[i].length; j++) {
                    out.println(notas[i][j] + "; ");
                }
            }
        }
    }

    // Metodo para imprimr o menu, receber a opção selecionada e devolver a opção para o
    // código que chama ela
    private static int exibeMenu(Scanner leitor) {
        int opcaoMenu;
        out.println("Menu: \n" +
                "1 - Adicionar aluno\n" +
                "2 - Adionar nova avaliação\n" +
                "3 - Lancar notas\n" +
                "4 - Imprimir alunos");
        opcaoMenu = leitor.nextInt();
        // feito parar remover o buffer do leitor
        leitor.nextLine();
        // retorna a opção selecionada
        return opcaoMenu;
    }
}

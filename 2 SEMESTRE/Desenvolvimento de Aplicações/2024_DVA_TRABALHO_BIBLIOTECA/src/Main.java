import java.util.Scanner;

import Class.InterecaoComUsuario;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        InterecaoComUsuario novaInteracao = new InterecaoComUsuario(leitor);


        int opcao = 0;

        do {
            novaInteracao.opcoesDeEscolha();
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1 -> {
                    novaInteracao.criarAutorEVincular();
                }
                case 2 -> {
                    novaInteracao.criarNovoLivro();
                }
                case 3 -> {
                    novaInteracao.criarNovoMembro();
                }
                case 4 -> {
                    novaInteracao.printarListaDeMembros();

                }
                case 5 -> {
                    novaInteracao.verificarLivrosDeDeterminadoAutor();
                }
                case 6 -> {
                    novaInteracao.verificarHistoricoPorMembro();
                }
                case 7 ->{
                    novaInteracao.emprestarLivros();
                }
                case 8 ->{
                    novaInteracao.realizarDevolução();
                }
            }
        } while (opcao != 0);
    }
}
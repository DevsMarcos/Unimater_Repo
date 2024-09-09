import Classes.InterecaoComUsuario;
import Construtores.Autor;
import Construtores.Membro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        InterecaoComUsuario novaInteracao = new InterecaoComUsuario(leitor);

        List<Autor> listaDeAutores = new ArrayList<>();
        List<Membro> listaDeMembros = new ArrayList<>();


        int opcao = 0;

        do {
            novaInteracao.opcoesDeEscolha();
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1 -> {
                    listaDeAutores = novaInteracao.criarNovoAutor(listaDeAutores);
                }
                case 2 -> {
                    novaInteracao.criarNovoLivro(listaDeAutores);
                }
                case 3 -> {
                    listaDeMembros = novaInteracao.criarNovoMembro(listaDeMembros);
                }
                case 4 -> {
                    novaInteracao.printarListaDeMembros(listaDeMembros);

                }
                case 5 -> {
                    novaInteracao.verificarLivrosDeDeterminadoAutor(listaDeAutores);
                }
                case 6 -> {
                    novaInteracao.verificarHistoricoPorMembro(listaDeMembros);
                }
                case 7 ->{
                    novaInteracao.emprestarLivros(listaDeAutores, listaDeMembros);
                }
                case 8 ->{
                    novaInteracao.realizarDevolução(listaDeMembros, listaDeAutores);
                }
            }
        } while (opcao != 0);
    }
}
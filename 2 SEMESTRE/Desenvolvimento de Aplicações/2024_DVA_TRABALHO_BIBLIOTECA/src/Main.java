import Classes.InterecaoComUsuario;
import Construtores.Autor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        InterecaoComUsuario novaInteracao = new InterecaoComUsuario(leitor);

        List<Autor> listaDeAutores = new ArrayList<>();


        int opcao = 0;

        do {
            novaInteracao.opcoesDeEscolha();
            opcao = leitor.nextInt();

            switch (opcao){
                case 1 -> {
                    listaDeAutores = novaInteracao.criarNovoAutor(listaDeAutores);
                }
                case 2 ->{
                    novaInteracao.criarNovoLivro(listaDeAutores);
                }
                case 6->{
                    novaInteracao.verificarLivrosDisponiveisPorAutor(listaDeAutores);
                }
            }

        }while (opcao != 0);
    }
}
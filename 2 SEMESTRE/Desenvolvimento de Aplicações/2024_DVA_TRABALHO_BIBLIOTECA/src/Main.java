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

            switch (opcao){
                case 1 -> {
                    listaDeAutores = novaInteracao.criarNovoAutor(listaDeAutores);
                }
                case 2 ->{
                    novaInteracao.criarNovoLivro(listaDeAutores);
                }
                case 6->{
                    novaInteracao.verificarLivrosPorAutorOuTodosOsLivros(listaDeAutores);
                }
                case 7 -> {
                    listaDeMembros = novaInteracao.criarNovoMembro(listaDeMembros);
                    for (Membro membro: listaDeMembros){
                        System.out.println(membro.toString());
                    }
                }
            }
        }while (opcao != 0);
    }
}
package Classes;

import Construtores.Autor;
import Construtores.Livro;
import com.sun.source.doctree.SinceTree;

import java.util.List;
import java.util.Scanner;

public class InterecaoComUsuario {

    private final Scanner leitor;

    public InterecaoComUsuario(Scanner leitor) {
        this.leitor = leitor;
    }

    Serviços adicionarServiços = new Serviços();


    private Autor criarNovoAutor() {
        String nome = "";
        String nacionalidade = "";
        int anoNascimento = 0;

        System.out.println("Informe o nome do autor: ");
        nome = leitor.nextLine();

        System.out.println("Informe a nacionalidade: ");
        nacionalidade = leitor.nextLine();

        System.out.println("Informe o ano de nascimento: ");
        anoNascimento = leitor.nextInt();

        return new Autor(nome, nacionalidade, anoNascimento);
    }

    private Livro criarNovoLivro(){
        String tituloDoLivro = "";
        int anoDeLancameto = 0;
        boolean disponivel = true;

        System.out.println("Informe o Título do Livro: ");
        tituloDoLivro = leitor.nextLine();

        System.out.println("Informe o ano de lançamento do livro: ");
        anoDeLancameto = leitor.nextInt();

        return new Livro(tituloDoLivro, anoDeLancameto, disponivel);
    }

    public List<Autor> adcionarNaListaDeAutores(List<Autor> listaDeAutores) {
        Autor autor = this.criarNovoAutor();
        adicionarServiços.adicionarAutorLista(listaDeAutores, autor);
        System.out.println("Autor adicionado à lista com sucesso!");
        return listaDeAutores;
    };
}

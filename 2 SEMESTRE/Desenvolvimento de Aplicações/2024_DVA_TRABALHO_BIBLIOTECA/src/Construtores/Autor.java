package Construtores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Autor {
    private final String nome;
    private final int anoDenascimento;
    private final String nacionalidade;
    private List<Livro> livros;


    public Autor(String nome, String nacionalidade, int anoDenascimento) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.nacionalidade = nacionalidade;
        this.anoDenascimento = anoDenascimento;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarLivro(Livro livro){

        livros.add(livro);
    }

    public List<Livro> getLivros(){

        return Collections.unmodifiableList(livros);
    }

    @Override
    public String toString() {
        return "Autor: "+this.nome+"\n"+
                "Ano de nascimento do autor: "+this.anoDenascimento+"\n"+
                "Nacionaldiade: "+this.nacionalidade+"\n";
    }
}

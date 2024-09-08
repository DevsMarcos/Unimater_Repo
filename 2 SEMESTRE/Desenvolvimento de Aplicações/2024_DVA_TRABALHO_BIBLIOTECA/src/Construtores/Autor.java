package Construtores;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private int anoDenascimento;
    private String nacionalidade;
    private List<Livro> livros;

    public Autor() {

    }

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
        return livros;
    }

    @Override
    public String toString() {
        return "Autor: "+this.nome+"\n"+
                "Ano de nascimento do autor: "+this.anoDenascimento+"\n"+
                "Nacionaldiade: "+this.nacionalidade+"\n";
    }
}

package Class.Constructor;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Class.Livro;

public class Membro {
    private String nome;
    private int idMembro;
    private List<Livro> historicoDeLivros;

    public Membro(String nome, int idMembro) {
        this.nome = nome;
        this.idMembro = idMembro;
        this.historicoDeLivros = new ArrayList<>();
    }

    public List<Livro> historicoDeLivros(){
        return Collections.unmodifiableList(historicoDeLivros);
    }


    public String getNome() {
        return nome;
    }

    public int getIdMembro() {
        return idMembro;
    }

    public void adicionarLivro(Livro livro){
        historicoDeLivros.add(livro);
    }

    @Override
    public String toString() {
        return "\n" +
                "nome: "+nome+ "\n"+
                "Id do Membro"+ idMembro +"\n";
    }
}

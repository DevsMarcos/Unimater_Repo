package Construtores;

import java.util.ArrayList;
import java.util.List;

public class Membro {
    private String nome;
    private int idMembro;
    private List<Livro> historicoDeLivros;

    public Membro(String nome, int idMembro) {
        this.nome = nome;
        this.idMembro = idMembro;
        this.historicoDeLivros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdMembro() {
        return idMembro;
    }

    @Override
    public String toString() {
        return "\n" +
                "nome: "+nome+ "\n"+
                "Id do Membro"+ idMembro +"\n";
    }
}

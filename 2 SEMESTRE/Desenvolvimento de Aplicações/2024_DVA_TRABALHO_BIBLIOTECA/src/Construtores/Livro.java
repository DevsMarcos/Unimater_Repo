package Construtores;

public class Livro {
    private String titulo;
    private int dataDeLancamento;
    private boolean disponivel;
    private String nomeAutor;

    public Livro(String nomeAutor, String titulo, int dataDeLancamento, boolean disponivel) {
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.dataDeLancamento = dataDeLancamento;
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return
                "Titulo: "+titulo+ "\n" +
                "Data de Lançamento: " + dataDeLancamento + "\n"+
                "Autor: "+ nomeAutor + "\n"+
                "Disponível: " + disponivel + "\n";

    }
}

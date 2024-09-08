package Construtores;

public class Livro {
    private String titulo;
    private int dataDeLancamento;
    private boolean disponivel;
    private String nomeAutor;
    private int isbn;

    public Livro(String nomeAutor, String titulo, int dataDeLancamento, boolean disponivel, int isbn) {
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.dataDeLancamento = dataDeLancamento;
        this.disponivel = disponivel;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return
                "Titulo: "+titulo+ "\n" +
                "Data de Lançamento: " + dataDeLancamento + "\n"+
                "Autor: "+ nomeAutor + "\n"+
                "Disponível: " + disponivel + "\n"+
                "ISBN: "+isbn +"\n";

    }
}

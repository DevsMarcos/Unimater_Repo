package Construtores;

public class Livro {
    private final String titulo;
    private final int dataDeLancamento;
    private String disponivel;
    private final String nomeAutor;
    private final int isbn;

    public Livro(String nomeAutor, String titulo, int dataDeLancamento, String disponivel, int isbn) {
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.dataDeLancamento = dataDeLancamento;
        this.disponivel = disponivel;
        this.isbn = isbn;
    }

    public int getDataDeLancamento() {
        return dataDeLancamento;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getTitulo() {

        return titulo;
    }

    public int getIsbn() {

        return isbn;
    }

    public String verificarDisponibilidade() {

        return disponivel;
    }

    public String emprestarLivro() {
        if (disponivel.equals("Indisponível")) {
            System.out.println("O livro já foi emprestado!");
            return disponivel;
        } else {

            return disponivel = "Indisponível";
        }
    }

    public String devolverLivro() {
        if (disponivel.equals("Disponível")) {
            System.out.println("O livro está disponível");
            return disponivel;
        } else {
            return disponivel = "Disponível";
        }
    }


    @Override
    public String toString() {
        return"\n"+
                        "Titulo: " + titulo + "\n" +
                        "Data de Lançamento: " + dataDeLancamento + "\n" +
                        "Autor: " + nomeAutor + "\n" +
                        "Status de Empréstimo: " + disponivel + "\n" +
                        "ISBN: " + getIsbn() + "\n";

    }
}

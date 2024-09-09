package Construtores;

public class Livro {
    private String titulo;
    private int dataDeLancamento;
    private String disponivel;
    private String nomeAutor;
    private int isbn;

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

    public String emprestarLivro(){
        return disponivel = "Indisponível";
    }

    public String devolverLivro(){

        return disponivel = "Dispobível";
    }



    @Override
    public String toString() {
        return
                "Titulo: "+titulo+ "\n" +
                "Data de Lançamento: " + dataDeLancamento + "\n"+
                "Autor: "+ nomeAutor + "\n"+
                "Status de Empréstimo: " + disponivel + "\n"+
                "ISBN: "+getIsbn() +"\n";

    }
}

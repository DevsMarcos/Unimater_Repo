package Construtores;

public class Livro {
    private String titulo;
    private int dataDeLancamento;
    private boolean disponivel;
    private Autor autor;

    public Livro(String titulo, int dataDeLancamento, boolean disponivel) {
        this.titulo = titulo;
        this.dataDeLancamento = dataDeLancamento;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(int dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }
}

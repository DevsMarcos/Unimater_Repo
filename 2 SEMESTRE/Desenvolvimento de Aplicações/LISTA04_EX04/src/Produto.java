public class Produto {
    private String nome;
    private double valor;
    private Categoria categoria;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = null;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

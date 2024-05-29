package Classes;

public class Produto {
    public String nome;
    public double preco;
    public int desconto;

    public Produto(String nome, double preco, int desconto){
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(){
        this.preco *= 0.9;
    }
}

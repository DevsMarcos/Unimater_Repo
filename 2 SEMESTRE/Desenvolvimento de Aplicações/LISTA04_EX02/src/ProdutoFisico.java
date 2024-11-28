public class ProdutoFisico extends Produto{
    private double desconto;

    public ProdutoFisico(String nome, double valor, String descricao, double desconto) {
        super(nome, valor, descricao);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }



    @Override
    double calcularPrecoFinal() {
        double valorFInal = getValor() - (getValor()*(getDesconto()/100));
        System.out.println("O valor total de compra do seu produto físico é de R$ "+valorFInal);
        return valorFInal;
    }
}

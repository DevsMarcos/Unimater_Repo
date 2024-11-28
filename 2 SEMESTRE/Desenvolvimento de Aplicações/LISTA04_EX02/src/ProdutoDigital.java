public class ProdutoDigital extends Produto{
    private double frete;
    private double desconto;
    public ProdutoDigital(String nome, double valor, String descricao, double frete, double desconto) {
        super(nome, valor, descricao);
        this.frete = frete;
        this.desconto = desconto;
    }

    public double getFrete() {
        return frete;
    }

    public double getDesconto() {
        return desconto;
    }

    @Override
    double calcularPrecoFinal() {
        double valorFinal =  ((getValor() - (getValor() * (getDesconto()/100))) + getFrete());
        System.out.println("O valor total de compra do seu produto digital é de R$ "+valorFinal);
        return valorFinal;

    }
}

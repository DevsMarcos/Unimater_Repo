public class ProdutoImportado extends Produto implements Tributavel{
    private final double imposto = 20;
    public ProdutoImportado(String nome, double valor) {
        super(nome, valor);
    }

    public void valorFInal(){
        double valorFinal = getValor()+calcularImposto();
        System.out.println(String.format("""
                Valor do produto: %s
                Valor do produto com imposto aplicado: %s
                """, getValor(), valorFinal));
    }

    @Override
    public double calcularImposto() {
        return getValor()*(imposto/100);

    }
}

public class ProdutoImportado extends Produto implements Tributacao{
    private final int impostoImportacao = 35;
    public ProdutoImportado(String nomeItem, double valotItem) {
        super(nomeItem, valotItem);
    }

    public double valorFInal(double valorItem){
        double valorFinal = getValotItem()+calculatImposto();
        return valorFinal;
    }

    @Override
    public double calculatImposto() {
        return getValotItem() * (getValotItem()/(impostoImportacao*100));
    }
}

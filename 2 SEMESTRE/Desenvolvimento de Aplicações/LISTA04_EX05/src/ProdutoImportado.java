public class ProdutoImportado extends Produto implements Tributacao{
    private final double impostoImportacao = 0.35;
    public ProdutoImportado(String nomeItem, double valotItem) {
        super(nomeItem, valotItem);
    }



    @Override
    public double calculatImposto() {
        return getValotItem() * (1 + impostoImportacao);
    }


}

public class Produto {
    private String nomeItem;
    private double valotItem;

    public Produto(String nomeItem, double valotItem) {
        this.nomeItem = nomeItem;
        this.valotItem = valotItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public double getValotItem() {
        return valotItem;
    }

    public void setValotItem(double valotItem) {
        this.valotItem = valotItem;
    }
}

package classes;

public class PrefixPrice {
    public double[] prefixarPosicaoPreco(double[] arrayParaPreco) {
        double[] arrayDePreco = new double[arrayParaPreco.length + 1];

        for (int i = 0; i < arrayParaPreco.length; i++) {
            arrayDePreco[i] = arrayParaPreco[i];
        }
        return arrayDePreco;
    };
}

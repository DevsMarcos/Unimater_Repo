package classes;

public class PrintProducts {
    public void printarItens(String[] itens, double[] precos) {
        System.out.println("Produtos disponíveis: ");
        for (int i = 1; i < itens.length; i++) {
            System.out.println(i+ " - "+ itens[i] + ": R$ " + precos[i]);
        }
    }
}

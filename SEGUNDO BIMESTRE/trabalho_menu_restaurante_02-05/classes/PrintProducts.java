package classes;

public class PrintProducts {
    public void printarItens(String[] itens, double[] precos){
        System.out.println("Produtos disponíveis: ");
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i]+ ": R$ "+precos[i]);
        }
    }
}

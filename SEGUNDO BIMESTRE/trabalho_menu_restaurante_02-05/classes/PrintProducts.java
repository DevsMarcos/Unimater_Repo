package classes;

public class PrintProducts {
    //Essa função tem por objetivo mostrar os itens existente atualmente. 
    //Ela recebe como parâmetros um array de intes e o array de valores
    public void printarItens(String[] itens, double[] precos) {
        System.out.println("Produtos disponíveis: ");
        //Utilizamos do for para percorrer o array de itens, e printamos em cada posição 
        //O item e o preço da posição atual.
        for (int i = 1; i < itens.length; i++) {
            System.out.println(i+ " - "+ itens[i] + ": R$ " + precos[i]);//Print formatado 
        }
    }
}

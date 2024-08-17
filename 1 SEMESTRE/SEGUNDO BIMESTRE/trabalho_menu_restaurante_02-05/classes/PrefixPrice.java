package classes;

public class PrefixPrice {
    //Essa função realiza a fixação de um poisção para cada item do menu, ou seja, realiza a ordenação dos itens.
    public double[] prefixarPosicaoPreco(double[] arrayParaPreco) { // Recebe como parâmetro um array de doubles, referente ao preços
        double[] arrayDePreco = new double[arrayParaPreco.length + 1];
        //Aqui criamos um novo array, do tamanho do array recebido no parâmetro, mais uma posição

        //Percorremos o array de parâmetro, e salvamos no novo array as informações presentes em casa posição
        for (int i = 0; i < arrayParaPreco.length; i++) {
            arrayDePreco[i] = arrayParaPreco[i];
        }
        return arrayDePreco;//Retornamos o array, que será salvo na chamda da funçáo;
    };
}

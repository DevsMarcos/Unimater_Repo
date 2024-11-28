public class Main {
    public static void main(String[] args) {
        Categoria eletronicos = new Categoria("DIspositivos Eletronicos", "celulares, tablets e notebooks");
        Produto celular = new Produto("Samsung A23", 1500);

        eletronicos.adicionarProduto(celular);

        eletronicos.printarProduto();

        System.out.println();
    }
}

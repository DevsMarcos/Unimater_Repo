package dva;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    static  List<Produto> estoqueAtual (){
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("123", "Sapato", 4));
        produtos.add(new Produto("234", "Chinelos", 3));
        produtos.add(new Produto("456", "Bota", 2));
        produtos.add(new Produto("567", "Tenis", 1));
        produtos.add(new Produto("678", "Meia", 0));
        return produtos;
    }
}

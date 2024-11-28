import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nome;
    private String desctricao;

    private List <Produto> produtos;

    public Categoria(String nome, String desctricao) {
        this.nome = nome;
        this.desctricao = desctricao;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDesctricao() {
        return desctricao;
    }

   public void adicionarProduto(Produto produto) {
       if (produto != null && !produtos.contains(produto)) {
           produtos.add(produto);
           produto.setCategoria(this); // Define a categoria do produto (Composição)
       }
   }

    public void removerPorduto(Produto produto) {
        if (produto != null && !produtos.contains(produto)) {
            produtos.remove(produto);
            produto.setCategoria(null); // Define a categoria do produto (Composição)
        }
    }

    public void printarProduto(){
        for (Produto produto : produtos){
            System.out.println("-> "+produto.getNome());
        }
    }
}

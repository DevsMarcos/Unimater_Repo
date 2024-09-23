package Class;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Atributos da Classe Membro
public class Membro {
    private String nome;
    private int idMembro;
    private List<Livro> historicoDeLivros;

    //Construtor da Classe membro, recebe como parâmetros os atributos nome e idMembro. A mesma realiza a criação
    //De uma nova lista referente ao histórico de livros do membro instanciado. 
    public Membro(String nome, int idMembro) {
        this.nome = nome;
        this.idMembro = idMembro;
        this.historicoDeLivros = new ArrayList<>();
    }

    //Método que retorna a lista de livros, no caso, o histórico de livros emprestados pelo membro.
    public List<Livro> historicoDeLivros() {
        return Collections.unmodifiableList(historicoDeLivros);
    }

    //Método que retorna o nome do membro
    public String getNome() {
        return nome;
    }

    //Método que retorna o Id do membro;
    public int getIdMembro() {
        return idMembro;
    }

    //Método que realiza a adição de novos livros ao histórico do memobr. Possui o nível de acesso definido
    //como Private-Package. 
    void adicionarLivro(Livro livro) {
        historicoDeLivros.add(livro);
    }

    @Override
    public String toString() {
        return "\n" +
                "nome: " + nome + "\n" +
                "Id do Membro" + idMembro + "\n";
    }
}

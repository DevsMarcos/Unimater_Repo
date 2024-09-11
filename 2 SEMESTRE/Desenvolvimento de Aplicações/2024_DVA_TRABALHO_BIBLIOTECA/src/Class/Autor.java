package Class;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Parâmetros da Classe
public class Autor {
    private final String nome;
    private final int anoDenascimento;
    private final String nacionalidade;
    private List<Livro> livros;

    //Construtor da Classe Autor. inicia uma nova Lista para cada autor instânciado
    public Autor(String nome, String nacionalidade, int anoDenascimento) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.nacionalidade = nacionalidade;
        this.anoDenascimento = anoDenascimento;
    }
    
//Função para retornar o nome do Autor 
    public String getNome() {
        return nome;
    }

    //Função com nível de acesso Package-Private. Sendo assim é possível visualizar a mesma
    //Apenas dentro do pacote onde está. Tem por objetivo adicionar um livro à lista de livros do Autor
    void adicionarLivro(Livro livro){

        livros.add(livro);
    }

    //Função que retorna os livros de um autor. É protegida pelo métodou nmodifiableList.
    //Serve apenas para visualização
    public List<Livro> getLivros(){

        return Collections.unmodifiableList(livros);
    }
    //Métodos toString(), retorna uma representação em forma de String(tetxo), do objeto.
    //Aqui refereênciamos os atributos da classe para obeter os valores.
    @Override
    public String toString() {
        return "Autor: "+this.nome+"\n"+
                "Ano de nascimento do autor: "+this.anoDenascimento+"\n"+
                "Nacionaldiade: "+this.nacionalidade+"\n";
    }
}

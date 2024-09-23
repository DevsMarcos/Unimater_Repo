package Class;

//Atributos da Classe Livro
public class Livro {
    private final String titulo;
    private final int dataDeLancamento;
    private boolean disponivel;
    private final String nomeAutor;
    private final int isbn;


    //Cosntrutor da Classe Livro, que possui os atributos necessários para a criação como parâmetro
    public Livro(String nomeAutor, String titulo, int dataDeLancamento, boolean disponivel, int isbn) {
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.dataDeLancamento = dataDeLancamento;
        this.disponivel = disponivel;
        this.isbn = isbn;
    }

    //Função que retorna o ano de lançamento do livro
    public int getDataDeLancamento() {
        return dataDeLancamento;
    }

    //Função que retorna o nome do autor
    public String getNomeAutor() {
        return nomeAutor;
    }

    //Função que retornar o título do livro
    public String getTitulo() {

        return titulo;
    }

    //FUnção que retorna o ISBN do livro
    public int getIsbn() {

        return isbn;
    }

    //Função que verifica a disponibilidade de empréstimo do livro
    public boolean verificarDisponibilidade() {

        return disponivel;
    }

    //Função que realiza o empréstimo do livro. Caso o livro já esteja "emprestado", ele retorna uma mensagem e para a execução da memsma.
    //Caso esteja disponível, realiza o empréstimo e muda o valor desse atributo para o condizente à emprestado
    public boolean emprestarLivro() {
        if (!disponivel) {
            System.out.println("O livro já foi emprestado!");
            return disponivel;
        } else {
            System.out.println("Empréstimo realizado!");
            return true;
        }
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    //Função que realiza o empréstimo do livro. Caso o livro já esteja "emprestado", ele retorna uma mensagem e para a execução da memsma.
    //Caso esteja disponível, realiza o empréstimo e muda o valor desse atributo para o condizente à emprestado
    public boolean devolverLivro() {
        if (!disponivel) {
            System.out.println("O livro não pode ser devolvido pois já se encontra disponível!");
            return disponivel;
        } else {
            System.out.printf("Devolução realizada!");
            return false;
        }
    }

    //Métodos toString(), retorna uma representação em forma de String(tetxo), do objeto.
    //Aqui refereênciamos os atributos da classe para obeter os valores.
    @Override
    public String toString() {
        return "\n" +
                "Titulo: " + titulo + "\n" +
                "Data de Lançamento: " + dataDeLancamento + "\n" +
                "Autor: " + nomeAutor + "\n" +
                "Livro emprestado: " + disponivel + "\n" +
                "ISBN: " + getIsbn() + "\n";

    }
}

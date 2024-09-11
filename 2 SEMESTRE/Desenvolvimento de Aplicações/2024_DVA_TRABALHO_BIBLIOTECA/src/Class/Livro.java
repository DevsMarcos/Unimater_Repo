package Class;

//Atributos da Classe Livro
public class Livro {
    private final String titulo;
    private final int dataDeLancamento;
    private String disponivel;
    private final String nomeAutor;
    private final int isbn;

    //Cosntrutor da Classe Livro, que possui os atributos necessários para a criação como parâmetro
    public Livro(String nomeAutor, String titulo, int dataDeLancamento, String disponivel, int isbn) {
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
    public String verificarDisponibilidade() {

        return disponivel;
    }

    //Função que realiza o empréstimo do livro. Caso o livro já esteja "emprestado", ele retorna uma mensagem e para a execução da memsma.
    //Caso esteja disponível, realiza o empréstimo e muda o valor desse atributo para o condizente à emprestado
    public String emprestarLivro() {
        if (disponivel.equals("Indisponível")) {
            System.out.println("O livro já foi emprestado!");
            return disponivel;
        } else {

            return disponivel = "Indisponível";
        }
    }
    
     //Função que realiza o empréstimo do livro. Caso o livro já esteja "emprestado", ele retorna uma mensagem e para a execução da memsma.
    //Caso esteja disponível, realiza o empréstimo e muda o valor desse atributo para o condizente à emprestado
    public String devolverLivro() {
        if (disponivel.equals("Disponível")) {
            System.out.println("O livro está disponível");
            return disponivel;
        } else {
            return disponivel = "Disponível";
        }
    }

    x
    @Override
    public String toString() {
        return"\n"+
                        "Titulo: " + titulo + "\n" +
                        "Data de Lançamento: " + dataDeLancamento + "\n" +
                        "Autor: " + nomeAutor + "\n" +
                        "Status de Empréstimo: " + disponivel + "\n" +
                        "ISBN: " + getIsbn() + "\n";

    }
}

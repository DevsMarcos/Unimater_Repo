package Class;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Serviços {

    //Essa função retorna a lista mostra os livros de uma lista de livros, percorrendo por ela e printando cada livro;
    public void printarListaDeLivros(List<Livro> listaDeLivros){
        for (int i = 0; i < listaDeLivros.size(); i++) {
            Livro livro = listaDeLivros.get(i);
            System.out.println(livro.toString() + "\n"); //
        }
    }

    //Essa função apresenta o histórico de livros por membro. ela retorna um Booleno, onde em detarminada situação, caso ela seja falsa
    //Será necessário parar o código.
    public boolean apresentarHistoricoDeLivrosPorMembro(List<Membro> listaDeMembros, Scanner leitor, String texto){

        //Inicialmente verificamos se a lista de membro não está vazia , caso esteja, retornamos um aviso, tornamos false e paramos a função.
        int membroEscolhido = 0;
        if (listaDeMembros.isEmpty()) {
            System.out.println("Não há membro cadastrados no momento!\n");
            return false;
        }else{
            //Caso contrário, solicitamos ao usuário escolher um dos membros
        System.out.println("Escolha um dos membros que você deseja verificar o histórico: \n");
        this.mostrarListaDeMembros(listaDeMembros);
        membroEscolhido = leitor.nextInt();

        //O sistema irá buscar o membro informado através do seu ID, utilizando um método da prórpria Classe.
        Membro membro = buscarMembroPorID(membroEscolhido, listaDeMembros);

        //Se não for encontrado o membro, ou seja, for igual a null, realizamos o processo de aviso e retorno para false.
        if (membro == null){
            System.out.println("Membro não encontrado");
            return false;
        }
        //Se o membro for encontrado, iremos buscar a lista de livros do mesmo
        List<Livro> historicoDeLivros = membro.historicoDeLivros();

        //Se a lista de livros estiver vazia, printamos um aviso e retornamos false.
        if (historicoDeLivros.isEmpty()) {
            System.out.println(texto);
            return false;
        }
        //S houver uma lista válida, ele printa os livros
        System.out.println("Segue abaixo o histórico de libros o membro: " + membro.getNome() + "\n");
        for (Livro livro : historicoDeLivros) {
            System.out.printf("""
                    Nome do Livro: %s
                    Data de lançamento: %d
                    Autor: %s
                    ISBN: %d
                    """, livro.getTitulo(), livro.getDataDeLancamento(), livro.getNomeAutor(), livro.getIsbn());
        }
    }
    return true;
    }


    //O método abaixo printa as listas de membros, caso a lista não seja vazia;
    public void mostrarListaDeMembros(List<Membro> listaDeMembros){
        if (listaDeMembros.size() == 0) {
            System.out.println("Não há membro cadastrados no momento!\n");
            return;
        }
        for (int i = 0; i < listaDeMembros.size(); i++) {
            System.out.println(listaDeMembros.get(i).toString());

        }
    }

    //Pritna os autores
    public void apresentarAutores(List<Autor> listaDeAutores){
        for (int i = 0; i < listaDeAutores.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeAutores.get(i).getNome());
        }
    }

    //Adiciona um autor a lsita
    public List<Autor> adicionarAutorLista(List<Autor> autores, Autor autor){
        autores.add(autor);
        return autores;
    }


    public Livro buscarLivroPorCodigo(int codigo, List<Autor> listaDeAutores) {
        for (Autor autor : listaDeAutores) {
            for (Livro livro : autor.getLivros()) {
                if (livro.getIsbn() == codigo) {
                    return livro;
                }
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }
    public Membro buscarMembroPorID(int codigo, List<Membro> listaDeMembros) {
        for (Membro membro : listaDeMembros) {
                if (membro.getIdMembro() == codigo) {
                    return membro;
                }
            }
        return null; // Retorna null se o livro não for encontrado
    };

    public int geradorDeCodigosEId(){
        int numeroGerado = 0;
        Random gerador = new Random();

        numeroGerado = gerador.nextInt(100000);
        return numeroGerado;

    }

    public void quebraDeLinha(){
        System.out.println("\n");
    }


}

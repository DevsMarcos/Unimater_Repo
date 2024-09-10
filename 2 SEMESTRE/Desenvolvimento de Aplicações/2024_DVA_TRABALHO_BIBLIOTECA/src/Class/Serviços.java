package Class;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Class.Constructor.Membro;

public class Serviços {
    final String SUCESS_ADD_AUTOR = "Autor adicionado com sucesso!";
    final String SUCESS_ADD_BOOK_AUTOR = "Livro vinculado ao autor com sucesso!";

    public void printarListaDeLivros(List<Livro> listaDeLivros){
        for (int i = 0; i < listaDeLivros.size(); i++) {
            Livro livro = listaDeLivros.get(i);
            System.out.println((i + 1) + ". " + livro.toString() + "\n"); // Supondo que você tenha um método getTitulo() na classe Livro
        }
    }

    public void apresentarHistoricoDeLivrosPorMembro(List<Membro> listaDeMembros, Scanner leitor){
        int membroEscolhido = 0;
        if (listaDeMembros.size() == 0) {
            System.out.println("Não há membro cadastrados no momento!");
            return;
        }else{
        System.out.println("Escolha um dos membros que você deseja verificar o histórico: \n");
        this.mostrarListaDeMembros(listaDeMembros);
        membroEscolhido = leitor.nextInt();
        Membro membro = listaDeMembros.get(membroEscolhido - 1);
        List<Livro> historicoDeLivros = membro.historicoDeLivros();

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

    }

    public void mostrarListaDeMembros(List<Membro> listaDeMembros){
        if (listaDeMembros.size() == 0) {
            System.out.println("Não há membro cadastrados no momento!");
            return;
        }
        for (int i = 0; i < listaDeMembros.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeMembros.get(i).toString());

        }
    }

    public void apresentarAutores(List<Autor> listaDeAutores){
        for (int i = 0; i < listaDeAutores.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeAutores.get(i).getNome());
        }
    }


    public List<Autor> adicionarAutorLista(List<Autor> autores, Autor autor){
        autores.add(autor);
        System.out.println(SUCESS_ADD_AUTOR);
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

    public void validacaoDeTexto(String mensagem, String var, Scanner leitor, String mensagemAviso){
        while (true) {
            System.out.println(mensagem);
            var = leitor.nextLine();
            if (!var.trim().equals(" ")) {
                break;
            }
            System.out.println(mensagemAviso);
        }
    }

        public void validacaoDeNumero(String mensagemEntrada,String mensagem, 
        String mensagemErro, int numeroAvaliado, Scanner leitor ){
            while (true) {
                System.out.println(mensagemEntrada);
                if (leitor.hasNextInt()) {
                    numeroAvaliado = leitor.nextInt();
                    break;
                }           
                System.out.println(mensagemErro);
            }
    }




}

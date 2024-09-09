package Classes;

import Construtores.Autor;
import Construtores.Livro;
import Construtores.Membro;

import java.util.List;

public class Serviços {
    final String SUCESS_ADD_AUTOR = "Autor adicionado com sucesso!";
    final String SUCESS_ADD_BOOK_AUTOR = "Livro vinculado ao autor com sucesso!";



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




}

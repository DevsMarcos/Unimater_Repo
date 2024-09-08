package Classes;

import Construtores.Autor;
import Construtores.Livro;

import java.util.List;

public class Serviços {
    final String SUCESS_ADD_AUTOR = "Autor adicionado com sucesso!";
    final String SUCESS_ADD_BOOK_AUTOR = "Livro vinculado ao autor com sucesso!";



    public List<Autor> adicionarAutorLista(List<Autor> autores, Autor autor){
        autores.add(autor);
        System.out.println(SUCESS_ADD_AUTOR);
        return autores;
    }

    public List<Autor> vincularLivroAoAutor(List<Autor> autores, Autor autor, Livro livro){
        autor.adicionarLivro(livro);
        autores.add(autor);
        System.out.println(SUCESS_ADD_BOOK_AUTOR);
        return autores;
    }


}

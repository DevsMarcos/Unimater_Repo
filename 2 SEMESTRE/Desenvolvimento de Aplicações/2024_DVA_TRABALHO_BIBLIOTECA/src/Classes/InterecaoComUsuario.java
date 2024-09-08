package Classes;

import Construtores.Autor;
import Construtores.Livro;

import java.util.List;
import java.util.Scanner;

public class InterecaoComUsuario {

    private final Scanner leitor;
    private final String OPCOES = """
            
            1. Criar Autor (Adiciona novo autor ao catálogo da biblioteca
            2. Criar Livro (Vincula livro lançamento ao autor)
            3. Realizar Emprestimo
            4. Realizar Devolução
            5. Verificar Livros pedentes de devolução
            6. Verificar Livros disponíveis para empréstimo
            0. Sair
            
            """;

    public InterecaoComUsuario(Scanner leitor) {
        this.leitor = leitor;
    }

    Serviços adicionarServiços = new Serviços();

    public void opcoesDeEscolha() {
        System.out.println(OPCOES);
    }


    private Autor criarNovoAutor() {
        String nome = "";
        String nacionalidade = "";
        int anoNascimento = 0;
        leitor.nextLine();

        System.out.println("Informe o nome do autor: ");
        nome = leitor.nextLine();

        System.out.println("Informe a nacionalidade: ");
        nacionalidade = leitor.nextLine();

        System.out.println("Informe o ano de nascimento: ");
        anoNascimento = leitor.nextInt();

        return new Autor(nome, nacionalidade, anoNascimento);
    }

    public List<Autor> criarNovoAutor(List<Autor> listaDeAutores) {
        Autor autor = this.criarNovoAutor();
        adicionarServiços.adicionarAutorLista(listaDeAutores, autor);
        System.out.println("Autor adicionado à lista com sucesso!");
        return listaDeAutores;
    }

    public void criarNovoLivro(List<Autor> listaDeAutores) {
        String tituloDoLivro = "";
        int autorEscolhido = 0;
        String nomeDoAutor = "";
        int anoDeLancameto = 0;
        boolean disponivel = true;

        if (listaDeAutores.isEmpty()) {
            System.out.println("Não há autores disponíveis na biblioteca no momento. Crie um novo autor para continuar.");
        } else {
            System.out.println("Autores disponíveis: ");

            for (int i = 0; i < listaDeAutores.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeAutores.get(i).getNome());
            }
        }

        System.out.println("Digite o autor ao qual você deseja adicionar ao livro");
        autorEscolhido = leitor.nextInt();
        Autor autorSelecionado = listaDeAutores.get(autorEscolhido - 1);
        nomeDoAutor = autorSelecionado.getNome();
        leitor.nextLine();

        System.out.println("Informe o Título do Livro: ");
        tituloDoLivro = leitor.nextLine();

        System.out.println("Informe o ano de lançamento do livro: ");
        anoDeLancameto = leitor.nextInt();


         Livro livro = new Livro(nomeDoAutor, tituloDoLivro, anoDeLancameto, disponivel);
         autorSelecionado.adicionarLivro(livro);

        System.out.println("Livro criado e adicionado com sucesso!");
    };



    public void verificarLivrosDisponiveisPorAutor(List<Autor> listaDeAutores){
        for (int i = 0; i < listaDeAutores.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeAutores.get(i).getNome());
        }
        System.out.println("Digite o autor ao qual você deseja visuliazar os livros lançados: ");

        int escolha = leitor.nextInt();

        if (escolha < 1 || escolha > listaDeAutores.size()) {
            System.out.println("Opção informada inválida tente novamente!");
        } else {
            Autor autorSelecioando = listaDeAutores.get(escolha -1);
            System.out.println("Segue abaixo os livros do autor: "+autorSelecioando.getNome());
            for (Livro livro: autorSelecioando.getLivros()){
                System.out.println(livro.toString());
            }
        }

    }
}

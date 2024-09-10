package Classes;

import Construtores.*;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InterecaoComUsuario {

    private final Serviços adicionarServiços = new Serviços();
    private final Scanner leitor;
    private final String CADASTRO_DE_MEMBROS = """
            Vamos cadastrar um novo membro, informe uma das opções abaixo:
            1. Estudante
            2. Professor
                """;

    private final String OPCOES = """
                        
            1. Criar Autor (Adiciona novo autor ao catálogo da biblioteca)
            2. Criar Livro (Vincula livro lançamento ao autor)
            3. Adicionar novo membro à biblioteca
            4. Verificar lista de membros
            5. Veriricar livros por autor
            6. Verificar histórico membros
            7. Realizar Emprestimo (Realiza empréstimos de Livros)
            8. Realizar Devolução (Realiza a devolução de Livros)
            0. Sair
                        
            """;

    public InterecaoComUsuario(Scanner leitor) {
        this.leitor = leitor;
    }


    public void opcoesDeEscolha() {
        System.out.println(OPCOES);
    }


    private Autor criarNovoAutor() {
        String nome = "";
        String nacionalidade = "";
        int anoNascimento = 0;
        leitor.nextLine();
        System.out.println("\n");

        adicionarServiços.validacaoDeTexto("Informe o nome do autor: ",nome, leitor, "O autor é obrigatório!" );
            adicionarServiços.quebraDeLinha();
        while (true) {
            System.out.println("Informe a nacionalidade: ");
            nacionalidade = leitor.nextLine();
            if (!nacionalidade.trim().isEmpty()) {
                break;
            }
            System.out.println("A nacionalidade não pode ser vazia! ");
        }
        adicionarServiços.quebraDeLinha();
        
        while (true) {
            System.out.println("Informe o ano de nascimento: ");
            if (leitor.hasNextInt()) {
                anoNascimento = leitor.nextInt();
                break;
            }           
            System.out.println("O ano de nascimento não pode ser igual a 0!");
        }
        
        
        return new Autor(nome, nacionalidade, anoNascimento);
    }

    //FUnção que realiza a criação de um novo autor.
    public List<Autor> criarNovoAutor(List<Autor> listaDeAutores) {
        Autor autor = this.criarNovoAutor();
        adicionarServiços.adicionarAutorLista(listaDeAutores, autor);
        System.out.println("Autor adicionado à lista com sucesso!");
        return listaDeAutores;
    }

    //Função que realiza a criação de um livro e vincula o mesmo au autor correspodente
    public void criarNovoLivro(List<Autor> listaDeAutores) {

        String tituloDoLivro = "";
        int autorEscolhido = 0;
        String nomeDoAutor = "";
        int anoDeLancameto = 0;
        int isbn = 0;
        String disponivel = "Disponível";

        if (listaDeAutores.isEmpty()) {
            System.out.println("Não há autores disponíveis na biblioteca no momento. Crie um novo autor para continuar.");
            return;
        } else {
            System.out.println("Autores disponíveis: ");

            adicionarServiços.apresentarAutores(listaDeAutores);
        }

        System.out.println("Digite o autor ao qual você deseja adicionar ao livro");
        autorEscolhido = leitor.nextInt();
        Autor autorSelecionado = listaDeAutores.get(autorEscolhido - 1);
        nomeDoAutor = autorSelecionado.getNome();
        leitor.nextLine();

        while (true) {
            System.out.println("Informe o Título do Livro: ");
            tituloDoLivro = leitor.nextLine();
            if (!tituloDoLivro.equals("")) {
                break;
            }
            System.out.println("O título do Livro é obrigatório!");
        }

        adicionarServiços.quebraDeLinha();

        while (true) {
            System.out.println("Informe o ano de lançamento do livro: ");
            if (leitor.hasNextInt()) {
                anoDeLancameto = leitor.nextInt();
                break;
            }
            System.out.println("A data de lançamento do Livro é obrigatória!");
        }
        
        isbn = adicionarServiços.geradorDeCodigosEId();


        Livro livro = new Livro(nomeDoAutor, tituloDoLivro, anoDeLancameto, disponivel, isbn);
        autorSelecionado.adicionarLivro(livro);

        System.out.println("Livro criado e adicionado com sucesso!");
    };


    //FUnção que permite verficar os livros de determinado autor
    public void verificarLivrosDeDeterminadoAutor(List<Autor> listaDeAutores) {
        adicionarServiços.apresentarAutores(listaDeAutores);
        System.out.println("Digite o autor ao qual você deseja visuliazar os livros lançados: ");

        int escolha = leitor.nextInt();

        if (escolha < 1 || escolha > listaDeAutores.size()) {
            System.out.println("Opção informada inválida tente novamente!");
        } else {
            Autor autorSelecioando = listaDeAutores.get(escolha - 1);
            List<Livro> livrosDoAutor = autorSelecioando.getLivros(); // Supondo que você tenha um método getLivros() na classe Autor
            if (livrosDoAutor.isEmpty()) {
                System.out.println("Este autor não possui livros cadastrados.");
                return;
            }

            System.out.println("Segue abaixo os livros do autor: " + autorSelecioando.getNome());
            adicionarServiços.printarListaDeLivros(livrosDoAutor);
        }
    }

    //Função que realiza a criação de um novo membro da bilbioteca
    public List<Membro> criarNovoMembro(List<Membro> listaDeMembros) {
        int tipoMembro = 0;
        System.out.println(CADASTRO_DE_MEMBROS);
        tipoMembro = leitor.nextInt();

        leitor.nextLine();

        //Membro do tipo Estudante
        if (tipoMembro == 1) {
            String nomeEstudante = "";
            int idEstudante = 0;
            String curos = "";

            System.out.println("Informe o nome do estudante: ");
            nomeEstudante = leitor.nextLine();

            idEstudante = adicionarServiços.geradorDeCodigosEId();

            System.out.println("Informe o curso do mesmo: ");
            curos = leitor.nextLine();

            Estudante estudante = new Estudante(nomeEstudante, idEstudante, curos);

            System.out.printf("Membro %s, adiccionando aos membros da biblioteca com sucesso!", nomeEstudante);

            listaDeMembros.add(estudante);

            //Membro do Tipo Professor
        } else if (tipoMembro == 2) {

            String nomeProfessor = "";
            int idProfessor = 0;
            String departamento = "";
            String materia = "";

            System.out.println("Informe o nome do professor: ");
            nomeProfessor = leitor.nextLine();

            idProfessor = adicionarServiços.geradorDeCodigosEId();

            System.out.println("Informe o departamento do mesmo: ");
            departamento = leitor.nextLine();

            System.out.println("Informe a matéria da sua aula: ");
            materia = leitor.nextLine();

            Professor novoProfessor = new Professor(nomeProfessor, idProfessor, departamento, materia);

            System.out.printf("Membro %s, adicionado aos membros da bilbioteca com sucesso!", nomeProfessor);

            listaDeMembros.add(novoProfessor);

            //Opção inválida
        } else {
            System.out.println("Opção inválida tente novamente!");
        }
        return listaDeMembros;
    }

    //Printar Lista de Membros
    public void printarListaDeMembros(List<Membro> listaDeMembros) {
        adicionarServiços.mostrarListaDeMembros(listaDeMembros);
    }

    public void emprestarLivros(List<Autor> listaDeAutores, List<Membro> listaDeMembros) {

        ////Escolha do Membro
        int membroEscolhido = 0;
        int livroEscolhido = 0;

        if (listaDeMembros.isEmpty()) {
            System.out.println("Adicione um membro à biblioteca primeiro!");
            return;
        }

        if (listaDeAutores.isEmpty()) {
            System.out.println("Adicione um autor e um livro à biblioteca primeiro!");
            return;

        }
        System.out.println("Informe o ID do membro ao qual você deseja emprestar o livro: ");
        adicionarServiços.mostrarListaDeMembros(listaDeMembros);
        membroEscolhido = leitor.nextInt();

        Membro membro = adicionarServiços.buscarMembroPorID(membroEscolhido, listaDeMembros);

        if (membro == null) {
            System.out.println("Membro não encontrado!");
            return;
        }

        //Escolha do Autor
        System.out.println("Informe o autor do livro que deseja emprestar: ");
        adicionarServiços.apresentarAutores(listaDeAutores);
        int autorEscolhido = leitor.nextInt() - 1; // Ajustar o índice para zero-based
        leitor.nextLine(); // Consumir o restante da linha

        if (autorEscolhido < 0 || autorEscolhido >= listaDeAutores.size()) {
            System.out.println("Autor inválido!");
            return;
        }

        Autor autor = listaDeAutores.get(autorEscolhido);

        List<Livro> livrosDoAutor = autor.getLivros(); // Supondo que você tenha um método getLivros() na classe Autor
        if (livrosDoAutor.isEmpty()) {
            System.out.println("Este autor não possui livros cadastrados.");
            return;
        }

        System.out.println("Informe o livro que deseja emprestar: ");
        for (int i = 0; i < livrosDoAutor.size(); i++) {
            Livro livro = livrosDoAutor.get(i);
            System.out.println((i + 1) + ". " + livro.toString()); // Supondo que você tenha um método getTitulo() na classe Livro
        }
        livroEscolhido = leitor.nextInt(); // Ajustar o índice para zero-based
        leitor.nextLine(); // Consumir o restante da linha

        Livro livro = adicionarServiços.buscarLivroPorCodigo(livroEscolhido, listaDeAutores);

        if (livro == null) {
            System.out.println("Livro não encontrado");
            return;
        }

        if (livro.verificarDisponibilidade().equals("Indisponível")) {
            System.out.println("Livro indisponível para empréstimo!");
        } else {
            membro.adicionarLivro(livro); // Supondo que você tenha um método adicionarLivro(Livro livro) na classe Membro
            livro.emprestarLivro();
            System.out.println("Livro emprestado com sucesso!");
        }
    }

    public void verificarHistoricoPorMembro(List<Membro> listaDeMembros) {
        adicionarServiços.apresentarHistoricoDeLivrosPorMembro(listaDeMembros, leitor);
    }

    public void realizarDevolução(List<Membro> listaDeMembrosPendetes, List<Autor> listaDeAutores){
        int livroASerDevolvido = 0;
        adicionarServiços.apresentarHistoricoDeLivrosPorMembro(listaDeMembrosPendetes, leitor);


        System.out.println("Informe o código do livro ao qual você deseja devolver: ");
        livroASerDevolvido = leitor.nextInt();

        Livro livro = adicionarServiços.buscarLivroPorCodigo(livroASerDevolvido, listaDeAutores);

        if (livro == null){
            System.out.println("Código de livro não localizado ou incorreto");
            return;
        }else {
            livro.devolverLivro();
            System.out.println("Devolução realizada com sucesso!");
        }
    }
}

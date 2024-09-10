package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Class.Constructor.Estudante;
import Class.Constructor.Membro;
import Class.Constructor.Professor;

public class InterecaoComUsuario {

    //SERVIÇOS ADICIONAIS -----------------------------------------
    private List<Autor> listaDeAutores = new ArrayList<>();
    private List<Membro> listaDeMembros = new ArrayList<>();
    private final Serviços adicionarServiços = new Serviços();
    private final Scanner leitor;
    //-----------------------------------------------------------------------

    //TEXTOS PADRÃO--------------------------------------------------------------

    //FUNÇÃO CRIAR MEMBROS
    private final String CADASTRO_DE_MEMBROS = """
            Vamos cadastrar um novo membro, informe uma das opções abaixo:
            1. Estudante
            2. Professor
                """;

    //FUNÇÃO DE CADASTRO DE AUTOR
    private final String CONFIRMACAO_AUTOR_CRIADO_COM_SUCESSO = "Autor adicionado à lista com sucesso!";

    //LSITA DE OPÇÕES DE INTEAÇÃO
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
    //DADOS DO AUTOR---------------------------------------------------------------
    private final String PERGUNTA_NOME_DO_AUTOR = "Informe o nome do autor: ";
    private final String AVISO_NOME_OBRIGATORIO = "O nome é obrigatório! ";
    private final String PERGUNTA_NACIONALIDADE_AUTOR = "Informe a nacionalidade: ";
    private final String AVISO_NACIONALIDADE_AUTOR = "A nacionalidade não pode ser vazia! ";
    private final String PERGUNTA_ANO_NASCIENTO_AUTOR = "Informe o ano de nascimento: ";
    private final String AVISO_ANO_NASCIMENTO_AUTOR = "O ano de nascimento não pode ser igual a 0!";
    //-------------------------------------------------------------------------------------
    //FUNÇÃO DE CRIAR NOVO LIVRO
    private final String PADROA_LANCAMENTO = "Disponível";
    private final String LIVRO_CRIADO = "Livro criado e adicionado com sucesso!";
    private final String LANÇAMENTO_LIVRO = "Informe o ano de lançamento do livro: ";
    private final String AVISO_DATA_LANCAMENTO_OBRIGATORIO = "A data de lançamento do Livro é obrigatória!";
    private final String AVISO_TITULO_OBRIGATORIO= "O título do Livro é obrigatório!";
    private final String NOME_DO_LIVRO = "Informe o Título do Livro: ";
    private final String PERGUNTA_INFORMAR_AUTOR_DESEJADO = "Digite o autor ao qual você deseja adicionar ao livro";
    private final String MENSAGEM_DE_AUTORES_DISPONIVEIS = "Autores disponíveis: ";
    private final String AVISO_LISTA_DE_AUTORES_VAZIA = "Não há autores disponíveis na biblioteca no momento. Crie um novo autor para continuar.";
    //FIM TEXTOS PADRÃO-------------------------------------------------------------------
    public InterecaoComUsuario(Scanner leitor) {
        this.leitor = leitor;
    }


    public void opcoesDeEscolha() {
        System.out.println(OPCOES);
    }


    private Autor criarNovoAutor() {
        String nome = " ";
        String nacionalidade = "";
        int anoNascimento = 0;
        leitor.nextLine();

        adicionarServiços.quebraDeLinha();

        while (true) {
            System.out.println(PERGUNTA_NOME_DO_AUTOR);
            nome = leitor.nextLine();
            if (!nome.trim().isEmpty()) {
                break;
            }
            System.out.println(AVISO_NOME_OBRIGATORIO);
        }
            adicionarServiços.quebraDeLinha();

        while (true) {
            System.out.println(PERGUNTA_NACIONALIDADE_AUTOR);
            nacionalidade = leitor.nextLine();
            if (!nacionalidade.trim().isEmpty()) {
                break;
            }
            System.out.println(AVISO_NACIONALIDADE_AUTOR);
        }

        adicionarServiços.quebraDeLinha();
        
        while (true) {
            System.out.println(PERGUNTA_ANO_NASCIENTO_AUTOR);
            if (leitor.hasNextInt()) {
                anoNascimento = leitor.nextInt();
                break;
            }           
            System.out.println(AVISO_ANO_NASCIMENTO_AUTOR);
        }

        return new Autor(nome, nacionalidade, anoNascimento);
    }

    //FUnção que realiza a criação de um novo autor.
    public List<Autor> criarAutorEVincular() {
        Autor autor = this.criarNovoAutor();
        adicionarServiços.adicionarAutorLista(listaDeAutores, autor);
        System.out.println(CONFIRMACAO_AUTOR_CRIADO_COM_SUCESSO);
        return listaDeAutores;
    }

    //Função que realiza a criação de um livro e vincula o mesmo au autor correspodente
    public void criarNovoLivro() {

        String tituloDoLivro = "";
        int autorEscolhido = 0;
        String nomeDoAutor = "";
        int anoDeLancameto = 0;
        int isbn = 0;
        String disponivel = PADROA_LANCAMENTO;

        if (listaDeAutores.isEmpty()) {
            System.out.println(AVISO_LISTA_DE_AUTORES_VAZIA);
            return;
        } else {
            System.out.println(MENSAGEM_DE_AUTORES_DISPONIVEIS);

            adicionarServiços.apresentarAutores(listaDeAutores);
        }

        System.out.println(PERGUNTA_INFORMAR_AUTOR_DESEJADO);
        autorEscolhido = leitor.nextInt();
        Autor autorSelecionado = listaDeAutores.get(autorEscolhido - 1);
        nomeDoAutor = autorSelecionado.getNome();
        leitor.nextLine();

        while (true) {
            System.out.println(NOME_DO_LIVRO);
            tituloDoLivro = leitor.nextLine();
            if (!tituloDoLivro.equals("")) {
                break;
            }
            System.out.println(AVISO_TITULO_OBRIGATORIO);
        }

        adicionarServiços.quebraDeLinha();

        while (true) {
            System.out.println(LANÇAMENTO_LIVRO);
            if (leitor.hasNextInt()) {
                anoDeLancameto = leitor.nextInt();
                break;
            }
            System.out.println(AVISO_DATA_LANCAMENTO_OBRIGATORIO);
        }
        
        isbn = adicionarServiços.geradorDeCodigosEId();


        Livro livro = new Livro(nomeDoAutor, tituloDoLivro, anoDeLancameto, disponivel, isbn);
        autorSelecionado.adicionarLivro(livro);

        System.out.println(LIVRO_CRIADO);
    };


    //FUnção que permite verficar os livros de determinado autor
    public void verificarLivrosDeDeterminadoAutor() {
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
    public List<Membro> criarNovoMembro() {
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
    public void printarListaDeMembros() {
        adicionarServiços.mostrarListaDeMembros(listaDeMembros);
    }

    public void emprestarLivros() {

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

    public void verificarHistoricoPorMembro() {
        adicionarServiços.apresentarHistoricoDeLivrosPorMembro(listaDeMembros, leitor);
    }

    public void realizarDevolução(){
        int livroASerDevolvido = 0;
        if (listaDeMembros.isEmpty()) {
            System.out.println("Não há membros disponíveis!");
            return;
        }
        adicionarServiços.apresentarHistoricoDeLivrosPorMembro(listaDeMembros, leitor);


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

package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterecaoComUsuario {

    //SERVIÇOS ADICIONAIS -----------------------------------------
    //Listas referente a Autores e membros dentro do projeto
    private List<Autor> listaDeAutores = new ArrayList<>();
    private List<Membro> listaDeMembros = new ArrayList<>();
    //Classe serviço, onde se encontram código que reptem e métodos de serviço.
    private final Servicos adicionarServiços = new Servicos();
    private final Scanner leitor;
    //-----------------------------------------------------------------------
    //String finais referente à eununciados e/ou títuloa;
    //FUNÇÃO DE CADASTRO DE AUTOR
    private final String CONFIRMACAO_AUTOR_CRIADO_COM_SUCESSO = "Autor adicionado à lista com sucesso!";

    //LSITA DE OPÇÕES DE INTEAÇÃO
    private final String OPCOES = """
            \n            
            1. Criar Autor (Adiciona novo autor ao catálogo da biblioteca)
            2. Criar Livro (Vincula livro lançamento ao autor)
            3. Adicionar novo membro à biblioteca
            4. Verificar lista de membros
            5. Veriricar livros por autor
            6. Verificar histórico membros
            7. Realizar Emprestimo (Realiza empréstimos de Livros)
            8. Realizar Devolução (Realiza a devolução de Livros)
            0. Sair
            \n            
            """;
    //DADOS DO AUTOR---------------------------------------------------------------
    private final String PERGUNTA_NOME_DO_AUTOR = "Informe o nome do autor: ";
    private final String AVISO_NOME_OBRIGATORIO = "O nome do autor não pode ser vazio! \n";
    private final String PERGUNTA_NACIONALIDADE_AUTOR = "Informe a nacionalidade: ";
    private final String AVISO_NACIONALIDADE_AUTOR = "A nacionalidade não pode ser vazia! \n";
    private final String PERGUNTA_ANO_NASCIENTO_AUTOR = "Informe o ano de nascimento: ";
    private final String AVISO_ANO_NASCIMENTO_AUTOR = "O ano de nascimento não pode ser igual a 0! \n";
    //-------------------------------------------------------------------------------------
    //FUNÇÃO DE CRIAR NOVO LIVRO
    private final boolean PADROA_LANCAMENTO = true;
    private final String LIVRO_CRIADO = "Livro criado e adicionado com sucesso!\n";
    private final String LANÇAMENTO_LIVRO = "Informe o ano de lançamento do livro: ";
    private final String AVISO_DATA_LANCAMENTO_OBRIGATORIO = "A data de lançamento do Livro é obrigatória! \n";
    private final String AVISO_TITULO_OBRIGATORIO = "O título do Livro é obrigatório! \n";
    private final String NOME_DO_LIVRO = "Informe o Título do Livro: ";
    private final String PERGUNTA_INFORMAR_AUTOR_DESEJADO = "Digite o autor ao qual você deseja adicionar ao livro: ";
    private final String MENSAGEM_DE_AUTORES_DISPONIVEIS = "Autores disponíveis: ";
    private final String AVISO_LISTA_DE_AUTORES_VAZIA = "Não há autores disponíveis na biblioteca no momento. Crie um novo autor para continuar.\n";
    //FIM TEXTOS PADRÃO-------------------------------------------------------------------
    //VERIFICAR LIVROS DE DETERMINADO AUTOR-----------------------------------------------
    private final String SELECIONAR_AUTOR_VERIFICAR = "Informe o autor ao qual você deseja visuliazar os livros lançados: ";
    private final String ERRO_OPCAO_INVALIDA = "Opção informada inválida tente novamente! \n";
    private final String AUTOR_SEM_LIVRO_CADASTRADO = "Este autor não possui livros cadastrados! \n";
    private final String MENSAGEM_INTRODUCAO_LIVROS_AUTOR = "Segue abaixo os livros do autor: ";
    //FUNÇÃO CRIAR MEMBROS
    private final String CADASTRO_DE_MEMBROS = """
            Vamos cadastrar um novo membro, informe uma das opções abaixo:
            1. Estudante
            2. Professor
                """;
    //criarNovoMembro - ESTUDANTE
    private final String INFORMAR_NOME_ESTUDANTE = "Informe o nome do estudante: ";
    private final String AVISO_NOME_ESTUDANTE_VAZIO = "O nome do estudante não pode ser vazio! \n";
    private final String INFORMAR_CURSO_ESTUDANTE = "Informe o curso do mesmo: ";
    private final String AVISA_CURSO_ESTUDANTE_VAZIO = "O curso do estudante não pode ser vazio! \n";
    private final String MENSAGEM_SUCESSO_CRIAÇÃO_ESTUDANTE = "Membro %s, adiccionando aos membros da biblioteca com sucesso! \n";
    //criarNovoMembro - PROFESSOR
    private final String INFORMAR_NOME_PROFESSOR = "Informe o nome do professor: ";
    private final String AVISA_NOME_PROFESSOR = "O nome do professor não pode ser vazio! \n";
    private final String INFORMAR_DEPARTAMENTO_PROFESSOR = "Informe o departamento do mesmo: ";
    private final String AVISA_DEPARTAMENTO_PROFESSOR = "O departamento do professor não pode ser vazio! \n";

    private final String INFORMAR_MATERIA_AULA = "Informe a matéria da sua aula: ";
    private final String AVISA_MATERIA_PROFESSOR = "A materia do professor não pode ser vazia! \n";

    private final String MENSAGEM_SUCESSO_CRIACAO_PROFESSOR = "Membro %s, adicionado aos membros da bilbioteca com sucesso! \n";
    private final String MENSAGEM_ERRO_OPCAO_CRIACAO_INVALIDA = "Opção inválida tente novamente! \n";
    //EmprestarLivro
    private final String MENSAGEM_ERRO_BIBLIOTECA_SEM_MEMBROS = "Adicione um membro à biblioteca primeiro! \n";
    private final String MENSAGEM_DE_ERRO_BILBIOTECA_SEM_AUTORES = "Adicione um autor e um livro à biblioteca primeiro! \n";
    private final String REQUISICAO_ID_MEMBRO = "Informe o ID do membro ao qual você deseja emprestar o livro: ";
    private final String REQUISICAO_AUTOR = "Informe o autor do livro que deseja emprestar: ";
    private final String FALAHA_REUISCAO_AUTOR_NAO_ENCONTRADO = "Autor não encontrado, tente novamente! \n";
    private final String FALHA_LOCALIZAR_LIVRO_AUTOR_SEM_LIVROS = "Este autor não possui livros cadastrados! \n";
    private final String REQUISICAO_LIVRO = "Informe o livro que deseja emprestar: ";
    private final String FALHA_LOCALIZAR_LIVRO = "Livro não encontrado! \n";
    //CERIFICAR HISTÓRICO POR MEMBRO
    private final String MEMBRO_NÃO_POSSUI_LIVROS = "O membro não possui livros em seu histórico! \n";
    private final String MEMBRO_NAO_POSSUI_PENDENCIAS = "O membro não possui livros pendentes de devolução! \n";

    //COnstrutor da Clase InteracaoComUsuario, recebe como parâmatro um Scanner, que tem por
    //objetivo, ser uma variálve global da classe.
    public InterecaoComUsuario(Scanner leitor) {
        this.leitor = leitor;
    }

    //Função que printa a lsita de opções ao usuário. 
    public void opcoesDeEscolha() {
        System.out.println(OPCOES);
    }

    //Método que possui como retorno um novo autor. 
    private Autor requerirDadosECriarAutor() {
        //Variáveis para controle de dados no método
        String nome = " ";
        String nacionalidade = "";
        int anoNascimento = 0;
        leitor.nextLine();

        //função para quebra de linha
        adicionarServiços.quebraDeLinha();

        //validação de resposta do usuário, caso o usuário tente informar um valor vazio para o nome do autor
        //o código avisará que se tratar de uma açõ impossível e repetira até que a mesma seja efetuada corretamente. 
        while (true) {
            System.out.println(PERGUNTA_NOME_DO_AUTOR);
            nome = leitor.nextLine();
            if (!nome.isEmpty()) {
                break;
            }
            System.out.println(AVISO_NOME_OBRIGATORIO);
        }

        adicionarServiços.quebraDeLinha();
        
        //validação de resposta do usuário, caso o usuário tente informar um valor vazio para a nacionalidade do autor
        //o código avisará que se tratar de uma açõ impossível e repetira até que a mesma seja efetuada corretamente. 
        while (true) {
            System.out.println(PERGUNTA_NACIONALIDADE_AUTOR);
            nacionalidade = leitor.nextLine();
            if (!nacionalidade.isEmpty()) {
                break;
            }
            System.out.println(AVISO_NACIONALIDADE_AUTOR);
        }

        adicionarServiços.quebraDeLinha();
    //validação de resposta do usuário, caso o usuário tente informar um valor vazio para a idade do autor
    //o código avisará que se tratar de uma açõ impossível e repetira até que a mesma seja efetuada corretamente. 
        while (true) {
            System.out.println(PERGUNTA_ANO_NASCIENTO_AUTOR);
            if (leitor.hasNextInt()) {
                anoNascimento = leitor.nextInt();
                break;
            }
            System.out.println(AVISO_ANO_NASCIMENTO_AUTOR);
        }
        //Ao final do método, retornamos a criação de um novo autor, passando os parâmetros necessário, que são:
        //Nome, nacionalidade e ano de nascimento. 
        return new Autor(nome, nacionalidade, anoNascimento);
    }

    //Função que realiza a criação e a adição desse novo autor à lista de autores.
    //Utliza da função privada acima criarNovoAtuor para a criação do autor. 
    public void criarAutorEVincular() {
        Autor autor = this.requerirDadosECriarAutor(); //Método que cria e retorna um aturo. O retorno está sendo salvo em "autor".
        //O método abaixo, presente na calsse adicionarServiços, adciona o autor à uma lista, e recebe como parâmetro 
        //uma lista de autores e um autor.
        adicionarServiços.adicionarAutorLista(listaDeAutores, autor);
        System.out.println(CONFIRMACAO_AUTOR_CRIADO_COM_SUCESSO);
    }

    //Função que realiza a criação de um novo livro
    public void criarNovoLivro() {
        //Abaixo temos as variáveis que realizam o controle dos dados inseridos pelo usuário
        String tituloDoLivro = "";
        int autorEscolhido = 0;
        String nomeDoAutor = "";
        int anoDeLancameto = 0;
        int isbn = 0;
        boolean disponivel = PADROA_LANCAMENTO;

        leitor.nextLine(); //Scanner utilizado para realizar a limepza dos buffers

        //Validação da lsita de autores, caso a lista de autores esteja vazia,
        //o sistema apresenta uma mensagem informando o evento e para o istema; 
        if (listaDeAutores.isEmpty()) {
            System.out.println(AVISO_LISTA_DE_AUTORES_VAZIA);
            return;
        } else {
            //Caso contrário, ele apresentará os autores presente nas lsita
            System.out.println(MENSAGEM_DE_AUTORES_DISPONIVEIS);
            //Abaixo temos o método da Classe aicionarServiços, que apresenta os autores de uma lista.
            adicionarServiços.apresentarAutores(listaDeAutores);
        }
        //Após apresentado os autores, o sistema solicitará para informar o autor desejado, o valor a ser informado
        //Se trata da posição do uusário na lsita. 
        System.out.println(PERGUNTA_INFORMAR_AUTOR_DESEJADO);
        autorEscolhido = leitor.nextInt();
        //Será então recupardo o autor da lista conforme informado
        Autor autorSelecionado = listaDeAutores.get(autorEscolhido - 1);
        //Por fim, guardaremos o nome do autor na variável referente
        nomeDoAutor = autorSelecionado.getNome();
        //Limparemos o buffer;
        leitor.nextLine();

        //Repte-se a validação dos dados, para que não seja informado nenhum campo em vazio, inicilamente
        //Validando no nome
        while (true) {
            System.out.println(NOME_DO_LIVRO);
            tituloDoLivro = leitor.nextLine();
            if (!tituloDoLivro.isEmpty()) {
                break;
            }
            System.out.println(AVISO_TITULO_OBRIGATORIO);
        }
        //Posteriormente a data de lançamento do livro.
        while (true) {
            System.out.println(LANÇAMENTO_LIVRO);
            if (leitor.hasNextInt()) {
                anoDeLancameto = leitor.nextInt();
                break;
            }
            System.out.println(AVISO_DATA_LANCAMENTO_OBRIGATORIO);
        }

        adicionarServiços.quebraDeLinha();

        //Enquanto ao ISBN, o mesmo será cirado de forma randômica, utilizando um método
        //criado e presente na classe adicionarServiços. 
        isbn = adicionarServiços.geradorDeCodigosEId();

        //Com os dados em mãos, criaremos um novo livro, que recebe como parâmaetro o nome do autor, titulo do livro,
        // ano de lançamento, diponibildiade (o mesmo se inicia Disponível para empréstimo) e o ISBN
        Livro livro = new Livro(nomeDoAutor, tituloDoLivro, anoDeLancameto, disponivel, isbn);
        autorSelecionado.adicionarLivro(livro);

        //Por fim, informamos que o mesmo foi criado e vinculado ao autor.
        System.out.println(LIVRO_CRIADO);
    }

    ;

    //FUnção que permite verficar os livros de determinado autor
    public void verificarLivrosDeDeterminadoAutor() {
        //Inicialmente realizamos uma validação se existe na lsita de autores, algum autor criado
        //Caso não exista, será emitida uma mensagem de aviso e o método parará e retornará a lista de opções
        if (listaDeAutores.isEmpty()) {
            System.out.println(AVISO_LISTA_DE_AUTORES_VAZIA);
            return;
        }
        //Se existir, os mesmos serão printados novamente pelo método de apresentar autores.
        adicionarServiços.apresentarAutores(listaDeAutores);
        System.out.println(SELECIONAR_AUTOR_VERIFICAR);
        //Será requisitado ao usuário que informe o autor que deseja visualizar os livros.
        int escolha = leitor.nextInt();

        //Caso o usuário informe um valor menor que 1 ou maior que a quantiodade de autores existentes
        //O sistema informará que tal opção é inválida. 
        if (escolha < 1 || escolha > listaDeAutores.size()) {
            System.out.println(ERRO_OPCAO_INVALIDA);
        } else {
            //Caso conrtário, será buscado o autor, conforme solicitado ao usuario
            Autor autorSelecioando = listaDeAutores.get(escolha - 1);
            //E por fim, será localizado a lsita de livros referente ao mesmo, sendo armezando em livrosDoAutor
            List<Livro> livrosDoAutor = autorSelecioando.getLivros();
            //Se a lista de livros do mesmo estiver vazia, o sismtea avisará, e retornará à tela de opções inicial
            if (livrosDoAutor.isEmpty()) {
                System.out.println(AUTOR_SEM_LIVRO_CADASTRADO);
                return;
            }
           //Caso contrário, irá imprimir no console, todos os livros do autor selecionado
            System.out.println(MENSAGEM_INTRODUCAO_LIVROS_AUTOR + autorSelecioando.getNome());
            adicionarServiços.printarListaDeLivros(livrosDoAutor);
        }
    }

    //Função que realiza a criação de um novo membro da bilbioteca, o meétodo abaixo, retonra uma nova lista de membros.
    public List<Membro> criarNovoMembro() {
        int tipoMembro = 0;
        //Inicialmente será solicitado ao usuário, informar o tipo do membro entre Alno e Professor;
        System.out.println(CADASTRO_DE_MEMBROS);
        tipoMembro = leitor.nextInt();

        leitor.nextLine();

        //Caso seja selecionado 1, Aluno, entraremos na seguinte condição. 
        if (tipoMembro == 1) {
            String nomeEstudante = "";
            int idEstudante = 0;
            String curos = "";
            //Utilizaremos da estrutura de valição, para impedir que o usuário informe campos em vazio;
            //Validamos primeiramente o nome do estudante
            while (true) {
                System.out.println(INFORMAR_NOME_ESTUDANTE);
                nomeEstudante = leitor.nextLine();
                if (!nomeEstudante.isEmpty()) {
                    break;
                }
                System.out.println(AVISO_NOME_ESTUDANTE_VAZIO);
            }
            //Geramos um ID aleatório com o método geradorDeCódigo
            idEstudante = adicionarServiços.geradorDeCodigosEId();

            //Validamos o curso do mesmo
            while (true) {
                System.out.println(INFORMAR_CURSO_ESTUDANTE);
                curos = leitor.nextLine();
                if (!curos.isEmpty()) {
                    break;
                }
                System.out.println(AVISA_CURSO_ESTUDANTE_VAZIO);
            }

            //Por fim criamos um novo estudante, passando os parâmetros necessários
            Estudante estudante = new Estudante(nomeEstudante, idEstudante, curos);

            //Informamos o sucesso da operação de criação
            System.out.printf(MENSAGEM_SUCESSO_CRIAÇÃO_ESTUDANTE, nomeEstudante);
            //Salvamos o estudante na lsita de membros;
            listaDeMembros.add(estudante);

            //Membro do Tipo Professor, repetimos o processo acima citado, entrtanto utilizando um número maior de 
            //Variáveis. 
        } else if (tipoMembro == 2) {

            String nomeProfessor = "";
            int idProfessor = 0;
            String departamento = "";
            String materia = "";

            while (true) {
                System.out.println(INFORMAR_NOME_PROFESSOR);
                nomeProfessor = leitor.nextLine();
                if (!nomeProfessor.isEmpty()) {
                    break;
                }
                System.out.println(AVISA_NOME_PROFESSOR);
            }

            idProfessor = adicionarServiços.geradorDeCodigosEId();

            while (true) {
                System.out.println(INFORMAR_DEPARTAMENTO_PROFESSOR);
                departamento = leitor.nextLine();
                if (!departamento.isEmpty()) {
                    break;
                }
                System.out.println(AVISA_DEPARTAMENTO_PROFESSOR);
            }

            while (true) {
                System.out.println(INFORMAR_MATERIA_AULA);
                materia = leitor.nextLine();
                if (!materia.isEmpty()) {
                    break;
                }
                System.out.println(AVISA_MATERIA_PROFESSOR);
            }


            Professor novoProfessor = new Professor(nomeProfessor, idProfessor, departamento, materia);

            System.out.printf(MENSAGEM_SUCESSO_CRIACAO_PROFESSOR, nomeProfessor);

            listaDeMembros.add(novoProfessor);

            //Opção inválida
        } else {
            //Se a opção de criação de membros infromada foir inválida, um alerta sera emitido e o repitirá.
            System.out.println(MENSAGEM_ERRO_OPCAO_CRIACAO_INVALIDA);
        }
        //Por fim, retornamos a lista de membros.
        return listaDeMembros;
    }

    //O método abaixo printa a lsita de membros cadastrados no sistema, para isso, utiliza um método 
    //da classe adicionarServiços, que possui como parâmetro uma lista de membros.
    public void printarListaDeMembros() {
        adicionarServiços.mostrarListaDeMembros(listaDeMembros);
    }

    //O método emprestar livro, tem por objetivo registrar o histórico de empréstimos de um livro,
    //Ao mesmo tempo que indisponibiliza esse livro.
    public void emprestarLivros() {

        ////Escolha do Membro
        int membroEscolhido = 0;
        int livroEscolhido = 0;
        //Primeiramente verificamos se a bilbioteca possui membros cadastrados, caso não haja
        //Será emitido uma aviso e o programa voltará para a tela de opções;
        if (listaDeMembros.isEmpty()) {
            System.out.println(MENSAGEM_ERRO_BIBLIOTECA_SEM_MEMBROS);
            return;
        }

        //Verificamos tamvém, se existem autores cadastrados, caso não haja, p sistema emitira um aviso
        // e voltará para a tela inicial.
        if (listaDeAutores.isEmpty()) {
            System.out.println(MENSAGEM_DE_ERRO_BILBIOTECA_SEM_AUTORES);
            return;
        }

        //Após as validações, o sistema irá requisitar o ID do membro para realizar o empréstimo, sendo necessário informar o 
        //ID corretamente
        System.out.println(REQUISICAO_ID_MEMBRO);
        //Será listado a lista de membro, e o usuário irá informar um código de validação.
        adicionarServiços.mostrarListaDeMembros(listaDeMembros);
        membroEscolhido = leitor.nextInt();
        //Após isso, o sistema irá tentar localizar um Membro que possua tal ID
        Membro membro = adicionarServiços.buscarMembroPorID(membroEscolhido, listaDeMembros);
        //Caso o mesmo não consiga localizar, ele emitirá um aviso e o código retornará para a tela de opções. 
        if (membro == null) {
            System.out.println("Membro não encontrado!");
            return;
        }

        //Se localizado, o sistema irá requisitar o autor que o usuário deseja emprestar o livro
        //Utilizando dos mesmos meios para printar os autores e selecionar o mesmo
        System.out.println(REQUISICAO_AUTOR);
        adicionarServiços.apresentarAutores(listaDeAutores);
        int autorEscolhido = leitor.nextInt() - 1; // Ajustar o índice para zero-based
        leitor.nextLine(); // Consumir o restante da linha

        //Validação se o autor informado realmente existe; 
        if (autorEscolhido < 0 || autorEscolhido >= listaDeAutores.size()) {
            System.out.println(FALAHA_REUISCAO_AUTOR_NAO_ENCONTRADO);
            return;
        }

        //Após isso, o sistema irá localizar o autor escolhido
        Autor autor = listaDeAutores.get(autorEscolhido);
        //E irá trazer os liveos do mesmo, para o membro escolher, se o autor não possui livros, o 
        //será emitido uma viso, e o sistema retornará para a tela de opções. 
        List<Livro> livrosDoAutor = autor.getLivros(); 
        if (livrosDoAutor.isEmpty()) {
            System.out.println(FALHA_LOCALIZAR_LIVRO_AUTOR_SEM_LIVROS);
            return;
        }
        //Se for encontrado livros, o sistema irá iterar sobre a lista de livros, 
        //E irá mostarar todos os livros encontrados, utilizando para o método toString();
        System.out.println(REQUISICAO_LIVRO);
        for (int i = 0; i < livrosDoAutor.size(); i++) {
            Livro livro = livrosDoAutor.get(i);
            System.out.println((i + 1) + ". " + livro.toString()); // Supondo que você tenha um método getTitulo() na classe Livro
        }
        //O usuário irá infomrar o código ISBN do livro para realizar esse empréstimo. 
        livroEscolhido = leitor.nextInt(); // Ajustar o índice para zero-based
        leitor.nextLine(); // Consumir o restante da linha

        //O sistema irá tentar localizar o livro informado pel0o código.
        Livro livro = adicionarServiços.buscarLivroPorCodigo(livroEscolhido, listaDeAutores);

            //Caso o livo não seja encontrado, o sistema emitira um aviso e retornara a tela de opções
        if (livro == null) {
            System.out.println(FALHA_LOCALIZAR_LIVRO);
            return;
        }

        //Se verificará se o livro que esta tentando se emprestar possui disponibilida
        //Caso não, uma viso será mostrado, caso sim, o livro será emprestado e indisponibilizado. 
        if (!livro.verificarDisponibilidade()) {
            System.out.println("Livro indisponível para empréstimo! \n");
        } else {
            membro.adicionarLivro(livro); 
            livro.emprestarLivro();
            System.out.println("Livro emprestado com sucesso!\n");
        }
    }

    //Abaixo temos uma método que mostra o histórico de livros de um determinado membro.
    //Possui como parâmetro uma lista de membros, um Scanner, e um aviso caso o livro não seja encontrado.
    public void verificarHistoricoPorMembro() {
        adicionarServiços.apresentarHistoricoDeLivrosPorMembro(listaDeMembros, leitor, MEMBRO_NÃO_POSSUI_LIVROS);
    }


    //Por fim, temos o método que realiza a devolução de livros; 
    public void realizarDevolucao() {
        int livroASerDevolvido = 0;
        boolean validacao;
        //Inicialmente, realizamaos a cerificação da existencia de membros no sistema
        //Caso não haja membros cadastrados, será emitido um aviso e retonrará para a página de opções
        if (listaDeMembros.isEmpty()) {
            System.out.println("Não há membros disponíveis!\n");
            return;
        }

        //Aqui iremos vaidar as etpas do Histórico de livros, caso algumas das etapas retorne false, o programa irá avisa sobre o erro
        //E retornar para a página inicial.
        validacao = adicionarServiços.apresentarHistoricoDeLivrosPorMembro(listaDeMembros, leitor, MEMBRO_NAO_POSSUI_PENDENCIAS);
        if (!validacao){
            return;
        }

        leitor.nextLine();
        //Solicitamos qual livro queremos devolver
        System.out.println("Informe o código do livro ao qual você deseja devolver: ");
        livroASerDevolvido = leitor.nextInt();

        //O sistema irá tentar encontrar o livro, caso o mesmo não encontre, ele emitirá aum aviso e parará o código
        //Caso contrário, irá realizar a devolução do livro;
        Livro livro = adicionarServiços.buscarLivroPorCodigo(livroASerDevolvido, listaDeAutores);

        if (livro == null) {
            System.out.println("Código de livro não localizado ou incorreto!\n");

        }else {
            livro.devolverLivro();
        }
    }
}

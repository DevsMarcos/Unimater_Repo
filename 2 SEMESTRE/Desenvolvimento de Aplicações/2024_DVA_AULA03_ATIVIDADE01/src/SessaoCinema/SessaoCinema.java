package SessaoCinema;

import java.util.Scanner;

public class SessaoCinema {

    private int pessoasEntraram;
    private int verificaIngresso;
    private int ingressosVendidos;
    private int capacidadeMaxima;
    private final Scanner leitor;

    //STRINGS PADRÃO
    private final String OPCOES = """
                            
              Bem - Vindo ao CineGrach, seleciona uma das opções abaixo:
              1. Exibir Filme do Dia
              2. Vender Ingresso;
              3. Contar Ingressos;
              4. Cancelar Sessão

            """;

    private final String PRINTAR_FILME = """
            HOJE O FILME SERÁ!
            Nome: %s
            Data de Lançamento: %d
            """;

    private final String LOTADO = "Está lotado: ";
    private final String QUANTIDADE_INGRESSOS_VENDER = "Quantos ingressos você deseja vender: ";
    private final String QUANTIDADE_CADEIRAS_DISPONIVEIS = "Não há cadeiras suficientes! A quantidade de cadeiras atuais é de: ";
    private final String VENDA_RELIZADA = "Ingressos vendidos com sucesso! Vagas restantes: ";
    private final String START_SESSAO = "Sessão iniciada, checagem de ingressos iniciada";
    private final String INGRESSOS_APRESENTADOS_ENTRADA = "Quantos ingressos foram apresentados: ";
    private final String TESTE_VALIDADE_INGRESSO = "São ingressos válidos: 1 para SIM e 0 para NÃO ";
    private final String AUTIROZADO = "Entrada autorizada! Vagas restantes: ";
    private final String INGERESSO_INVALIDO = "Ingressos apresentados inváldios, entrada NEGADA!";
    private final String CONTAGEM_FINALIZADA = "Entrada encerrada, sessão iniciada, BOM FILME!";
    //------------------------------------------------------------------------------------------------------------------

    public int getPessoasEntraram() {
        return pessoasEntraram;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public SessaoCinema(Scanner leitor) {
        this.leitor = leitor;

    }

    public void informarDadosSessao(Filme filme) {
        String nomeFilme;
        int anoFilme;
        System.out.println("CRIADO SESSÃO");
        System.out.println("Informe o nome do Filme: ");
        nomeFilme = leitor.nextLine();

        System.out.println("Informe o ano do filme: ");
        anoFilme = leitor.nextInt();

        filme.setNomeFilme(nomeFilme);
        filme.setAnoLancamento(anoFilme);

        System.out.println("Informe a capacidade dess sessão: ");
        capacidadeMaxima = leitor.nextInt();

        System.out.println("Sessão Criada com sucesso!");
    }

    //Função para realizar a escolha da opção de ação pelo usuário
    public int escolhaOpcao() {
        int opcaoEscolher = 0;
        System.out.println(OPCOES);

        opcaoEscolher = leitor.nextInt();
        leitor.nextLine();
        return opcaoEscolher;
    }

    //Função que exibe o filme do dia;
    public void exibirFilmeDoDia(Filme filme) {
        System.out.format(PRINTAR_FILME, filme.getNomeFilme(), filme.getAnoLancamento());
    }

    private boolean estaLotado() {
        return true;
    }

    public void venderIngresso() {
        if (ingressosVendidos == capacidadeMaxima) {
            System.out.println(LOTADO + estaLotado());
        } else if (ingressosVendidos < capacidadeMaxima) {
            int vendaDoIngresso;

            System.out.println(QUANTIDADE_INGRESSOS_VENDER);
            vendaDoIngresso = leitor.nextInt();

            if (vendaDoIngresso > (capacidadeMaxima - ingressosVendidos)) {
                System.out.println(QUANTIDADE_CADEIRAS_DISPONIVEIS + (capacidadeMaxima - ingressosVendidos));
                return;
            }

            ingressosVendidos += vendaDoIngresso;
            System.out.println(VENDA_RELIZADA);
        }
    }

    public void verificarEntradaSessao() {
        if (getPessoasEntraram() < getCapacidadeMaxima()) {
            System.out.println(START_SESSAO);
            int quantidadeIngressoApresentada;

            System.out.println(INGRESSOS_APRESENTADOS_ENTRADA);
            quantidadeIngressoApresentada = leitor.nextInt();

            if (quantidadeIngressoApresentada > (getCapacidadeMaxima() - getPessoasEntraram())) {
                System.out.println("Quantidade apresentada inválida para a sessão, há mais pessoas do que a sessão suporta");
                return;
            };

            System.out.println(TESTE_VALIDADE_INGRESSO);
            verificaIngresso = leitor.nextInt();

            if (verificaIngresso == 1) {
                this.pessoasEntraram += quantidadeIngressoApresentada;
                System.out.println(AUTIROZADO + (getCapacidadeMaxima() - getPessoasEntraram()));

            } else {
                System.out.println(INGERESSO_INVALIDO);
            }
        } else {
            System.out.println("Capacidde da sessão atingida, filme inicado!");

        }

    }

    public void encerrarSessao() {
        System.out.println("Encerrando a sessão, obrigado e volte sempre!");
    }

    ;

}

package Classes;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

import Construtores.Carro;
import Construtores.Defeito;
import Construtores.OrdemDeServico;

public class InterecaoUsuario {

    private final Scanner leitor;

    Servicos adicionarServico = new Servicos();

    public InterecaoUsuario(Scanner leitor) {
        this.leitor = leitor;
    }

    final String EMPYT_LIST_ORDER = "Não há ordens de serviço pendentes!";
    final String RECIVE_CAR_BRAND = "Informe a marca do carro: ";
    final String RECIVE_MODEL_CAR = "Informe o modelo do carro: ";
    final String RECIVE_YEAR_CAR = "Informe o ano do carro: ";
    final String SUCCESS_RESOLVE = "Ordem de serviço resolvida com sucesso!";
    final String GIFT = "Obrigado por escolher nossa oficina, você GANHOU uma LAVAGEM e um POLIMENTO ;)";
    final String ORDER_ID = "Qual das ordens de serviço você deseja resolver: ";
    final String ORDER_ID_DEVOLUTION = "Qaul ordem de serviço você deseja reprovar: ";
    final String ORDE_DEVOLUTION_MENSSAGE = "Ordem reprovada! O veículo está sendo devolvido da mesma forma como entregue por CONTA e RISCO do CLIENTE!";
    final String ORDER_RESOLVE_INTRODUCTIO = "Segue abaixo as ordens de serviço que você possui em aberto: ";

    public int escolhaOpcao() {
        int opcaoEscolher = 0;
        System.out.println("""
                                
                AvantGarde Performance & Maintenance
                Escolha uma das opções abaixo:
                1. Adicionar Ordem de Serviço
                2. Verificar ordens de serviço abertas
                3. Aprovar Ordem de Serviço
                4. Reprovar ordem
                5. Sair

                """);

        opcaoEscolher = leitor.nextInt();
        leitor.nextLine();
        return opcaoEscolher;
    }

    public Carro criarCarro() {
        String marca = "";
        String modelo = "";
        int ano = 0;

        System.out.println(RECIVE_CAR_BRAND);
        marca = leitor.nextLine();

        System.out.println(RECIVE_MODEL_CAR);
        modelo = leitor.nextLine();

        System.out.println(RECIVE_YEAR_CAR);
        ano = leitor.nextInt();
        return new Carro(marca, modelo, ano);
    }

    public OrdemDeServico criarOrdem(List<Defeito> defeitos) {
        Carro carro = this.criarCarro();
        OrdemDeServico novaOrdem = adicionarServico.gerarOrdemDeServico(carro, defeitos);
        return novaOrdem;

    }

    public OrdemDeServico ordemAResolver(List<OrdemDeServico> listaDeOrdens) {
        if (listaDeOrdens.isEmpty()) {
            System.out.println(EMPYT_LIST_ORDER);
            return null;
        } else {
            System.out.println(ORDER_RESOLVE_INTRODUCTIO);
            apresentaOrdems(listaDeOrdens);
            int numeroOrder = 0;
            System.out.println(ORDER_ID);
            numeroOrder = leitor.nextInt();
            System.out.println(SUCCESS_RESOLVE);
            System.out.println(GIFT);
            return listaDeOrdens.get(numeroOrder - 1);
        }
    }

    public OrdemDeServico ordemRemover(List<OrdemDeServico> listaDeOrdens) {
        if (listaDeOrdens.isEmpty()) {
            System.out.println(EMPYT_LIST_ORDER);
            return null;
        } else {
            System.out.println(ORDER_RESOLVE_INTRODUCTIO);
            apresentaOrdems(listaDeOrdens);
            int numeroOrder = 0;
            System.out.println(ORDER_ID_DEVOLUTION);
            numeroOrder = leitor.nextInt();
            System.out.println(ORDE_DEVOLUTION_MENSSAGE);
            return listaDeOrdens.get(numeroOrder - 1);
        }
    }

    public void apresentaOrdems(List<OrdemDeServico> listaDeOrdens) {
        if (listaDeOrdens.isEmpty()) {
            System.out.println(EMPYT_LIST_ORDER);
        } else {
            listaDeOrdens.forEach(
                    ordem -> {
                        System.out.println((listaDeOrdens.indexOf(ordem) + 1) +
                                "° Ordem -----------------------------------" + "\n" + ordem);
                    }
            );
        }
    }


}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.InterecaoUsuario;
import Classes.Servicos;
import Construtores.Defeito;
import Construtores.OrdemDeServico;

public class App {
    public static void main(String[] args) {
        final String FINISH_APPLICATION = "Ecerrando aplicação.....";
        final String WARNIGN_MESSAGE = "Opção inválida, tente novamente";

        Scanner leitor = new Scanner(System.in);

        InterecaoUsuario opcaoIntereacao = new InterecaoUsuario(leitor);
        Servicos adicionarServico = new Servicos();


        List<OrdemDeServico> listaDeOrdens = new ArrayList<>();

        List<Defeito> defeitos = new ArrayList<>();
        defeitos.add(new Defeito("Velas pifadas", 650, 1));
        defeitos.add(new Defeito("Bateria fraca", 350, 1));
        defeitos.add(new Defeito("Pastilhas de freio gastas", 430, 2));
        defeitos.add(new Defeito("Balanceamento e Alinhamento", 180, 1));
        defeitos.add(new Defeito("Água no óleo de Cixa de Transmissão", 10000, 15));
        defeitos.add(new Defeito("Motor esoutrado", 25000, 30));
        defeitos.add(new Defeito("Falha Elétrica", 1200, 7));
        defeitos.add(new Defeito("Bomba de combustível", 300, 1));

        int opcaoEscolhida = 0;
        do {
            opcaoEscolhida = opcaoIntereacao.escolhaOpcao();
            switch (opcaoEscolhida) {
                case 1 -> {
                    listaDeOrdens = adicionarServico.adicionarOrdemLista(listaDeOrdens, opcaoIntereacao.criarOrdem(defeitos));
                    opcaoEscolhida = 0;
                }

                case 2 -> {
                    opcaoIntereacao.apresentaOrdems(listaDeOrdens);
                    opcaoEscolhida = 0;
                }

                case 3 -> {
                    OrdemDeServico ordemEscolhida = opcaoIntereacao.ordemAResolver(listaDeOrdens);
                    listaDeOrdens = adicionarServico.resolverOrdem(listaDeOrdens, ordemEscolhida);
                    opcaoEscolhida = 0;

                }

                case 4 -> {
                    System.out.println(FINISH_APPLICATION);
                }

                default -> {
                    System.out.println(WARNIGN_MESSAGE);
                }
            }
        } while (opcaoEscolhida != 4);

        listaDeOrdens.forEach(System.out::println);

    }

}

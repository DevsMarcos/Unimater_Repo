import SessaoCinema.Filme;
import SessaoCinema.SessaoCinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Filme novoFilme = new Filme();
        SessaoCinema novaSessao = new SessaoCinema(leitor);

        novaSessao.informarDadosSessao(novoFilme);

        int opcaoEscolhida = 0;
        do {
            opcaoEscolhida = novaSessao.escolhaOpcao();
            switch (opcaoEscolhida) {
                case 1 -> {
                    novaSessao.exibirFilmeDoDia(novoFilme);
                }
                case 2 -> {
                    novaSessao.venderIngresso();
                }
                case 3 -> {
                    novaSessao.verificarEntradaSessao();
                }
                case 4 -> {
                    novaSessao.encerrarSessao();
                }
                default -> {
                    System.out.println("Opção inválida, tente novamente!");
                }
            }
        } while (opcaoEscolhida != 4);
    }

    /*● Como o encapsulamento ajuda a proteger os
    dados sobre a sessão de cinema?
    R: Utilizando o encapsulamento, impedimos que dados sensíveis sobre a senssão, como o filme transmitido,
    quantidade de cadeiras, e número de ingress vendidos seja alterada;

    ● O que aconteceria se não houvesse controle
    sobre a capacidade máxima da sessão?
    R:Não haveria controle sobre a quaintadade de pessoas que entrariam na sessão, podendo ultrpassar a quantidade estipuladaa,
    prevista para a mesma. Levando em consideração impacatos possivelmente reais, haveriam impactos econômicos nesse caso.

    * */
}
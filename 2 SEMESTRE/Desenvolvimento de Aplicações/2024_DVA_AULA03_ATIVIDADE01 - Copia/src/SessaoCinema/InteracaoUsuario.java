package SessaoCinema;

import java.util.Scanner;

public class InteracaoUsuario {
    private int numeroDeCadeiras = 30;
    private int ingressosVendidos;
    private int pessoasEntraram;
    private boolean verificaIngresso;
    Scanner leitor = new Scanner(System.in);

    private final String intro = """
            Bem - Vindo ao CineGrach, seleciona uma das opções abaixo: 
            1. Exibir Filme do Dia
            2. Vender Ingresso;
            3. Verificar Entrada;
            """;

    private void exibirFilme(Filme filme){
        System.out.printf(String.format("""
                O filme do dia é: %s
                Data de lançamento: %d
                """, filme.getNomeFilme(), filme.getAnoLancamento()));
    }

    private void venderIngresso(){
        if (ingressosVendidos < 30){

        int venderIngresso;
        System.out.println("Quantos ingressos você deseja vender: ");
        venderIngresso = leitor.nextInt();

        if(venderIngresso+ingressosVendidos < numeroDeCadeiras){
            ingressosVendidos += venderIngresso;
            System.out.println(venderIngresso +" Vendidos com sucesso!");
        }else{
            System.out.println("Sessão atual lotadas!");
        }
    }else {
        System.out.println("Sessão lotada!");
        }


    private void verificarEntardaPessoas(){
        System.out.println("O ingresso é valido: 1 para sim e 0 para não");
        verificaIngresso = leitor.nextBoolean();
        if (ingressosVendidos <= numeroDeCadeiras && verificaIngresso){
            System.out.println("Entrada permitida!");
        } else {
            System.out.println("Ingresso não genuíno, entrada não autorizada");
        }
    };

    };
}

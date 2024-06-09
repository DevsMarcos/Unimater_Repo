import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Classes.InterecaoUsuario;
import Construtores.Defeito;
import Construtores.OrdemDeServico;

public class App {
    public static void main(String[] args){

        InterecaoUsuario novaIntrecao = new InterecaoUsuario();

        Scanner leitor = new Scanner(System.in);
        
        List<OrdemDeServico> listaDeOrdens = new ArrayList<>();

        List<Defeito> defeito = new ArrayList<>();
        defeito.add(new Defeito("Engrenagens da Caixa quebradas", 3200, 3));
        defeito.add(new Defeito("Velas pifadas", 650, 1));
        defeito.add(new Defeito("Bateria Fraca", 350, 1));
        defeito.add(new Defeito("Pastilhas de freio gastas", 430, 2));


        novaIntrecao.InterecaoEscolha(leitor, listaDeOrdens, defeito);
    }


}

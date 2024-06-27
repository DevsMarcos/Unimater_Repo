package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Jogador {

    public List<Carta> cartas;

    public String nome;

    public LogicaRodadas logicaRodadas;



    public Jogador(String nome) {
        this.cartas = new ArrayList<>();
        this.nome = nome;
        this.logicaRodadas = new LogicaRodadas();
    }


    public Carta jogada(Carta cartaNaMesa){
        return jogar(cartaNaMesa);

    };

    private Carta jogar(Carta cartaNaMesa){
       return logicaRodadas.jogar(cartaNaMesa, this.cartas);

    };

public void exibeCartas(){
    cartas.forEach(c -> {
        System.out.print(c + " ");
    });
    System.out.println();
}};


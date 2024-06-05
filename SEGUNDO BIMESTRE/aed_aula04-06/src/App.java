import java.util.ArrayList;
import java.util.List;

import Construtores.ListaDeDefeitos;

public class App {
    public static void main(String[] args){
        List<ListaDeDefeitos> defeito = new ArrayList<>();
        defeito.add(new ListaDeDefeitos("Engrenagens da Caixa quebradas", 3200, 3));
        defeito.add(new ListaDeDefeitos("Velas pifadas", 650, 1));
        defeito.add(new ListaDeDefeitos("Bateria Fraca", 350, 1));
        defeito.add(new ListaDeDefeitos("Pastilhas de freio gastas", 430, 2));
    }
}

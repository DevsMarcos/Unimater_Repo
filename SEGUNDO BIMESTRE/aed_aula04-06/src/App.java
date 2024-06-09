import java.util.ArrayList;
import java.util.List;

import Construtores.Defeito;

public class App {
    public static void main(String[] args){
        List<Defeito> defeito = new ArrayList<>();
        defeito.add(new Defeito("Engrenagens da Caixa quebradas", 3200, 3));
        defeito.add(new Defeito("Velas pifadas", 650, 1));
        defeito.add(new Defeito("Bateria Fraca", 350, 1));
        defeito.add(new Defeito("Pastilhas de freio gastas", 430, 2));
    }
}

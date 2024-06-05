package Construtores;
import java.util.List;

public class OrdemDeServiço {
    public Carro carro;
    public List<ListaDeDefeitos> defeitos;

    public OrdemDeServiço(Carro carro, List<ListaDeDefeitos> deDefeitos) {
        this.carro = carro;
        this.defeitos = deDefeitos;
        
    }

}

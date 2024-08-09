import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setNome("Top Gun: Maverick");
        filme1.setAno(2022);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        Filme f;
        f = new Filme(2024, "Barbie");

        listaDeFilmes.add(filme1);
        listaDeFilmes.add(f);

        f = new Filme();

        listaDeFilmes.add(f);

        System.out.println(listaDeFilmes.size()+ " Filmes");

        for (Filme filme : listaDeFilmes){
            filme.print();
        }


    }
}
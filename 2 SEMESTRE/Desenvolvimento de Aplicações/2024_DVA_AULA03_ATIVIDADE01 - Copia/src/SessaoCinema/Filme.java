package SessaoCinema;

public class Filme {
    private String nomeFilme;
    private int anoLancamento;

    public Filme(int anoLancamento, String nomeFilme) {
        this.anoLancamento = anoLancamento;
        this.nomeFilme = nomeFilme;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }
}

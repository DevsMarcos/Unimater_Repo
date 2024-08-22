package SessaoCinema;

public class Filme {
    private String nomeFilme;
    private int anoLancamento;

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }
}

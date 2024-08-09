public class Filme {
    private int ano;
    private String nome;

    public Filme() {
        this.ano = 2020;
        this.nome = "Não informado";
    }

    public Filme(int ano, String nome) {
        this.ano = ano;
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void print(){
        System.out.println(String.format("""
                Filme %s lançado em %d
                """,
                this.nome,
                this.ano));
    }
}

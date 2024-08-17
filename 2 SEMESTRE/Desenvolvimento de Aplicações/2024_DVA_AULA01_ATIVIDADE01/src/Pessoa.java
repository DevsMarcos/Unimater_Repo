public class Pessoa extends Endereco {
    private int idade;
    private String nome;
    private String endereco;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome() +'\n'+
                "Idade: "+getIdade() + '\n'+
                super.toString();
    }
}

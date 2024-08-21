public class Pessoa {
    private int idade;
    private String nome;
    private String endereco;


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

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


    public String printarInfos() {
        return  "Nome: " + getNome() + '\n' +
                "Idade: " + getIdade() + '\n'+
                "Endereço ->"  +'\n'+
                getEndereco() + '\n'+
            "========================="+'\n'
        ;
    }
}

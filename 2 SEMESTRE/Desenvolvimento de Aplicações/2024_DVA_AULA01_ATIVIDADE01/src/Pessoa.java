public class Pessoa {
    private int idade;
    private String nome;


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

<<<<<<< HEAD

    public String printarInfos() {
        return  "Nome: " + getNome() + '\n' +
                "Idade: " + getIdade() + '\n'+
                "Endereço ->"  +'\n'+
                getEndereco() + '\n'+
            "========================="+'\n'
        ;
=======
    public String printarInformacoes() {
        return "========================"+ '\n'+
                "Nome: "+getNome() +'\n'+
                "Idade: "+getIdade() + '\n'+
                "Endereço: "+getRua()+ '\n'+
                "Número: "+getNumero()+ '\n'+
                "Cidade: "+getCidade()+ '\n'+
                "========================"+ '\n';
>>>>>>> 30f5995c3e71d1930cf881c6e61d09345dc4d9f9
    }
}

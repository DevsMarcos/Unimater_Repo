public class Pessoa extends Endereco {
    private int idade;
    private String nome;

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

    public String printarInformacoes() {
        return "========================"+ '\n'+
                "Nome: "+getNome() +'\n'+
                "Idade: "+getIdade() + '\n'+
                "Endereço: "+getRua()+ '\n'+
                "Número: "+getNumero()+ '\n'+
                "Cidade: "+getCidade()+ '\n'+
                "========================"+ '\n';
    }
}

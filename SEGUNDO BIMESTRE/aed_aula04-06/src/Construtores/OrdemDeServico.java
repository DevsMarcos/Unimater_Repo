package Construtores;

public class OrdemDeServico {
    public Carro carro;
    public Defeito defeito;

    public OrdemDeServico(Carro carro, Defeito defeito) {
        this.carro = carro;
        this.defeito = defeito;
        
    }

    @Override
    public String toString() {
        return 
        "Marca: "+ carro.marca +"\n" + 
        "Modelo: "+ carro.modelo + "\n"+
        "Ano: "+ carro.ano+ "\n"+
        "Defeito: "+defeito.defeito+ "\n"+
        "Valor de Reparo: "+defeito.valor+ "\n"+
        "Tempo de Reparo: "+defeito.tempo+ " Dias"+"\n"+
        "----------------------------------------";
    }
}

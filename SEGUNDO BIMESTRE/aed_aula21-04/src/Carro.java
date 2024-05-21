public class Carro {

    public final String marca;
    public final String modelo;
    public final int ano;
    public final int quilometragem; 
    public final double kmPorLitro;
    public final int potencia;

    public Carro(String marca, String modelo, int ano, int quilometragem, double kmPorLitro, int potencia){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.kmPorLitro = kmPorLitro;
        this.potencia = potencia;
        

    }

    public void exibirDetalhes(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        
    }

}

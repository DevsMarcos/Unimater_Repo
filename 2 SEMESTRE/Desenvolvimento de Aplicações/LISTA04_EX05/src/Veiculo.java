import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {
    private String placa;
    private double combustivel;
    private double capacidadeDoTanque;
    private List <Produto> listaDeProdutos;



    public Veiculo(String placa, int combustivel, int capacidadeDoTanque) {
        this.placa = placa;
        this.combustivel = combustivel;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.listaDeProdutos = new ArrayList<>();

    }

    public Veiculo() {
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
    public void adicionarProduto(Produto produto){
        listaDeProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }


    public String getPlaca() {
        return placa;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public double getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public abstract double abastacer(int quantidadeLitrosAbastecida);

    public double fecharConta(double quantidadeAbastecida){
        double valortotal =0;
        for (Produto produto : listaDeProdutos){
            valortotal += produto.getValotItem();
        }
        valortotal+=calcularCusto(quantidadeAbastecida);
    }
    public abstract double calcularCusto(int quantidadeLitrosAbastecida);
}

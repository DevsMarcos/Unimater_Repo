import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {
    private final int gasolina = 1;
    private final int etanol = 2;
    private final int diesel = 3;
    private int tipoCombustivel;
    private int capacidadeDoTanque;
    private int quantidadeAbastecida;
    private List <Produto> listaDeProdutos;



    public Veiculo(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.listaDeProdutos = new ArrayList<>();

    }

    public Veiculo() {
    }

    public int getQuantidadeAbastecida() {
        return quantidadeAbastecida;
    }

    public void setQuantidadeAbastecida(int quantidadeAbastecida) {
        this.quantidadeAbastecida = quantidadeAbastecida;
    }

    public void adicionarProduto(Produto produto){
        listaDeProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }


    public int getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public double getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }


    public void fecharConta(int quantidadeAbastecida){
        double valorPordutos =0;
        double valorGasolina = 0;
        double valorTotal = 0;
        for (Produto produto : listaDeProdutos){
            valorPordutos += produto.getValotItem();
        }
        valorGasolina = calcularCusto(quantidadeAbastecida);
        valorTotal = valorPordutos + valorGasolina;
        System.out.println("O valor total da conta ficou em R$: "+valorTotal);
    }

    public double calcularCusto(int quantidadeLitrosAbastecida) {
        if (quantidadeLitrosAbastecida > getCapacidadeDoTanque()){
            System.out.println("Quatidade de abastecimento solicitada maior que o tanque do veículo! \n");
            return 0;
        }
        double precoPorLitro = 0;
        switch (getTipoCombustivel()){
            case 1 -> {
                precoPorLitro = 6.10;
            }
            case 2 -> {
                precoPorLitro = 4.10;
            }
            case 3 -> {
                precoPorLitro = 5.93;
            }
            default -> {
                System.out.println("Tipo não identificado tente novamente! \n");
            }
        }
        return quantidadeLitrosAbastecida * precoPorLitro;
    }
}

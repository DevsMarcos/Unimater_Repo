public class Caminhao extends Veiculo {
    private final int gasolina = 1;
    private final int etanol = 2;
    private final int diesel = 3;

//    private final double gasolina = 6.10;
//    private final double etanol = 4.10;
//    private final double diesel = 5.93;

    public Caminhao(String placa, int combustivel, int capacidadeDoTanque) {
        super(placa, combustivel, capacidadeDoTanque);
    }

    public Caminhao() {
    }

    @Override
    public double abastacer(int quantidadeLitrosAbastecida) {
        if (quantidadeLitrosAbastecida > getCapacidadeDoTanque()){
            System.out.println("Quatidade de abastecimento solicitada maior que o tanque do veículo placa: "+getPlaca());
            return 0;
        }
        double total = calcularCusto(quantidadeLitrosAbastecida);
        System.out.println("O valor do abastecimento do veiculo placa: "+getPlaca()+" ficou em R$: "+total);
        return total;
    }

    @Override
    public double calcularCusto(int quantidadeLitrosAbastecida) {
        double precoPorLitro = 0;
        switch (getCombustivel()){
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
                System.out.println("Tipo não identificado tente novamente");
            }
        }
        return quantidadeLitrosAbastecida * precoPorLitro;
    }
}

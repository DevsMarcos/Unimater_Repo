public class Caminhao extends Veiculo {
    private final double gasolina = 6.10;
    private final double etanol = 4.10;
    private final double diesel = 5.93;

    public Caminhao(String placa, String combustivel, int capacidadeDoTanque) {
        super(placa, combustivel, capacidadeDoTanque);
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
        switch (getCombustivel().toLowerCase()) {
            case "gasolina" -> {
                 precoPorLitro = gasolina;
            }
            case "etanol" -> {
                 precoPorLitro = etanol;
            }
            case "disel" -> {
                 precoPorLitro = diesel;
            }
            default -> {
                System.out.println("Tipo não identificado tente novamente");
            }
        }
        return quantidadeLitrosAbastecida * precoPorLitro;
    }
}

public abstract class Veiculo {
    private String placa;
    private String combustivel;
    private int capacidadeDoTanque;


    public Veiculo(String placa, String combustivel, int capacidadeDoTanque) {
        this.placa = placa;
        this.combustivel = combustivel;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public abstract double abastacer(int quantidadeLitrosAbastecida);

    public abstract double calcularCusto(int quantidadeLitrosAbastecida);
}

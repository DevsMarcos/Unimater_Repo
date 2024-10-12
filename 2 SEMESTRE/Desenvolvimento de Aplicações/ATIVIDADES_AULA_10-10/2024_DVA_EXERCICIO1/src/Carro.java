public class Carro implements  Veiculo{
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando...");
    }

    @Override
    public String getTipoCombustivel() {
        return "O tipo de combustível do carro é: Diesel";
    }
}

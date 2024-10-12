public class Moto implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando...");
    }

    @Override
    public String getTipoCombustivel() {
        return "O tipo de combustível da moto é: Gasolina";
    }
}

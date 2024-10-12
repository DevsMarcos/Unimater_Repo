public class Retangulo extends FormaGeometrica{
    private double largura;

    public Retangulo(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return largura*largura;
    }
}

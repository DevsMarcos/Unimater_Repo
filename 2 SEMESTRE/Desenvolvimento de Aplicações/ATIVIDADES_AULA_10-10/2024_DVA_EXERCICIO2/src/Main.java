public class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(3);
        FormaGeometrica triangulo = new Triangulo(4, 6);
        FormaGeometrica retangulo = new Retangulo(4);

        calcularAreaFormas(circulo);
        calcularAreaFormas(triangulo);
        calcularAreaFormas(retangulo);
    }

    public static void calcularAreaFormas(FormaGeometrica forma){
        System.out.println(forma.calcularArea());
    }
}

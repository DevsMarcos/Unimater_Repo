public class Smartphone implements DispositivoConectado{
    @Override
    public void conectarInternet() {
        System.out.println("O celular está conectado na internet!");
    }

    @Override
    public void ligar() {
        System.out.println("O celular está ligando! ");

    }

    @Override
    public void deligar() {
        System.out.println("O celular está desligando!");

    }
}

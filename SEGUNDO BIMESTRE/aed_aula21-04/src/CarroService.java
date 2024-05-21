public class CarroService {

    public void CarroRodado(Carro carro){
        final String ehRodado = " É realmente rodado";
        final String naoEhRodado = " Tá novinho";
        int anosRodados = (2024 - carro.ano);
        int kmRodado = (carro.quilometragem/anosRodados);

        if (kmRodado >= 10000) {
            System.out.println(carro.modelo+ ehRodado);
            System.out.println("----------------------------------------------------------");
        }else{
            System.out.println(carro.modelo + naoEhRodado);
            System.out.println("----------------------------------------------------------");
        }
    }

    public void comparar(Carro carro1, Carro carro2){
        int rodagemCar1 = 2024 - carro1.quilometragem;
        int rodagemCar2 = 2024 - carro2.quilometragem;

        System.out.println((carro1.potencia > carro2.potencia) ? 
        (carro1.modelo + " é mais potente") : (carro2.modelo + " é mais potente")); 
        System.out.println("----------------------------------------------------------");
        System.out.println((carro1.kmPorLitro > carro2.kmPorLitro) ? 
            (carro1.modelo + " é mais econômico") : (carro2.modelo + " é mais econômico")); 
        System.out.println("----------------------------------------------------------");
        System.out.println(((carro1.quilometragem/rodagemCar1) > (carro2.quilometragem/rodagemCar2)) ? 
            (carro1.modelo + " é menos rodado") : (carro2.modelo + " é menos rodado")); 
         System.out.println("----------------------------------------------------------");

    }
}

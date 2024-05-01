package Classes;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadroraDeJuros {
        public void calculoJurosCompostos(Scanner leitor){
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        
        double montate = 0; 
        double capital = 0;
        double taxaDeJuros = 0;
        double tempo = 0;

        capital = recebeCapital(leitor);
        taxaDeJuros = recebePorcento(leitor);
        tempo = recebeTempo(leitor);
        montate = calculo(capital, taxaDeJuros, tempo);

        printar(dinheiro.format(montate));
    }

    private double recebeCapital(Scanner leitor){
        double retorno = 0;

        System.out.println("Informe o valor do capital inicial que você deseja aplicar: ");
        retorno = leitor.nextDouble();

        return retorno;
    }

    private double recebePorcento(Scanner leitor){
        double retorno = 0;
        System.out.println("Informe a taxa de juros anual em porcento: ");
        retorno = leitor.nextDouble();

        return retorno;
    }

    private double recebeTempo(Scanner leitor){
        double retorno = 0;
        System.out.println("Informe por quanto tempo você deseja deixar essse dinheiro aplicado: ");
        retorno = leitor.nextDouble();

        return retorno;
    }

    private double calculo(double capital, double taxaDeJuros, double tempo){
        double montate = capital * (Math.pow((1 + (taxaDeJuros/100)), tempo));
        return montate;
    }

    private void printar(String string){
        System.out.println("O montate final da sua aplicaççao é de: "+string);
    }
    
}

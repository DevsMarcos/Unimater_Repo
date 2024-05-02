package Classes;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
//A classe abaxio possui uma calculadora de juros compostos
public class CalculadroraDeJuros {
    /*O método abaixo controla e recebe os valores para o cáculo, além disso possui um Scanner para 
     * permitir a enrada de dados do usuário
     */
        public void calculoJurosCompostos(Scanner leitor){
        Locale localeBR = new Locale("pt","BR");//Realiza a localização do user para saber a moeda
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);//Faaz a transformação do valor para Real
        
        double montate = 0; //Montate inical
        double capital = 0;//Capital Inicial
        double taxaDeJuros = 0;//taxa de juros inical
        double tempo = 0;//Tmepo inicla

        capital = recebeCapital(leitor);//Atribuição do valor do capital, com o retorno do método
        taxaDeJuros = recebePorcento(leitor);//atribuição do valor de porcentagem, com o retorno do método
        tempo = recebeTempo(leitor);//Atribuição do tempo, com o retorno do método
        montate = calculo(capital, taxaDeJuros, tempo);//calculo do montante, com os valores de retorno anteriores

        printar(dinheiro.format(montate));//Pritn do valor fianl
    }

    //O método abaixo recebe o valor de capital inial do usuario, possui um Scanner para receber o dado
    private double recebeCapital(Scanner leitor){
        double retorno = 0;//Aqui possui uma variáel que fara o retorno do valor, inical em 0;
//Aqui temos a pergunta feita ao usuário
        System.out.println("Informe o valor do capital inicial que você deseja aplicar: ");
        retorno = leitor.nextDouble();//Atribuição do valor digitado pelo user

        return retorno;//Retorno do valor
    }
    
    //O método abaixo recebe o valor de porcentagm anual, possui um Scanner para receber o dado
    private double recebePorcento(Scanner leitor){
        double retorno = 0;//Aqui possui uma variáel que fara o retorno do valor, inical em 0;
        //Aqui temos a pergunta feita ao usuário
        System.out.println("Informe a taxa de juros anual em porcento: ");
        retorno = leitor.nextDouble();//Atribuição do valor digitado pelo user

        return retorno;//Retorno do valor
    }

    //O método abaixo recebe o valor de tempo da aplicação, possui um Scanner para receber o dado
    private double recebeTempo(Scanner leitor){
        double retorno = 0;//Aqui possui uma variáel que fara o retorno do valor, inical em 0;
        //Aqui temos a pergunta feita ao usuário
        System.out.println("Informe por quanto tempo você deseja deixar essse dinheiro aplicado: ");
        retorno = leitor.nextDouble();//Atribuição do valor digitado pelo user

        return retorno;//Retorno do valor
    }
//Abaixo temos um método que realiza o calculo do montante, recebendo as parametros de:
//Capital, Taxa de juros e tempo
    private double calculo(double capital, double taxaDeJuros, double tempo){
        double montate = capital * (Math.pow((1 + (taxaDeJuros/100)), tempo));//Calculo
        return montate;//retoro do valor do cáclulo
    }
//Esse método retorna o valor do cálculo, possui uma Strin como parâmetro
    private void printar(String string){
        System.out.println("O montate final da sua aplicaççao é de: "+string);//Print do valor
    }
    
}

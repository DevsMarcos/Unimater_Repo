package Classes;

import java.util.Scanner;

public class InterecaoUsuario {
//Essa função serve para realizarmos uma intereção com o usuário, referene oa procedimento que o mesmo deseja realizar
//Recebe um Scanner como parâmetro;
    public int PerguntaAoUsuario(Scanner leitor){

        int opcaoEscolhida = 0; //Variável de controle de opção escolhida 
        System.out.println("""
            Escolha uma das opções abaixo para verificarmos os itens da lista:
            1. Filtrar produtos acima de R$50,00
            2. Soma dos valores dos itens de lista
            3. Produto mais caro
            4. Ordenar produtos em ordem alfabética
            5. Aplicar desconto nos produtos
            6. Contar produtos na faixa de R$30,00 a R$100,00
            7. Contar produtos por faixa de preço: acima de R$50,00 e abaixo de R$50,00
            8. Concatenar os produtos da lista
            9. Sair....
            -----------------------------------------------------------------------------------------
                """);

        opcaoEscolhida = leitor.nextInt(); //Definiido o valor 

        return opcaoEscolhida;//Retornarndo o valor a ser utilizada
        
    }
    
}

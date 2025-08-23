import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float dolar, real, cotacao;
        System.out.println("Digite o valor em Dólar: ");
        dolar = entrada.nextFloat();
        System.out.println("Digite a cotação do Dólar: ");
        cotacao = entrada.nextFloat();
        real = dolar * cotacao;
        System.out.println("O valor em Reais é: " + real);
        entrada.close();
    }

//VARIÁVEIS
    // Real dolar, real, cotacao
//INÍCIO
    //Escreva("Digite o valor em Dólar: ");
    //Leia(dolar);
    //Escreva("Digite a cotação do Dólar: ");
    //Leia(cotacao);
    //real = dolar * cotacao;
    //Escreva("O valor em Reais é: " , real);
//FIM
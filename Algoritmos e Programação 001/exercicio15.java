import java.util.Scanner;

public class exercicio15 {
    public static final double VALOR_PREMIO = 780000;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pontos_primeiroLugar, pontos_segundoLugar, pontos_terceiroLugar, total_pontos, porcentagem_primeiroLugar, porcentagem_segundoLugar, porcentagem_terceiroLugar, premio_primeiroLugar, premio_segundoLugar, premio_terceiroLugar;
        System.out.println("Digite a quantidade de pontos obtidos pelo primeiro lugar: ");
        pontos_primeiroLugar = entrada.nextDouble();
        System.out.println("Digite a quantidade de pontos obtidos pelo segundo lugar: ");
        pontos_segundoLugar = entrada.nextDouble();
        System.out.println("Digite a quantidade de pontos obtidos pelo terceiro lugar: ");
        pontos_terceiroLugar = entrada.nextDouble();
        total_pontos = pontos_primeiroLugar + pontos_segundoLugar + pontos_terceiroLugar;
        porcentagem_primeiroLugar = (pontos_primeiroLugar / total_pontos) * 100;
        porcentagem_segundoLugar = (pontos_segundoLugar / total_pontos) * 100;
        porcentagem_terceiroLugar = (pontos_terceiroLugar / total_pontos) * 100;
        premio_primeiroLugar = VALOR_PREMIO * (porcentagem_primeiroLugar / 100);
        premio_segundoLugar = VALOR_PREMIO * (porcentagem_segundoLugar / 100);
        premio_terceiroLugar = VALOR_PREMIO * (porcentagem_terceiroLugar / 100);
        System.out.printf("O prêmio do primeiro lugar é: R$ %.2f\n", premio_primeiroLugar);
        System.out.printf("O prêmio do segundo lugar é: R$ %.2f\n", premio_segundoLugar);
        System.out.printf("O prêmio do terceiro lugar é: R$ %.2f\n", premio_terceiroLugar);
        entrada.close();
    }
}


//CONSTANTES
    // Real VALOR_PREMIO = 780000;
//VARIÁVEIS
    // Real pontos_primeiroLugar, pontos_segundoLugar, pontos_terceiroLugar, total_pontos, porcentagem_primeiroLugar, porcentagem_segundoLugar, porcentagem_terceiroLugar, premio_primeiroLugar, premio_segundoLugar, premio_terceiroLugar;
//INÍCIO
    //Escreva("Digite a quantidade de pontos obtidos pelo primeiro lugar: ");
    //Leia(pontos_primeiroLugar);
    //Escreva("Digite a quantidade de pontos obtidos pelo segundo lugar: ");
    //Leia(pontos_segundoLugar);
    //Escreva("Digite a quantidade de pontos obtidos pelo terceiro lugar: ");
    //Leia(pontos_terceiroLugar);
    //total_pontos = pontos_primeiroLugar + pontos_segundoLugar + pontos_terceiroLugar;
    //porcentagem_primeiroLugar = (pontos_primeiroLugar / total_pontos) * 100;
    //porcentagem_segundoLugar = (pontos_segundoLugar / total_pontos) * 100;
    //porcentagem_terceiroLugar = (pontos_terceiroLugar / total_pontos) * 100;
    //premio_primeiroLugar = VALOR_PREMIO * (porcentagem_primeiroLugar / 100);
    //premio_segundoLugar = VALOR_PREMIO * (porcentagem_segundoLugar / 100);
    //premio_terceiroLugar = VALOR_PREMIO * (porcentagem_terceiroLugar / 100);
    //Escreva("O prêmio do primeiro lugar é: R$ " , premio_primeiroLugar);
    //Escreva("O prêmio do segundo lugar é: R$ " , premio_segundoLugar);
    //Escreva("O prêmio do terceiro lugar é: R$ " , premio_terceiroLugar);
//FIM
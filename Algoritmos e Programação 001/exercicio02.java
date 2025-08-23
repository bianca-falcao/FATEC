import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double largura, comprimento, area;
        System.out.println("Digite a largura: ");
        largura = entrada.nextDouble();
        System.out.println("Digite o comprimento: ");
        comprimento = entrada.nextDouble();
        area = largura * comprimento;
        System.out.println("A area e: " + area + " metros quadrados.");
        entrada.close();
    }
//VARIÁVEIS
    // Real largura, comprimento, area;
//INÍCIO
    //Escreva("Digite a largura: ");
    //Leia(largura);
    //Escreva("Digite o comprimento: ");
    //Leia(comprimento);
    //area = largura * comprimento;
    //Escreva("A area e: " , area , " metros quadrados.");
//FIM
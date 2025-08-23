import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double base, altura, area;
        System.out.println("Digite a base: ");
        base = entrada.nextDouble();
        System.out.println("Digite a altura: ");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.println("A area do triangulo e: " + area + " metros quadrados.");
        entrada.close();
    }
//VARIÁVEIS
    // Real base, altura, area;
//INÍCIO
    //Escreva("Digite a base: ");
    //Leia(base);
    //Escreva("Digite a altura: ");
    //Leia(altura);
    //area = (base * altura) / 2;
    //Escreva("A area do triangulo e: " , area , " metros quadrados.");
//FIM

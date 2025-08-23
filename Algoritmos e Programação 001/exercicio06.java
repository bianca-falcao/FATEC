import java.util.Scanner;

public class exercicio06 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        double raio, area;
        System.out.println("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do circulo e: " + area + " metros quadrados.");
        entrada.close();
    }

//CONSTANTES
    // Real PI = 3.1415;
//VARIÁVEIS
    // Real raio, area;
//INÍCIO
    //Escreva("Digite o raio do circulo: ");
    //Leia(raio);
    //area = PI * raio * raio;
    //Escreva("A area do circulo e: " , area , " metros quadrados.");
//FIM
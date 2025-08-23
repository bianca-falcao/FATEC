import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        float raio, geratriz, area;
        System.out.println("Digite o raio da base do tronco de cone: ");
        raio = entrada.nextFloat();
        System.out.println("Digite a geratriz do tronco de cone: ");
        geratriz = entrada.nextFloat();
        area = (float) (Math.PI * raio * (raio + geratriz));
        System.out.println("A area do tronco de cone e: " + area + " metros quadrados.");
        entrada.close();
    }

//CONSTANTES
    // Real PI = 3.1415;
//VARIÁVEIS
    // Real raio, geratriz, area;
//INÍCIO
    //Escreva("Digite o raio da base do tronco de cone: ");
    //Leia(raio);
    //Escreva("Digite a geratriz do tronco de cone: ");
    //Leia(geratriz);
    //area = PI * raio * (raio + geratriz);
    //Escreva("A area do tronco de cone e: " , area , " metros quadrados.");
//FIM
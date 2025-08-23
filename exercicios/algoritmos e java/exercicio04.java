import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        double baseMaior, baseMenor, altura, area;
        System.out.println("Digite a base maior: ");
        baseMaior = entrada.nextDouble();
        System.out.println("Digite a base menor: ");
        baseMenor = entrada.nextDouble();
        System.out.println("Digite a altura: ");
        altura = entrada.nextDouble();
        area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A area do trapezio e: " + area + " metros quadrados.");
        entrada.close();
    }
//VARIÁVEIS
    // Real baseMaior, baseMenor, altura, area;
//INÍCIO
    //Escreva("Digite a base maior: ");
    //Leia(baseMaior);
    //Escreva("Digite a base menor: ");
    //Leia(baseMenor);
    //Escreva("Digite a altura: ");
    //Leia(altura);
    //area = ((baseMaior + baseMenor) * altura) / 2;
    //Escreva("A area do trapezio e: " , area , " metros quadrados.")
//FIM
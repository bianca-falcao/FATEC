import java.util.Scanner;

public class exercicio08 {

    public static final double PESO1 = 0.5;
    public static final double PESO2 = 0.3;
    public static final double PESO3 = 0.2;
    public static final double MEDIA_APROVACAO = 6.0;

    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);

        double nota1, nota2, nota3, mediaPonderada;

        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();

        mediaPonderada = (nota1 * PESO1) + (nota2 * PESO2) + (nota3 * PESO3);

        if (mediaPonderada >= MEDIA_APROVACAO) {
            System.out.println("A média ponderada é: " + mediaPonderada + " - Aprovado");
        } 
        
        else {
            System.out.println("A média ponderada é: " + mediaPonderada + " - Reprovado");
        }

        entrada.close();   
    }
}

//CONSTANTES
    // Real PESO1 = 0.5, PESO2 = 0.3, PESO3 = 0.2, MEDIA_APROVACAO = 6.0;
//VARIÁVEIS
    // Real nota1, nota2, nota3, mediaPonderada
//INÍCIO
    //Escreva("Digite a primeira nota: ");
    //Leia(nota1);
    //Escreva("Digite a segunda nota: ");
    //Leia(nota2);
    //Escreva("Digite a terceira nota: ");
    //Leia(nota3);
    //mediaPonderada = (nota1 * PESO1) + (nota2 * PESO2) + (nota3 * PESO3);
        //Se mediaPonderada >= MEDIA_APROVACAO
        //Entao
        //Escreva("A media ponderada e: " , mediaPonderada, " - Aprovado");
        //Senao
        //Escreva("A media ponderada e: " , mediaPonderada, " - Reprovado");
    //FIM SE
//FIM
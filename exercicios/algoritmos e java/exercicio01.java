import java.util.Scanner;

public class exercicio01 {
    public static  void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        double num1, num2, media;
        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextDouble();
        media = (num1 + num2) / 2;
        System.out.println("A media entre " + num1 + " e " + num2 + " e: " + media);
        entrada.close();
    }
}  
//VARIÁVEIS
    // Real num1, num2, media;
//INÍCIO
    //Escreva("Digite o primeiro numero: ");
    //Leia(num1);
    //Escreva("Digite o segundo numero: ");
    //Leia(num2);
    //media = (num1 + num2) / 2;
    //Escreva("A media entre " , num1 , " e " , num2 , " e: " , media);
//FIM
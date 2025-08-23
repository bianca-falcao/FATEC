import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, dobro, metade, quadrado, cubo;
        System.out.println("Digite um numero inteiro: ");
        numero = entrada.nextInt();
        dobro = numero * 2;
        metade = numero / 2;
        quadrado = (int)Math.pow(numero, 2);
        cubo = (int)Math.pow(numero, 3);
        System.out.println("O dobro de " + numero + " e: " + dobro);
        System.out.println("A metade de " + numero + " e: " + metade);
        System.out.println("O quadrado de " + numero + " e: " + quadrado);
        System.out.println("O cubo de " + numero + " e: " + cubo);
        entrada.close();
    } 
//VARIÁVEIS
    // Real numero, dobro, metade, quadrado, cubo
//INÍCIO
    //Escreva("Digite um numero inteiro: ")
    //Leia(numero)
    //dobro = numero * 2
    //metade = numero / 2
    //quadrado = numero * numero
    //cubo = numero * numero * numero
    //Escreva("O dobro de " + numero + " e: " + dobro)
    //Escreva("A metade de " + numero + " e: " + metade)
    //Escreva("O quadrado de " + numero + " e: " + quadrado)
    //Escreva("O cubo de " + numero + " e: " + cubo)
//FIM
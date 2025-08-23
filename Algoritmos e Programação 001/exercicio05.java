import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double raio, altura, volume;
        System.out.println(" Digite o raio do cilindro: ");
        raio = entrada.nextDouble();
        System.out.println(" Digite a altura do cilindro: ");
        altura = entrada.nextDouble();
        volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println(" O volume do cilindro e: " + volume + " metros cubicos.");
        entrada.close();
    }

}

//CONSTANTES
    // Real PI = 3.1415;
//VARIÁVEIS
    // Real volume, raio, altura;
//INICIO
    //Escreva(" Digite o raio do cilindro: ");
    //Leia(raio);
    //Escreva(" Digite a altura do cilindro: ");
    //Leia(altura);
    //volume = PI * raio*raio * altura;
    //Escreva(" O volume do cilindro é: " + volume + " metros cubicos.");
//FIM
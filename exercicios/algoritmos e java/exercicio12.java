import java.util.Scanner;

public class exercicio12 {

    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        double farenheit, celsius;
        System.out.println("Digite a temperatura em Fahrenheit: ");
        farenheit = entrada.nextDouble();
        celsius = (farenheit - 32) / 1.8;
        System.out.println("A temperatura em Celsius é: " + celsius);
        entrada.close();
    }
}

//VARIÁVEIS
    // Real farenheit, celsius
//INÍCIO
    //Escreva("Digite a temperatura em Fahrenheit: ");
    //Leia(farenheit);
    //celsius = (farenheit - 32) / 1.8;
    //Escreva("A temperatura em Celsius é: " , celsius);
//FIM
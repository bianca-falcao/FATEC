import java.util.Scanner;

public class exercicio09 {
    public static void main  (String[] args){
        Scanner entrada = new Scanner(System.in);
        double x, y;
        System.out.println("Digite o valor de x: ");
        x = entrada.nextDouble();
        System.out.println("Digite o valor de y: ");
        y = entrada.nextDouble();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("O valor de x é " + x + " e o valor de y é " + y);
        entrada.close();
    }    
//VARIÁVEIS
    // Real x, y;
//INÍCIO
    //Escreva ("Digite o valor de x: ")
    //Leia (x)
    //Escreva ("Digite o valor de y: ")
    //Leia (y)
    // x = x + y
    // y = x - y
    // x = x - y
    //Escreva ("O valor de x é ", x, " e o valor de y é ", y)
//FIM
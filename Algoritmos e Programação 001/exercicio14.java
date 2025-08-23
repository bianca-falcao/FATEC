import java.util.Scanner;

public class exercicio14 {

    public static final double VALOR_HORA = 3;
    public static final double DESCONTO_INSS = 0.08;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double horasTrabalhadas, inss, salarioBruto, salarioLiquido;
        System.out.println("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = entrada.nextDouble();
        salarioBruto = horasTrabalhadas * VALOR_HORA;
        inss = salarioBruto * DESCONTO_INSS;
        salarioLiquido = salarioBruto - inss;
        System.out.println("O salário bruto é: " + salarioBruto + " reais.");
        System.out.println("O desconto do INSS é: " + inss + " reais.");
        System.out.println("O salário líquido é: " + salarioLiquido + " reais.");
        entrada.close();
    }


//CONSTANTES
    // Real VALOR_HORA = 3, DESCONTO_INSS = 0.08;
//VARIÁVEIS
    // Real horasTrabalhadas, inss, salarioBruto, salarioLiquido;
//INÍCIO
    //Escreva("Digite o número de horas trabalhadas: ");
    //Leia(horasTrabalhadas);
    //salarioBruto = horasTrabalhadas * VALOR_HORA;
    //inss = salarioBruto * DESCONTO_INSS;
    //salarioLiquido = salarioBruto - inss;
    //Escreva("O salário bruto é: " , salarioBruto + " reais.");
    //Escreva("O desconto do INSS é: " , inss + " reais.");
    //Escreva("O salário líquido é: " , salarioLiquido + " reais.");
//FIM
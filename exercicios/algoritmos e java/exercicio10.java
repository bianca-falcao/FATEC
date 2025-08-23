import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valorInicial, valorFinal, taxaJuros;
        System.out.println("Digite o valor inicial do investimento: ");
        valorInicial = entrada.nextFloat();
        System.out.println("Digite a taxa de juros (em porcentagem): ");
        taxaJuros = entrada.nextFloat();
        valorFinal = valorInicial * (1 + taxaJuros / 100);
        System.out.println("O valor final do investimento é: " + valorFinal);
        entrada.close();
    }
}


//VARIÁVEIS
    // Real valorInicial, valorFinal, taxaJuros
//INÍCIO
    //Escreva("Digite o valor inicial do investimento: ")
    //Leia(valorInicial)
    //Escreva("Digite a taxa de juros (em porcentagem): ")
    //Leia(taxaJuros)
    //valorFinal = valorInicial * (1 + taxaJuros / 100)
    //Escreva("O valor final do investimento é: " + valorFinal)
//FIM
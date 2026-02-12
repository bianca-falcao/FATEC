//arquivos de cabeçalho

#include <locale.h>
#include <stdio.h>

int main()
{
    // Configura localidade para português do Brasil
    
    setlocale(LC_ALL, "Portuguese_Brazil");
    
	//Declarações (e inicializações) de variáveis
	int x1 = 5;
	int x2 = -8;
	float f1 = -55.2;
	float f2 = -3.79;
	double d1 = 52.18;
	double d2 = -3.79;
	char c1 = 'A';
	char c2 = 'B';
	
	//Exibição de informações
	
	printf("Tipos Primitivos\n");
	printf("----------------\n\n");
	printf("int x1 - conteúdo %10d - qtd. bytes %10d - endereço %10p\n", x1, sizeof(x1), &x1);
	printf("----------------\n\n");
	printf("int x2 - conteúdo %10d - qtd. bytes %10d - endereço %10p\n", x2, sizeof(x2), &x2);
	printf("----------------\n\n");
	printf("float f1 - conteúdo %10f - qtd. bytes %10f - endereço %10p\n", f1, sizeof(f1), &f1);
	printf("----------------\n\n");
	printf("float f2 - conteúdo %10f - qtd. bytes %10f - endereço %10p\n", f2, sizeof(f2), &f2);
	printf("----------------\n\n");
	printf("double d1 - conteúdo %10f - qtd. bytes %10f - endereço %10p\n", d1, sizeof(d1), &d1);
	printf("----------------\n\n");
	printf("double d2 - conteúdo %10f - qtd. bytes %10f - endereço %10p\n", d2, sizeof(d2), &d2);
	printf("----------------\n\n");
	printf("char c1 - conteúdo %10c - qtd. bytes %10c - endereço %10p\n", c1, sizeof(c1), &c1);
	printf("----------------\n\n");
	printf("char c2 - conteúdo %10c - qtd. bytes %10c - endereço %10p\n", c2, sizeof(c2), &c2);
	
	//finalização
	return 0;
}
#include <stdio.h>
#include <string.h>
#include <locale.h>
#include "arquivo.h"
int main(){
	int i, n, x = 0;
	setlocale(LC_ALL, "portuguese");
	int opcao;
	char nomearq[50];
	FILE *arq;
	printf("Digite a op��o desejada:\n");
	printf("1 - Abrir um arquivo para grava��o \n");
	printf("2 - Abrir um arquivo para atualizar no final \n");
	scanf("%d", &opcao);
	fflush(stdin);
	printf("Digite o nome do arquivo: ");
	gets(nomearq); //scanf("%[^\n]s", nomearq);
	switch(opcao){
		case 1: gravar(arq,nomearq);
			break;
		case 2: alterar_no_final(arq, nomearq);
			break;	
		case 3: ler(arq, nomearq);
			break;
		case 4: ler_formatado(arq, nomearq);
			break;		
	}
	
	return  0;
}

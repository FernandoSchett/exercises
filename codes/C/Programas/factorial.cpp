#include <stdio.h>

int fatorial(int n) {
    int resultado = 1;
    for (int i = 1; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
}

int main() {
    int numero, resultado;
    
    printf("Digite um n�mero inteiro positivo: ");
    scanf("%d", &numero);
    
    resultado = fatorial(numero);
    
    printf("O fatorial de %d � %d", numero, resultado);
    
    return 0;
}


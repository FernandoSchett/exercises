#include <stdio.h>

int fatorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * fatorial(n-1);
    }
}

int main() {
    int numero, resultado;
    
    printf("Digite um n�mero inteiro positivo: ");
    scanf("%d", &numero);
    
    resultado = fatorial(numero);
    
    printf("O fatorial de %d � %d", numero, resultado);
    
    return 0;
}


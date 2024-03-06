#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>
#include <string.h>

char determinarCategoriaNadador(int x) {
    char y;
    
    if (x >= 5 && x <= 7) {
        y = 'A';
    } else if (x >= 8 && x <= 10) {
        y = 'B';
    } else if (x >= 11 && x <= 13) {
        y = 'C';
    } else if (x >= 14 && x <= 17) {
        y = 'D';
    } else {
        y = 'E';
    }

    return y;
}

int main() {
    setlocale(LC_ALL, "Portuguese");

    int idade;
    char categoria;
    
    printf("Digite a idade do nadador: ");
    scanf("%d", &idade);
    
    categoria=determinarCategoriaNadador(idade);
    
    printf("A categoria do nadador é: %c", categoria);
    
    return 0;
}
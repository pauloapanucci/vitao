#include <stdio.h>

// Nessa funcao forLoop2 vamos printar pulando de 2 em dois
// valor do array na posicao 0: 1
// valor do array na posicao 2: 3
// valor do array na posicao 4: 5
void forLoop2(int* array, int arraySize) {
    printf("EXECUTANDO FUNCAO forLoop2\n");
}

// Nessa funcao forLoop vamos printar todos os valores
// valor do array na posicao 0: 1
// valor do array na posicao 1: 2
// valor do array na posicao 2: 3
// valor do array na posicao 3: 4
// valor do array na posicao 4: 5
// valor do array na posicao 5: 6
void forLoop(int* array, int arraySize) {
    printf("EXECUTANDO FUNCAO forLoop\n");
}

// Nesse exercicio, vamos escrever uma função que anda pelo array e printa 
// a posicao e o valor naquela posicao
int main(void) {
    int teste1[6] = {1, 2, 3, 4, 5, 6};
    forLoop(teste1, 6) ;
    forLoop2(teste1, 6) ;
}
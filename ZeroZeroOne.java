public class ZeroZeroOne {
    // Nessa funcao forLoop2 vamos printar pulando de 2 em dois
    // valor do array na posicao 0: 1
    // valor do array na posicao 2: 3
    // valor do array na posicao 4: 5
    private static void forLoop2(int[] arr) {
        System.out.println("EXECUTANDO FUNCAO forLoop2");
    }

    // Nessa funcao forLoop vamos printar todos os valores
    // valor do array na posicao 0: 1
    // valor do array na posicao 1: 2
    // valor do array na posicao 2: 3
    // valor do array na posicao 3: 4
    // valor do array na posicao 4: 5
    // valor do array na posicao 5: 6
    private static void forLoop(int[] arr) {
        System.out.println("EXECUTANDO FUNCAO forLoop");
    }

    // Nesse exercicio, vamos escrever uma função que anda pelo array e printa 
    // a posicao e o valor naquela posicao
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        forLoop(arr);
        forLoop2(arr);
    }
}
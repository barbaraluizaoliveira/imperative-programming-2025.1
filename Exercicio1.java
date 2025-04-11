public class Exercicio1 {
    public static void main(String[] args) {
        // (a) Declarar o vetor e atribuir os valores
        int[] A = {1, 0, 5, -2, -5, 7};

        // (b) Somar os valores das posições 0, 1 e 5
        int soma = A[0] + A[1] + A[5];
        System.out.println("Soma de A[0] + A[1] + A[5] = " + soma);

        // (c) Modificar o valor da posição 4 para 100
        A[4] = 100;

        // (d) Mostrar todos os valores do vetor A, um por linha
        System.out.println("Valores no vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}

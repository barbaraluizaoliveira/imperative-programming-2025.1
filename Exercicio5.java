import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int quantidadePares = 0;
        Scanner scanner = new Scanner(System.in);

        // Leitura dos 10 valores inteiros
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();

            // Verifica se é par
            if (vetor[i] % 2 == 0) {
                quantidadePares++;
            }
        }

        // Exibe a quantidade de números pares
        System.out.println("Quantidade de números pares: " + quantidadePares);

        scanner.close();
    }
}

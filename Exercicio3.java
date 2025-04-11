import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double[] numeros = new double[10];      // Vetor original
        double[] quadrados = new double[10];    // Vetor com os quadrados
        Scanner scanner = new Scanner(System.in);

        // Leitura dos números reais
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número real: ");
            numeros[i] = scanner.nextDouble();
            quadrados[i] = numeros[i] * numeros[i]; // Calcula o quadrado
        }

        // Impressão dos vetores
        System.out.println("\nValor original   |   Quadrado");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%14.2f   |   %8.2f\n", numeros[i], quadrados[i]);
        }

        scanner.close();
    }
}

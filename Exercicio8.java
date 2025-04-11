import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        Scanner scanner = new Scanner(System.in);

        // Leitura dos 6 números inteiros
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Impressão em ordem inversa
        System.out.println("\nValores em ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}

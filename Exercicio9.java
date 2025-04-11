import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        // Leitura dos 6 números pares
        while (i < numeros.length) {
            System.out.print("Digite o " + (i + 1) + "º número PAR: ");
            int valor = scanner.nextInt();

            if (valor % 2 == 0) {
                numeros[i] = valor;
                i++;
            } else {
                System.out.println("Valor inválido! Por favor, digite um número par.");
            }
        }

        // Impressão em ordem inversa
        System.out.println("\nValores pares em ordem inversa:");
        for (int j = numeros.length - 1; j >= 0; j--) {
            System.out.println(numeros[j]);
        }

        scanner.close();
    }
}

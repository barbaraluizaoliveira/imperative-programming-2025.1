import java.util.Scanner;
import java.util.Arrays;

public class VetoresSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];

        // leitura do vetor A
        System.out.println("Digite 5 números para o vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = sc.nextInt();
        }

        // leitura do vetor B
        System.out.println("\nDigite 5 números para o vetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = sc.nextInt();
        }

        // construção do vetor C
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }

        // impressão dos três vetores
        System.out.println("\nVetor A: " + Arrays.toString(a));
        System.out.println("Vetor B: " + Arrays.toString(b));
        System.out.println("Vetor C (soma): " + Arrays.toString(c));

        sc.close();
    }
}

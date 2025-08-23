import java.util.Scanner;
import java.util.Arrays;

public class VetoresIntercalados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[20];
        int[] b = new int[20];
        int[] c = new int[40]; 

      
        System.out.println("Digite 20 números para o vetor A:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = sc.nextInt();
        }

       
        System.out.println("\nDigite 20 números para o vetor B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = sc.nextInt();
        }

    
        int j = 0; 
        for (int i = 0; i < a.length; i++) {
            c[j++] = a[i]; 
            c[j++] = b[i]; 
        }

        // imprime o vetor C
        System.out.println("\nVetor C (intercalado): " + Arrays.toString(c));

        sc.close();
    }
}

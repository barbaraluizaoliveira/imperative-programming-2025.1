import java.util.Scanner;

public class VetorPar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("digite o " + (i + 1) + "º numero");
            numeros[i] = sc.nextInt();
        }

        System.out.print("numeros pares digitados: ");
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " ");
            }
        }
        sc.close();
    }
}

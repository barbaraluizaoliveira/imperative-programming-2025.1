import java.util.Scanner;
import java.util.Arrays;

public class LerDez {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int[] numeros = new int[10];

      for(int i = 0; i < numeros.length; i++){
        System.out.println("digite o" + (i + 1) + "º numero: ");
        numeros[i] = sc.nextInt();

        System.out.println("Números digitados: " + Arrays.toString(numeros));
     
      }
      sc.close();
    }
}


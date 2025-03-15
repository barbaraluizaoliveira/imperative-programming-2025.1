import java.util.Scanner;

public class Aula13032025 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in) ;
    System.out.print("Quantas notas deseja inserir? ");
        int quantidade = scanner.nextInt();
        double[] notas = new double[quantidade];
        double soma = 0;

        for(int i = 0; i < notas.length; i +=1){
          System.out.print("digite a "  + (i + 1) + " nota: ");
          notas[i] = scanner.nextDouble();
          soma += notas[i];
        }

        double media = soma/quantidade;
        System.out.print("a media: " + media);

        scanner.close();
        
  }
}

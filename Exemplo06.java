import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = {7.5, 8.0, 6.3, 9.2, 5.0}; // Array de notas para busca
        double nota;

        System.out.print("Digite uma nota (ou um número negativo para sair): ");
        nota = input.nextDouble();

        while (nota >= 0.0) {
            int pos = busca(notas, nota);

            if (pos != -1) {
                System.out.println("A nota " + nota + " foi encontrada na posição " + pos + ".");
            } else {
                System.out.println("A nota " + nota + " não foi encontrada.");
            }

            System.out.print("\nDigite outra nota (ou um número negativo para sair): ");
            nota = input.nextDouble();
        }

        System.out.println("Fim do programa!");
        input.close();
    }

    // Método para buscar a nota no array
    public static int busca(double[] v, double x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i; // Retorna a posição da nota encontrada
            }
        }
        return -1; // Retorna -1 se a nota não for encontrada
    }
}

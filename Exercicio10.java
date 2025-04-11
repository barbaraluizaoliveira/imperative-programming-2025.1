import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double[] notas = new double[15];
        double soma = 0;
        Scanner scanner = new Scanner(System.in);

        // Leitura das 15 notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Cálculo da média geral
        double media = soma / notas.length;

        // Impressão da média
        System.out.printf("\nMédia geral da turma: %.2f\n", media);

        scanner.close();
    }
}

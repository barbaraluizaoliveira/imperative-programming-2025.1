public class Exemplo05 {
  public static void main(String[] args) {
    String jogador1 = "João";
        String jogador2 = "Maria";
        
        // Inserir os pontos diretamente no código
        int pontosJogador1 = 10;  // Alterar o ponto de João aqui
        int pontosJogador2 = 8;   // Alterar o ponto de Maria aqui
        
        // Exibir os pontos de cada jogador
        System.out.println(jogador1 + " tem " + pontosJogador1 + " pontos.");
        System.out.println(jogador2 + " tem " + pontosJogador2 + " pontos.");
        
        // Determinar quem ganhou
        if (pontosJogador1 > pontosJogador2) {
            System.out.println(jogador1 + " venceu a partida!");
        } else if (pontosJogador2 > pontosJogador1) {
            System.out.println(jogador2 + " venceu a partida!");
        } else {
            System.out.println("A partida terminou empatada!");
        }
  }
}
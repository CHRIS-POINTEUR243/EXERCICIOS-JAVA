import java.util.Random;
import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;

public class jogoAdevinha {
    public static void main(String[] args) {
        try {
            Random novo = new Random(); // gerar numero aleatorio
            Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
            int aleatório = novo.nextInt(10) + 1;
            int jogador; // variavel que implement o jogador
            int tentativa = 0; // variavel de tentativa de jogadr

            System.out.println("ESCOLHA UM NUMERO DE 1 ATE 10 ");
            do {
                tentativa++;
                System.out.println("jogador digite teu numero : ");
                jogador = entrada.nextInt();
                if (tentativa == 5) {
                    System.out.println("YOU LOSE!!!");
                    break;
                }

            } while (aleatório != jogador);

            if (aleatório == jogador) {
                System.out.println("Parabens você ganhou!!!" + "teve " + tentativa + " no jogo");
            }
        } catch (InputMismatchException e) {
            System.out.println("TUDO TEM QUE SER NUMERO");
        }
    }
}

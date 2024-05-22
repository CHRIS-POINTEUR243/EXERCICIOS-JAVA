import java.util.Random;// bibioteca que chama numero aleatorio
import java.util.Scanner;// bibioteca para entrada de escanner
public class jogoAdevinha {
    /*Exercício 4: Jogo de Adivinhação
Crie um programa que gere um número aleatório entre 1 e 10 e permita que o
usuário tente adivinhar o número. O programa deve dar dicas se o número é maior
ou menor até que o usuário acerte. jogador tem 5 tentativas*/

    public static void main(String[] args) {
       Random novo = new Random();// gerar numero aleatorio 
       Scanner entrada = new Scanner(System.in);
       int aleatório = novo.nextInt(10) +1;
       int jogador;// variavel que implement o jogador 
       int tentativa =0;// variavel de tentativa de jogadr 

       System.out.println("ESCOLHA UM NUMERO DE 1 ATE 10 ");
       do{
        tentativa++;
        System.out.println("jogador digite teu numero : ");
        jogador = entrada.nextInt();
        if(tentativa == 5){
            System.out.println("YOU LOSE!!!");
            break;
        }

       }while(aleatório != jogador);
       
       if(aleatório == jogador){
            System.out.println("Parabens você ganhou!!!"+ "teve " + tentativa + " no jogo");
       }
    }
}

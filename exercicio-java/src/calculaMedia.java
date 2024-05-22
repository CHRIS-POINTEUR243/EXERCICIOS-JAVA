import java.util.Scanner;
public class calculaMedia {
    /*Exercício 3: Calculadora de Média de Notas
Crie um programa que solicite ao usuário a quantidade de notas, leia as notas e
calcule a média. */
    public static void main(String[] args) {
        
        Scanner novo = new Scanner(System.in);
        int qtd_nota;
        double nota;
        double media =0;

        System.out.println("digite quntidade das notas");
        qtd_nota = novo.nextInt();

        for(int i=1; i<=qtd_nota; i++){
            System.out.println("digite nota "+i);
            nota = novo.nextDouble();
            media += nota;
        }
        media = media/qtd_nota;
        System.out.println("media eh: "+media);
    }
}

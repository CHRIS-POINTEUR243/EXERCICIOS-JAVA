import java.util.Scanner;
public class numeroPrimo {
    /*Exercício 2: Verificação de Número Primo
Crie um programa que solicite ao usuário um número e verifique se ele é primo ou
não. */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        int numero;
        System.out.println("Digite numero : ");
        numero = entrada.nextInt();

        if((numero %2 ==0 || numero %3 ==0) || (numero <=1)){// meu proprio algoritmo para achar numero primo 
            if(numero ==2 || numero ==3){
                System.out.println("Numero é primo");
            }
            else{
                System.out.println("Numero não é primo");
            }
        }
        else{
            System.out.println("Numero é primo");
        }
    }
    
}

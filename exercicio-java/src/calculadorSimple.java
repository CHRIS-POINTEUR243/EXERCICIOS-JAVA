import java.util.Scanner;

public class calculadorSimple {
    /*Exercício 1: Calculadora Simples
Crie um programa que funcione como uma calculadora simples. O programa deve
solicitar ao usuário dois números é uma operação (adição, subtração, multiplicação
ou divisão) e, em seguida, exibir o resultado.
 */
    public static void main(String[] args) throws Exception {
       
       Scanner entrada = new Scanner (System.in); // usado de scanner para entrada de valores 
       
       int num1;
       int num2;
       int resultado=0;
       int operacao;
       System.out.println("digite primeiro numero: ");
       num1 = entrada.nextInt();
       System.out.println("digite segundo numero: ");
       num2 = entrada.nextInt();

       System.out.println("DIGITE AS OPÇOES SEGUINTES\n"+
       "1. adiçao\n" +
       "2. subtração\n" +
       "3. multiplicação\n" + 
       "4. divisão\n");
        System.out.println("Digite sua operação: ");
        operacao = entrada.nextInt();

       switch(operacao){

        case 1: resultado = num1 + num2;
                break;
        case 2: resultado = num1 - num2;
                break;
        case 3: resultado = num1 * num2;
                break;
        case 4: if(num2 == 0)
                {
                   System.out.println("divisão imposivel ");
                }
                else
                {
                    resultado = num1 / num2;
                }
                break;
        default : System.out.println("operação digitado não existe ");
       }

       System.out.println(resultado);
    }
}

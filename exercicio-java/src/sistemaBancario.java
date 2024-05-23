import java.util.Scanner;

public class sistemaBancario {
    /*
     * Exercício 5: Sistema Bancário - Depósito e Saque
     * Crie um programa que simule um sistema bancário simples. O programa deve
     * permitir ao usuário:
     * Depositar dinheiro na conta.
     * Sacar dinheiro da conta.
     * Exibir o saldo atual.
     * Use um loop para permitir múltiplas operações até que o usuário decida sair.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salde = 0;
        double saque = 0;
        double valor;
        int opcao;

        do {
            System.out.println("DIGITE OPÇÃO DESEJADA\n" + "1. DEPOSITO\n" + "2. SAQUE\n" + "SAIR");
            System.out.println("DIGITE OPÇÂO: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("DIGITE O VALOR DO SEU DEPOSITO ");
                    valor = entrada.nextDouble();
                    salde = salde + valor;
                    break;
                case 2:
                    System.out.println("DIGITE O VALOR DO SEU SAQUE");
                    valor = entrada.nextDouble();
                    if (salde < valor) {
                        System.out.println("\n");
                        System.out.println("*** SALDE INSUFICIANTE ***");
                    } else {
                        salde = salde - valor;
                    }
                    break;
                case 0: System.out.println("OBRIGADO POR UTILIZAR NOSSA APLICATIVO DO BANCO ATE MAIS!!!");
                        break;
                default: System.out.println("\n");
                System.out.println("OPOÇÂO DIGITADO NÂO EXISTE ");
            }
            System.out.println("\n");
            System.out.println("### SALDE ATUAL: " + salde + " ###\n");
        } while (opcao != 0);
    }
}

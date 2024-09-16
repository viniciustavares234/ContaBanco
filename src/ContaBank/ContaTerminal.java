package ContaBank;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception  {
        Scanner scanner = new Scanner(System.in);

        // Variáveis de conta e cliente
        int numeroConta;
        String agencia ;
        String nomeCliente;
        double saldo ;

        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor digite o numero da sua Agencia");
        agencia = scanner.nextLine();

        System.out.println("Por favor digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o seu saldo: ");
        saldo = scanner.nextDouble();


        scanner.close();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque";
        System.out.println(mensagem);
    }
}

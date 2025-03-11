import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o numero: ");
        int numero = scan.nextInt();
        System.out.println("Por favor, digite o agencia: ");
        String agencia = scan.next();
        System.out.println("Por favor, digite o Nome do cliente: ");
        String nomeCliente = scan.next();
        System.out.println("Por favor, digite o Saldo: ");
        double saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação de um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação do número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt(); // Lê um número inteiro para a conta

        // Solicitação do número da agência
        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine(); // Limpa o buffer
        String agencia = scanner.nextLine(); // Lê uma string para a agência

        // Solicitação do nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine(); // Lê uma string para o nome do cliente

        // Solicitação do saldo da conta
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble(); // Lê um valor decimal para o saldo

        // Fechamento do objeto Scanner
        scanner.close();

        // Exibição da mensagem de confirmação usando concatenação de strings
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem); // Exibe a mensagem final
    }
}

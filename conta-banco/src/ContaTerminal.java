import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criação do Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine(); // Consumir a quebra de linha após o nextInt()
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem de confirmação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                        + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " 
                        + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fechar o Scanner
        scanner.close();
    }
}

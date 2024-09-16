import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Exibir as mensagens para o nosso usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();

        // Definir o saldo por padrão
        double saldo = 100.0;

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nossa agência " + 
                           agencia + ", conta número " + numeroConta + " com saldo de R$" + saldo + " disponível para saque.");
        
        scanner.close();
    }
}

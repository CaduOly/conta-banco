import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem-vindo à Agência virtual!");

        int numero = obterNumeroConta(scanner);
        String agencia = obterAgencia(scanner);
        String nome = obterNome(scanner);
        String sobrenome = obterSobrenome(scanner);
        double saldo = obterSaldo(scanner);

        String nomeCliente = nome + " " + sobrenome;

       String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + String.format("%.2f", saldo) + " já está disponível para saque.";

        System.out.println(mensagem);
        scanner.close();
    }

    /**
     * 
     * Este método é responsável por receber o número da conta do úsuario atráves do Scanner
     * e retorna-lo.
     * 
     * @param scanner Um objeto Scanner para receber a entrada do usuário.
     * @return O número da conta fornecido pelo usuário.
     */
    private static int obterNumeroConta(Scanner scanner) {
        System.out.println("Por favor, digite o número da conta (0000):");
        return scanner.nextInt();
    }

    /**
     * Este método é responsável por receber o número da agência do úsuario
     * e retorna-lo.
     * 
     * @param scanner Um objeto Scanner para receber a entrada do usuário.
     * @return O número da agência fornecido pelo usuário.
     */
    private static String obterAgencia(Scanner scanner) {
        System.out.println("e o número da Agência (000-0):");
        return scanner.next();
    }

    /**
     * Este método é responsável por receber o nome do úsuario
     * e retorna-lo.
     * 
     * @param scanner Um objeto Scanner para receber a entrada do usuário.
     * @return O nome fornecido pelo usuário.
     */
    private static String obterNome(Scanner scanner) {
        System.out.println("Por favor, Digite seu primeiro nome:");
        return scanner.next();
    }

    /**
     * 
     * Este método é responsável por receber o sobrenome do úsuario
     * e retorna-lo.
     * 
     * @param scanner Um objeto Scanner para receber a entrada do usuário.
     * @return O sobrenome fornecido pelo usuário.
     */
    private static String obterSobrenome(Scanner scanner) {
        System.out.println("Digite seu sobrenome:");
        return scanner.next();
    }

    /**
     * 
     * Este método é responsável por receber o saldo do úsuario
     * e retorna-lo.
     * 
     * @param scanner Um objeto Scanner para receber a entrada do usuário.
     * @return o Saldo fornecido pelo usuário.
     */
    private static double obterSaldo(Scanner scanner) {
        System.out.println("Agora insira seu saldo (999.99):");
        return scanner.nextDouble();
    }
}

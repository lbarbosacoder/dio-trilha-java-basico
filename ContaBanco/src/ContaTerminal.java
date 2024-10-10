import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = sc.next();
        System.out.println("Por favor, digite o número da Agencia!: ");
        String numeroAgencia = sc.next();
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("por favor, deposite um novo saldo: ");
        Double saldo = sc.nextDouble();
    }
}

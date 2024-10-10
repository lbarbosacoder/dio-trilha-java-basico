import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = sc.next();
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Por favor, digite o número da Agencia!: ");
        String numeroAgencia = sc.next();
        System.out.print("por favor, deposite um novo saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

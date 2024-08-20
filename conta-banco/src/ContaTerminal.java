import java.util.Scanner;

public class ContaTerminal {
    

    public static void main(String[] args) {
        
@SuppressWarnings("resource")
Scanner scanner = new Scanner(System.in);

{

}

System.out.print("Por favor, digite o número da Agência: ");
        
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o número da Conta: ");
        int Conta = scanner.nextInt();
       
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

       


        
       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
       nome, agencia, Conta, saldo);
} 
    }

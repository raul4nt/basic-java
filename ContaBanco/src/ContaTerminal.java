import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário 

        //Obter pela scanner os valores digitados no terminal 

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("Digite sua agência: ");

        String agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");

        int numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo: ");

        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!");

        

    }
}

import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		
		 // Criando as vari�veis para a conta banco
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        // Criando o Scanner
        Scanner entrada = new Scanner(System.in);

        // Utilizando o Scanner para ler as informa��es
        System.out.print("Ol�, Seja bem-vindo! Por favor digite seu nome : ");
        nomeCliente = entrada.next();

        System.out.print(nomeCliente + ", digite o n�mero da sua ag�ncia, por favor: ");
        agencia = entrada.next();

        System.out.print("Perfeito, agora digite o n�mero da sua conta, por favor: ");
        numero = entrada.nextInt();

        System.out.print("Obrigado, " + nomeCliente + ", agora digite o valor que quer como primeiro dep�sito: ");
        saldo = entrada.nextFloat();

        System.out.println();

        // Saida final do programa
        System.out.println("Ol� " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua ag�ncia � " +
                agencia + ", conta " + numero + " e seu saldo de " + saldo + " j� est� dispon�vel para saque.");
        
        entrada.close();
	}

}

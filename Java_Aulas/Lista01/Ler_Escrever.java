import java.util.Scanner;
import java.util.InputMismatchException;

class Ler_Escrever{

    public static void main (String [] args){
        String nome;
        int idade;
        double saldo;
        boolean premium;

        Scanner sc = new Scanner(System.in); // Para fazer a leitura dos dados de entrada

        //Impressão do texto
        System.out.println("Ola, tudo bem? Seja bem-vinda");

        //Leitura do nome
        System.out.println("Digite seu nome:");
        nome = sc.nextLine(); // Saída do nome

        //Leitura da idade
        System.out.println("Digite sua idade:");
        //sidade = sc.nextInt();
        idade = sc.nextInt();

        //Leitura do saldo
        System.out.println("Digite seu saldo:");
        saldo = sc.nextDouble();

        //Leitura do premium 
        System.out.println("Digite se e premium; (T para Sim e F para não");
        premium = sc.nextBoolean();

        //PAra imorimir todos os dados obtidos
        System.out.println("Seu dados:");
        System.out.println("Seu nome:" + nome);
        System.out.println("Sua idade:" + idade);
        System.out.println("Seu saldo:" + saldo);
        System.out.println(" Situação:" + premium);


        //Fechar o scanner
       // sc.close();
       

    }
}
import java.util.Scanner;

class Ex17 {

   // Faça um programa que leia uma frase e substitua todas asocorrências de uma letra por outra letra.
   // A frase original e asletras a serem substituídas devem ser lidas do usuário

   public static void main (String [] args){

    Scanner sc = new Scanner (System.in);

    String fraseOriginal;
    String novaFrase;
    char letraNova;
    char letraAntiga;

    System.out.println("Escreva a frase original:");
    fraseOriginal = sc.nextLine();

    System.out.println("Escreva a letra para ser substituida:");
    letraAntiga = sc.nextLine().charAt(0);

    System.out.println("Escreva a nova letra:");
    letraNova = sc.nextLine().charAt(0);

    novaFrase = fraseOriginal.replace(letraAntiga,letraNova);

    System.out.println("A Frase ficou:" + novaFrase);


   }

}

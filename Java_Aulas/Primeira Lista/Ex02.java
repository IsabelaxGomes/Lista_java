import java.util.Scanner;
class Ex02{

    public static void main (String [] args){

        //FAÇA UM PROGRAMA QUE LEIA DOIS NÚMEROS INTEIROS E IMPRIMA QUAL É
        // O NÚMERO MAIOR. SE OS NÚMEROS FOREM IGUAIS, IMPRIMA "NÚMEROS IGUAIS"

        int numero01;
        int numero02;


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        numero01 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        numero02 = sc.nextInt();

        if(numero01 < numero02){
            System.out.println("O numero maior é o segundo");

        }else if(numero01 > numero02){
            System.out.println("O numero maior e o primeiro");
        }else if(numero01 == numero02){
            System.out.println("Os numeros sao iguais");
        }




    }
}
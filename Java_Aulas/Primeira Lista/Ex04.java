 import java.util.Scanner;
 class Ex04 {


    //Faça um programa que leia a idade de uma pessoa e verifique se ela já pode votar
    //Caso possa, imprima "Voce pode votar", caso contrario "Voce ainda não pode votar"


    public static void main (String [] args){

        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = sc.nextInt();

        if(idade < 16){
            System.out.println("Voce nao pode votar");
        }else if(idade > 16 || idade == 16){
            System.out.println("Voce pode votar");

        }
        

    }
    
}

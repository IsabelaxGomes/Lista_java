import java.util.Scanner;
class Ex01 {

    //Escreva um programa que receba um  número inteiro da entrada padrão e imprime
    // a tabuada de multiplicação deste número até 10

    public static void main (String [] args){

        int numero;
        

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Escreva um número inteiro");
        numero = sc.nextInt();

        for(int i= 0; i<10; i++){
            i = numero * 10;
            System.out.println(i);

        }



    }

}
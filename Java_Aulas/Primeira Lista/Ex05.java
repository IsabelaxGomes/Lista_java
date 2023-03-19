import java.util.Scanner;
class Ex05 {
    
    //Faça um programa que leia um número inteiro e verificque se ele e impar ou par. Se for ímpar imprima
    // o numero é ímpar, caso contrario o numero é par

    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
       int numero;

       System.out.println("Digite o numero:");
       numero = sc.nextInt();

       if(numero % 2 == 0){
        System.out.println("O numero e par");

       }else{
        System.out.println("O numero e impar");
       }

        


        
    }
}

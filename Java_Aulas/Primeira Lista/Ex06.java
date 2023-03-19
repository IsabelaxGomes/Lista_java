 import java.util.Scanner;
 class Ex06 {

    // Faça um programa que leia um número inteiro e verifique se ele é positivo, negativo ou zero.
    // Se for positivo, imprima "O
    //número é positivo". Se for negativo, imprima "O número énegativo". Se for zero, imprima "O número é zero".

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite o numero:");
        numero = sc.nextInt();
        
        //if(numero == 0){
        //    System.out.println("O numero e igual a 0.");
        if(numero > 0){
            System.out.println("O numero e positivo");
        }else if(numero < 0){
            System.out.println("O numero e negativo");
        }else{
            System.out.println("O numero e igual a 0.");
        }



    }

    
}

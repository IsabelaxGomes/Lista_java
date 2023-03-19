 import java.util.Scanner;
 class Ex07 {


    //Faça um programa que leia uma nota de 0 a 10 e imprima se o aluno foi aprovado ou reprovado. 
    // A nota mínima paraaprovação é 6. Se a nota for maior ou igual a 6, imprima "Alunoaprovado".
    // Caso contrário, imprima "Aluno reprovado"

    public static void main (String [] args){

        int nota;

        Scanner sc = new Scanner (System.in);

        System.out.println("Informe a nota (0 - 10):");
        nota = sc.nextInt();

        if (nota > 6){
            System.out.println("Aluno Aprovado");
            
        }else if( nota < 6){
            System.out.println("Aluno reprovado");
        }
        


    }
    
}

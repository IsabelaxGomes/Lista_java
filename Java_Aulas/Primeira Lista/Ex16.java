 import java.util.Scanner;
 class Ex16 {

// Faça um programa que leia duas palavras e verifique se elassão iguais. Se forem iguais, imprima "As palavras são iguais".Caso contrário,
// imprima "As palavras são diferentes


    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);

        String palavra01;
        String palavra02;

        System.out.println("Infomre a palavra 01:");
        palavra01 = sc.nextLine();

        System.out.println("Infome a palavra 02");
        palavra02 = sc.nextLine();

        if (palavra01.equals(palavra02)) {
            System.out.println("As palavras são iguais");
        } else {
            System.out.println("As palavras são diferentes");
        }
    
    }
    
}

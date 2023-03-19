import java.util.Scanner;
class Ex01{

    public static void main (String [] args){

        String frase02;
        
        //Crie um programa que imprima a mensagem "Porque me acordou?"
        // "Programa feito por mim" e "Ele imprime + que duas linhas"

        Scanner sc = new Scanner(System.in);

        System.out.println("Porque me acordou?");

        System.out.println("Qual a segunda frase:");
        frase02 = sc.nextLine();
        System.out.println("A segunda frase:" + frase02);

        System.out.println("Programa feito por mim e Ele imprime + que duas linhas");

        
    }
}
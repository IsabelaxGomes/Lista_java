import java.util.Scanner;

class Ex15 {

    //Faça um programa que leia uma palavra e imprima a mesmapalavra invertida.

    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        String palavra;
        String palavraInvertida = "";//recebendo o valor vazio

        System.out.println("Digite uma palavra");
        palavra = sc.nextLine();

        
        for (int i = palavra.length() - 1; i >= 0; i--) {// vindo da direita para esquerda
            palavraInvertida += palavra.charAt(i);
        }

        System.out.printf("A palavra invertida:"+ palavraInvertida);


    }
    
}

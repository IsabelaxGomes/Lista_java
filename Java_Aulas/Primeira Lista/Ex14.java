 import java.util.Scanner;
 class Ex14 {
    

    //Faça um programa que leia uma frase e conte quantasvogais (a, e, i, o, u) ela possui
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        String frase;
       
        int contador = 0;

        System.out.println("Escreva uma frase");
        frase = sc.nextLine();

        for(int i = 0; i<frase.length(); i++){
            char vogais = frase.charAt(i);// retorna na posição i

            if (vogais == 'a' || vogais =='A' 
            ||vogais == 'e' || vogais =='E'
            || vogais == 'i' || vogais =='I'
            || vogais == 'o' || vogais =='O'
            || vogais == 'u' || vogais =='U'  ){
                contador++;
                

                

            }
        }
    

        System.out.println("A quantidade de vogais é:" +contador);
    }
}

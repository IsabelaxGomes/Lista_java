import java.util.Scanner;

class Ex02 {


    //Escreva um programa que receba vários números inteiros do usuário até que ele 
    //digite um número negativo. Então imprima a soma destes números
    
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        int numeroRecebido;
        int soma = 0;

 do{
        
        System.out.println("Digite o número:");
        numeroRecebido = sc.nextInt();

          if(numeroRecebido >= 0){
            soma += numeroRecebido;
        
          }
    }while (numeroRecebido >= 0); //Quadno ele receber o número negativo ele vai imprimir a soma
    System.out.println("A soma dos números digitados é:" + soma);

        //do-while é uma estrutura de controle de fluxo em linguagens de programação que é utilizada 
        //para executar um bloco de código repetidamente enquanto uma condição for verdadeira.

        //do {
        // bloco de código
        //} while (condição);

        // Se a condição for verdadeira, o bloco de código é executado novamente. Isso continua 
        //até que a condição seja falsa.

}
}

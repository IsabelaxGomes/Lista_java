import java.util.Scanner;
class Ex04 {

    //Crie um vetor de números inteiros com 5 posições e preencha-o com números digitados pelo usuário. Em seguinda imprima o vetor.

    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        int [] vetor = new int [5];

        for (int i = 0; i <vetor.length; i++){
            System.out.println("Digite a posição:" + i);
            vetor[i] = sc.nextInt();
        }
        System.out.print("Vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


        //A criação de um vetor com números inteiros e 5 posições
        //o laço for para percorrer todas as posições do vetor
        // o usuário vai digitar as 5 posições
        // o segundo laço for vai ser para imprimir os valores do vetor na tela
        // Para cada valor do vetor, verificamos se é o último valor, se não for, imprime uma virgula e um espaço do valor
        // Finaliza a impressão do vetor com um colchete fechado
        


    }

}

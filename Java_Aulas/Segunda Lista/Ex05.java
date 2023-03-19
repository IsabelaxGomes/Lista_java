import java.util.Random;
import java.util.Scanner;


class Ex05 {


    // Crie um vetor de números inteiros com 10 posições e preencha-o com 
    //números aleatórios entre 1 e 100(classe Random), e imprima
    // o vetor e o maior número encontrado


    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        Random random = new  Random();
        
          int [] vetor = new int [10];
          int maiorVetor = vetor[0];

          for (int i = 0; i <vetor.length; i++){
            vetor[i] = random.nextInt(100) +1;
           
            
        }


        System.out.print("Vetor: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
            if (vetor[i]> maiorVetor){
                maiorVetor = vetor[i];

            }
        }
        System.out.println("]");

        System.out.println("O maior número é:" + maiorVetor);

        //Para cada posição do vetor, geramos um número aleatório entre 1 e 100 (inclusive) 
        //utilizando o método nextInt da classe Random, e guardamos o valor na posição correspondente do vetor.
        //Utilizamos outro laço for para imprimir os valores do vetor na tela.
        //Para cada valor do vetor, verificamos se é o último valor. Se não for, imprimimos uma vírgula e um espaço depois do valor.
        //Verificamos se o valor atual do vetor é maior que o valor da variável maior. Se for, atualizamos a variável maior com o valor atual do vetor.
    }
    
}

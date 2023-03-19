 import java.util.Scanner;



 class Ex06 {

    
    public static void main (String[]args){


        Scanner sc = new Scanner (System.in);

        double media =0;

        int [] vetor = new int [10];


        //O usuário está passando os números e recebendo

        for (int i = 0; i <10; i++){
            System.out.println("Digite a posição:" + i);
            vetor[i] = sc.nextInt();
        }
        //  imprimindo o vetor

        System.out.print("Vetor: [");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // calculando a média aritmética dos números no vetor

        for (int i =0; i<vetor.length; i++){
            media += vetor[i];
        }
        
        media /= 10;
        
        //imprimir a média aritmética
        System.out.println("A média aritmédica é:" + media);


    }
}

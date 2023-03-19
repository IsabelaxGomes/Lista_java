 import java.util.Scanner;
 class Ex09 {

    //Crie um programa que leia as notas A1 e A2 do usuário eimprima “Passou com X” ou “Reprovou com X”, onde X é o valorda nota final desse aluno.
     //● A nota final é a média das notas A1 e A2●
     // A nota final é arredondada, de acordo com sua partedecimal.
     //● Se a parte decimal for menor que 25: Ex. 7.24, a nota éarredondada para baixo - 7
     //● Se a parte decimal estiver entre 25 e 74, ela éarredondada para 50: Ex. 7.63 -> 7.5
     //● Se a parte decimal for 75 ou mais, a nota é arredondadapara cima: 7.80 -> 8

    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);

        int notaA1;
        int notaA2;
        double notaFinal;
        int notaInteira;
        double parteDecimal;
    
        System.out.println("Digite a nota A1:");
        notaA1 = sc.nextInt();

        System.out.println("Digite a nota A2");
        notaA2 = sc.nextInt();

        notaFinal = notaA1 + notaA2 /2;
        parteDecimal = notaFinal * 100;
        notaInteira= (int) notaFinal;

        //Arrendodamento da nota

        if (parteDecimal <25){
            notaFinal = notaInteira;

        }else if(parteDecimal <75){

            notaFinal =notaInteira + 0.5;
        }else{
            notaFinal = notaA2 +1.0;
        }
        
        //Aluno Aprovado ou Reprovado
        if(notaFinal >= 6.0){
            System.out.println("Aluno aprovado com nota:" + notaFinal);


        }else{
            System.out.println("Aluno reprovado com nota:" + notaFinal);
        }





    }
    
}

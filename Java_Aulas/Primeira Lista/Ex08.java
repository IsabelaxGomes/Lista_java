import java.util.Scanner;
class Ex08 {
    
    // Crie um programa com duas variáveis inteiras (a e b). 
    //Esse programa deve imprimir a soma, a subtração, a multiplicação ea divisão dessas variáveis. 
    //Cada resultado deve vir em umalinha distinta.

    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);

        int a;
        int b;
        double resultado;

        System.out.println("Informe o numero A:");
        a = sc.nextInt();

        System.out.println("Informe o numero B:");
        b = sc.nextInt();
        
        resultado = a + b;
        System.out.println("O resultado da SOMA:" + resultado);

        resultado = a - b;
        System.out.println("O resultado da SUBTRACAO:" + resultado);

        resultado = a / b;
        System.out.println("O resultado da DIVISAO:" + resultado);
        



    }

}

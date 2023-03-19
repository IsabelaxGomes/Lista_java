 import java.util.Scanner;
 class Ex03 {

    // Receba um número inteiro do usuário e imprima se ele é primo ou não


    public static void main (String []args){

        int numRecebido;
        boolean numPrimo;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número:");
        numRecebido = sc.nextInt();

        if(numRecebido <= 1){
           numPrimo = false;
           System.out.println("Esse número não é primo;");

        }else{
            for(int i =2; i<= Math.sqrt(numRecebido); i++){
                if(numRecebido % i == 0){
                    numPrimo = false;
                    break;
                    
                }
            }
            System.out.println("Ele  é primo");
        }

        

    }
    
}

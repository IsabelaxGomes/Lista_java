import java.util.Scanner;

class Ex12 {


    // Escreva um programa que receba um nome, um número eum booleano. Se o booleano for verdadeiro, ou o nome for“Carla” e número for menor que 50, imprima o valor 42. 
    //Casocontrário, peça para o usuário informar a placa de seu carro. Sea placa tiver um 5, imprima 42, senão peça o cpf do usuário eimprima: “Novo cadastro realizado”

    public static void  main(String [] args){

        String nome, placa;
        int numero, cpf;
        boolean booleano;

        Scanner sc = new Scanner (System.in); //scanner da variavél 

        System.out.println("Informe o nome:");
        nome = sc.nextLine();

        System.out.println("Informe o número");
        numero = sc.nextInt();

        System.out.println("Digite o booleano (True/False)");
        booleano = sc.nextBoolean();

        if ((booleano == true) || (nome.equals("Carla") && (numero <50)))
        {
            System.out.println("42");
        }else{
            System.out.println("Informe a placa do carro:"); //getLine tem que ser aplicado, mas  professor não explicou 
            placa = sc.nextLine();

          if(placa.contains("5")){
            System.out.println("42");
          }else{
            System.out.println("Informe o CPF:");
            cpf = sc.nextInt();
            System.out.println("novo cadastro realizado");
          }
        } 




    }
    
}

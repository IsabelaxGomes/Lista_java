import java.util.Scanner;
import java.util.InputMismatchException;
class Ex03{

    //Considerando os tipos de dados em Java, escolha o tipo de dado ou classe  mais adquado para representar
    // número de municípios no Brasil
    // nome de um estado no Brasil
    // a população de um estado do Brasil
    // a área do Brasil em quilometros quadrados
    // a população toda do mundo
    // o cep de um endereço no Brasil
    // o nome de uma rua no Brasil



    public static void main (String [] args){

    int numeroMunicipios;
    String nomeEstado;
    int populacaoBrasil;
    double areaBrasil;
    int populacaoMundo;
    int cep;
    String endereco;
        
    
    Scanner sc = new Scanner(System.in);


        System.out.println("Digite o numero de municipios no Brasil:");
        numeroMunicipios = sc.nextInt();

        System.out.println("Digite o nome de um estado no Brasil:");
        nomeEstado = sc.nextLine();

        System.out.println("Digite o numero da populacao do Brasil");
        populacaoBrasil = sc.nextInt();

        System.out.println("Digite a area do Brasil:");
        areaBrasil = sc.nextDouble();

        System.out.println("Digite a populacao do Mundo");
        populacaoMundo = sc.nextInt();

        System.out.println("Digite algum cep (somente numeros):");
        cep = sc.nextInt();

        System.out.println("Digite um endereço:");
        endereco = sc.nextLine();

        sc.close();

        System.out.println("O numero de municipios no Brasil:" + numeroMunicipios);
        System.out.println("O nome de um estado no Brasil:" + nomeEstado);
        System.out.println("O numero da populacao do Brasil" + populacaoBrasil);
        System.out.println("A area do Brasil é: " + areaBrasil);
        System.out.println("A populacao do Mundo" + populacaoMundo);
        System.out.println("O cep é:" + cep);
        System.out.println("O endereco e:" + endereco);




        




    }
}
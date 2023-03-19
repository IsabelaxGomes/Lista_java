public class Strings{

    public static void main (String [] args){
        String minhaString = "Oi, tudo bem?";

        //Para imprimir a string 
        System.out.println(minhaString);

        //Para mostar o tamanho da String
        System.out.println (minhaString.length());

        //Mostrar um pedaco da string - dos caracteres 2 e 4
        System.out.println(minhaString.substring(4));

        /* Deixa maiuscula */
        System.out.println(minhaString.toUpperCase());

        /* Deixa minusscula */
        System.out.println(minhaString.toLowerCase());
    }
}
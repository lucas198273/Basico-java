package estudo.exerciciosArray;

import java.util.Scanner;

public class Ex2_Consoantes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
     // O vertor String tem pode armazernar 6 elementos

        int quantidadeConsoantes = 0;

        int count = 0;

        do{
           System.out.println("Letra: ");
           String letra = scan.next();

           if ( !(letra.equalsIgnoreCase("a")|
                letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o")|
                letra.equalsIgnoreCase("u"))){
            
                    consoantes[count]=letra;
                    quantidadeConsoantes++;
           }
           count++;
         }while(count < consoantes.length);
        }
        

    
}

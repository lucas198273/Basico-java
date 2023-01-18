package estudo.exerciciosloops;

import java.util.Scanner;

public class EX2_nota {
    public static void main( String [] args){
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();
        


        while(nota == 00){
            System.out.println(999);
            System.out.println("vamos atualizar o valor ");
            nota = scan.nextInt();

            System.out.println("valor atualizado: "+nota);
        }
        while(nota < 0 | nota > 10){

            System.out.println("Nota invalida! Digite novamente");
            nota = scan.nextInt();
        }
        System.out.println("Nota foi aceita");
        
    }
}
